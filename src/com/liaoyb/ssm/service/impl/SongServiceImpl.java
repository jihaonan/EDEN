package com.liaoyb.ssm.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liaoyb.ssm.mapper.ArtistMapperCustom;
import com.liaoyb.ssm.mapper.SongMapper;
import com.liaoyb.ssm.mapper.SongMapperCustom;
import com.liaoyb.ssm.page.po.PageDiscover;
import com.liaoyb.ssm.page.po.PageDiscoverItem;
import com.liaoyb.ssm.page.po.PageNewSongItem;
import com.liaoyb.ssm.page.po.PageNewSongs;
import com.liaoyb.ssm.page.po.PageTopItem;
import com.liaoyb.ssm.page.po.PageTops;
import com.liaoyb.ssm.po.Artist;
import com.liaoyb.ssm.po.ArtistCustom;
import com.liaoyb.ssm.po.Song;
import com.liaoyb.ssm.po.SongCustom;
import com.liaoyb.ssm.po.SongExample;
import com.liaoyb.ssm.po.User;
import com.liaoyb.ssm.service.SongService;
import com.liaoyb.ssm.service.UserService;
@Service("songService")
public class SongServiceImpl implements SongService {
	
	@Autowired
	private SongMapper songMapper;
	@Autowired
	private SongMapperCustom songMapperCustom;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private ArtistMapperCustom artistMapperCustom;
	
	
	
//所有歌曲（慎用，可能数据很多）
	@Override
	public List<SongCustom> findAllSong() throws Exception{

		return songMapperCustom.findsongs(null);
	}

	//分页
	@Override
	public List<SongCustom> findAllSongUsePaging(int pageNumber, int pageSize) throws Exception {
		PageHelper.startPage(pageNumber,pageSize);
		List<SongCustom> songCustoms=songMapperCustom.findsongs(null);
		//用PageInfo对结果进行包装
		PageInfo<SongCustom> page = new PageInfo<SongCustom>(songCustoms);
		return page.getList();
		
	}


	@Override
	public int findcountSong() throws Exception{	
		return songMapper.countByExample(null);
	}

	
	
	//得到disvoer的json数据
	public String gainPageDiscoverJson(PageDiscover discover) throws Exception{
		ObjectMapper mapper = new ObjectMapper(); 
		return mapper.writeValueAsString(discover.getDiscoverItem());
		
	}
	
	//得到PageDiscover, 在外面调用部分要判断 pageNumber是否合法           user和是否添加到收藏有关，如果user为null,是否收藏为false
	@Override
	public  PageDiscover gainPageDiscover(User user,int pageSize,int pageNumber)throws Exception{
		
	PageDiscover discover=new PageDiscover();
		discover.setPageSize(pageSize);
		discover.setCurrentPage(pageNumber);
		//总共的页数
		discover.setPageCount(gainPageCount(pageSize));
		List<SongCustom> songCustoms=findAllSongUsePaging(pageNumber, pageSize);
		
		for(SongCustom songCustom:songCustoms){
			
			PageDiscoverItem discoverItem=new PageDiscoverItem();
			discoverItem.setTitle(songCustom.getSongtitle());
			if(songCustom.getMusicCustom()!=null){
				discoverItem.setMp3(songCustom.getMusicCustom().getUrl());
			}
			if(songCustom.getImgCustom()!=null){
				discoverItem.setPoster(songCustom.getImgCustom().getUrl());
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
				discoverItem.setArtist(name);
			}
			
			
			//是否被用户收藏
			discoverItem.setIscollect(userService.isCollect(user,songCustom));
			discoverItem.setPlaycount(songCustom.getPlaycount());
			
			
			//设置星级
			discoverItem.setStar_num(gainSongstar_num(songCustom));
			
			discover.getDiscoverItem().add(discoverItem);
			
		}
		
		
		
		
		return discover;
	}

	
	//得到歌曲的星级，还没写,先返回一个随机数
	@Override
	public int gainSongstar_num(Song song) throws Exception {
		Random random=new Random();
		return random.nextInt(5)+1;
	}

	
	//得到总页数
	@Override
	public int gainPageCount(int pageSize) throws Exception {
		return (int)((findcountSong()*1.0)/pageSize+0.5);
	}

	
	
	
	//要获取前几首歌曲(按播放量)
	@Override
	public PageTops gainPageTops(int count) throws Exception {
		PageTops pageTops=new PageTops();
		SongExample songExample=new SongExample();
//		asc  为升序排列，desc为降序排列。
		//还可以限制查询的数量
		songExample.setOrderByClause("playcount desc limit 0,"+count);
		SongExample.Criteria criteria=songExample.createCriteria();
		
		List<Song> songs=songMapper.selectByExample(songExample);
		
		for(int index=0;index<songs.size();index++){
			Song song=songs.get(index);
			//通过Song找到对应的SongCustom
			SongCustom songCustom=songMapperCustom.findSongCustomById(song.getId());
			songCustom.setRank(index+1);
			//生成PageTopItem
			PageTopItem topItem=new PageTopItem();
			topItem.setTitle(songCustom.getSongtitle());
			topItem.setRank(index+1);
			if(songCustom.getImgCustom()!=null){
				topItem.setPoster(songCustom.getImgCustom().getUrl());
			}
			topItem.setMp3(songCustom.getMusicCustom().getUrl());
			if(songCustom.getArtists()!=null&&songCustom.getArtists().size()>0){
				//艺术家
				Artist artist=songCustom.getArtists().get(0);
				//设置头像
				
				ArtistCustom artistCustom=artistMapperCustom.findArtistCustomByid(artist.getId());
				if(artistCustom.getAvatar()!=null){
					topItem.setArtistImg(artistCustom.getAvatar().getUrl());
				}
				
				
				topItem.setArtist(artist.getName());
			}
		
			
			pageTops.getTopItems().add(topItem);
		}
		
		//
		
		
		return pageTops;
	}

	
	//Top Songs中歌曲list的josn数据
	@Override
	public String gainPageToplistJson(PageTops pageTops) throws Exception {
		ObjectMapper mapper = new ObjectMapper(); 
		return mapper.writeValueAsString(pageTops.getTopItems());
	}

	
	
	
	
	//获取最新歌曲
	@Override
	public PageNewSongs gainPageNewSongs(int count) throws Exception {
		
		PageNewSongs newSongs=new PageNewSongs();
		SongExample songExample=new SongExample();
//		asc  为升序排列，desc为降序排列。
		//还可以限制查询的数量
		songExample.setOrderByClause("releasetime desc limit 0,"+count);
		SongExample.Criteria criteria=songExample.createCriteria();
		
		List<Song> songs=songMapper.selectByExample(songExample);
		
		for(int index=0;index<songs.size();index++){
			Song song=songs.get(index);
			//通过Song找到对应的SongCustom
			SongCustom songCustom=songMapperCustom.findSongCustomById(song.getId());
			songCustom.setRank(index+1);
			//生成PageNewSongItem
			PageNewSongItem newItem=new PageNewSongItem();
			newItem.setTitle(songCustom.getSongtitle());
			if(songCustom.getImgCustom()!=null){
				newItem.setPoster(songCustom.getImgCustom().getUrl());
			}
			newItem.setMp3(songCustom.getMusicCustom().getUrl());
			if(songCustom.getArtists()!=null&&songCustom.getArtists().size()>0){
				//艺术家
				Artist artist=songCustom.getArtists().get(0);
				//设置头像
				
				ArtistCustom artistCustom=artistMapperCustom.findArtistCustomByid(artist.getId());
				if(artistCustom.getAvatar()!=null){
					newItem.setArtistImg(artistCustom.getAvatar().getUrl());
				}
				
				
				newItem.setArtist(artist.getName());
			}
		
			
			newSongs.getNewSongsItems().add(newItem);
		}
		
		//
		
		
		return newSongs;
	}

	@Override
	public String gainPageNewSonglistJson(PageNewSongs newSongs)
			throws Exception {
		ObjectMapper mapper = new ObjectMapper(); 
		return mapper.writeValueAsString(newSongs.getNewSongsItems());
	}


}
