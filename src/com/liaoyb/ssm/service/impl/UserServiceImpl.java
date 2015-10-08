package com.liaoyb.ssm.service.impl;

import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liaoyb.ssm.exception.CustomException;
import com.liaoyb.ssm.exception.UserHasExitException;
import com.liaoyb.ssm.mapper.SongMapper;
import com.liaoyb.ssm.mapper.SongMapperCustom;
import com.liaoyb.ssm.mapper.SongUserMapper;
import com.liaoyb.ssm.mapper.SonglistMapper;
import com.liaoyb.ssm.mapper.UserMapper;
import com.liaoyb.ssm.mapper.UserMapperCustom;
import com.liaoyb.ssm.page.po.PageMusic;
import com.liaoyb.ssm.page.po.PagePlayList;
import com.liaoyb.ssm.po.Artist;
import com.liaoyb.ssm.po.Song;
import com.liaoyb.ssm.po.SongCustom;
import com.liaoyb.ssm.po.SongUser;
import com.liaoyb.ssm.po.SongUserExample;
import com.liaoyb.ssm.po.Songlist;
import com.liaoyb.ssm.po.User;
import com.liaoyb.ssm.po.UserCustom;
import com.liaoyb.ssm.po.UserExample;
import com.liaoyb.ssm.service.UserService;
import com.liaoyb.util.MD5;



//"save*" "delete*" "insert*" "update*" 
//"find*" "get*""select*" 
@Service("userService")
//把这个类交给spring管理，作为服务了。
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapperCustom userMapperCustom;
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private SongMapperCustom songMapperCustom;
	
	
	@Autowired
	private SonglistMapper songlistMapper;
	@Autowired
	private SongMapper songMapper;
	
	@Autowired
	private SongUserMapper songUserMapper;
	

	//登陆失败，抛出异常(密码错误，或用户不存在)，controller中已经校验过了，不能为空
	@Override
	public UserCustom select_login(User user) throws Exception {
		UserExample userExample=new UserExample();
		UserExample.Criteria criteria=userExample.createCriteria();
		if(user.getUsername()!=null){
			criteria.andUsernameEqualTo(user.getUsername());
		}else if(user.getEmail()!=null){
			criteria.andEmailEqualTo(user.getEmail());
		}else{
			//邮箱和用户名都为空
//			返回null
			return null;
		}
		
		//查找出user
		List<User> userSel=userMapper.selectByExample(userExample);
		if(userSel==null||userSel.size()==0){
			//用户不存在,返回null
			return null;
		}
		if(userSel.size()>1){
			//发生同名错误，不允许的，程序设计问题
			throw new CustomException("发生同名错误，不允许的，程序设计问题");
		}
		//取第一个，也只有一个，
		User userFil=userSel.get(0);
		//用户的密码经过md5匹配
		
		if(!MD5.checkpassword(user.getPassword(), userFil.getPassword())){
			//密码错误,返回null
			return null;
		}
		
		//登陆成功，返回UserCustom,通过userid找，要再进行高级查询
		
		return userMapperCustom.findUserCustomById(userFil.getId());
	}


	
	//这个只是往user表中添加一行，不执行其它的
	@Override
	public void insert_addUser(User user) throws Exception {
		
		//这里要要返回自动生成的主键
		userMapperCustom.insertSelectiveReturnId(user);
		
	}


		//注册失败，抛出异常
		//注册用户时,会生成一个默认的songlist歌单,即----我喜欢(like)
		//初始化一些东西,密码进行md5编码
	@Override
	public void save_register(User user) throws Exception {
		//验证用户是否存在，存在，抛异常
		if(select_ifuserExist(user)){
			throw new UserHasExitException();
		}
		
		user.setPassword(MD5.EncoderByMd5(user.getPassword()));
		insert_addUser(user);
		
		//初始化like歌单
		Songlist like=new Songlist();
		like.setListname("like");
		like.setListinfo("我喜欢");
		//
		like.setUserid(user.getId());
		songlistMapper.insertSelective(like);
		
		
	}


	//用户播放列表
	@Override
	public List<SongCustom> get_UsersPlaylist(User user) throws Exception {
		return songMapperCustom.findPlaylistByUserid(user.getId());
	}


	//从用户播放列表中移除歌曲
	@Override
	public void delete_removeFormPlaylist(User user,Song song) throws Exception {
		
		SongUserExample songUserExample=new SongUserExample();
		SongUserExample.Criteria criteria=songUserExample.createCriteria();
		criteria.andSongidEqualTo(song.getId());
		criteria.andUseridEqualTo(user.getId());
		songUserMapper.deleteByExample(songUserExample);
	}


	//添加音乐到播放列表(不能重复添加，如果重复，返回false,添加成功返回true)
	@Override
	public boolean insert_addToPlaylist(User user,Song song) throws Exception {
		
		//先判断是否重复
		SongUserExample songUserExample=new SongUserExample();
		SongUserExample.Criteria criteria=songUserExample.createCriteria();
		criteria.andSongidEqualTo(song.getId());
		criteria.andUseridEqualTo(user.getId());
		List<SongUser> songUsers=songUserMapper.selectByExample(songUserExample);
		
		if(songUsers!=null&&songUsers.size()>0){
			//已经存在，返回false
			return false;
			
		}
		
		
		SongUser songUser=new SongUser();
		songUser.setSongid(song.getId());
		songUser.setUserid(user.getId());
		songUserMapper.insertSelective(songUser);
		return true;
		
	}


	//验证用户名或邮箱是否存在，是否已经注册过了
	@Override
	public boolean select_ifuserExist(User user) throws Exception {
		UserExample userExample=new UserExample();
		UserExample.Criteria criteria=userExample.createCriteria();
		if(user.getUsername()!=null&&user.getUsername().trim()!=""){
			criteria.andUsernameEqualTo(user.getUsername());
		}
		if(user.getEmail()!=null&&user.getEmail().trim()!=""){
			criteria.andEmailEqualTo(user.getEmail());
		}
		
		List<User>users=userMapper.selectByExample(userExample); 
		if(users!=null&&users.size()>0){
			//已经存在
			return true;
		}
		
		return false;
	}


	//返回播放列表为json数据
	@Override
	public String gainPagePlayListJson(PagePlayList pagePlayList) throws Exception {
		//jackjson
		ObjectMapper mapper = new ObjectMapper(); 
		return mapper.writeValueAsString(pagePlayList.getPagemusics());
	}


	//返回播放列表Page的pojo
	@Override
	public PagePlayList gainPagePlayList(User user) throws Exception {
		
		//先拿到用户的播放列表
		List<SongCustom> songCustoms=get_UsersPlaylist(user);
		PagePlayList pagePlayList=new PagePlayList();
		
		for(SongCustom songCustom:songCustoms){
			PageMusic pageMusic=new PageMusic();
			pageMusic.setTitle(songCustom.getSongtitle());
			pageMusic.setMp3(songCustom.getMusicCustom().getUrl());
			if(songCustom.getImgCustom()!=null){
				pageMusic.setPoster(songCustom.getImgCustom().getUrl());
			}
			
			//可能有多个歌手
			if(songCustom.getArtists()!=null){
				String name="";
				int index=0;
				for(Artist artist:songCustom.getArtists()){
					if(index==0){
						name+=artist.getName();
					}else{
						name+="&&"+artist.getName();
					}
					index++;
				}
				pageMusic.setArtist(name);
			}
			
			pagePlayList.getPagemusics().add(pageMusic);
		}
		
		return pagePlayList;
	}



	
	//某首歌是否被用户收藏,底层还没写，先返回false;
	//先判断用户是否为空，空，返回false;
	@Override
	public boolean isCollect(User user,Song song) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}
