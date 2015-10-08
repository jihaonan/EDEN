package com.liaoyb.ssm.service;

import java.util.List;




import com.liaoyb.ssm.page.po.PagePlayList;
import com.liaoyb.ssm.po.Song;
//"save*" "delete*" "insert*" "update*" 
//"find*" "get*""select*" 
import com.liaoyb.ssm.po.SongCustom;
import com.liaoyb.ssm.po.User;
import com.liaoyb.ssm.po.UserCustom;

public interface UserService {
	
	public UserCustom select_login(User user) throws Exception;
	
	public void insert_addUser(User user) throws Exception;
	
	
	public void save_register(User user) throws Exception;
	
	
	//验证用户名或邮箱是否存在，是否已经注册过了
	
	public boolean select_ifuserExist(User user) throws Exception;
	
	//用户播放列表
	public List<SongCustom>get_UsersPlaylist(User user) throws Exception;
	
	//返回播放列表为json数据
	public String gainPagePlayListJson(PagePlayList pagePlayList) throws Exception;
	
	//返回播放列表Page的pojo
	public PagePlayList gainPagePlayList(User user)throws Exception;
	
	//从用户播放列表中移除歌曲
	public void delete_removeFormPlaylist(User user,Song song) throws Exception;
	
	//添加音乐到播放列表(不能重复添加，如果重复，抛异常)
	public boolean insert_addToPlaylist(User user,Song song) throws Exception;
	
	
	//某首歌是否被用户收藏
	public boolean isCollect(User user,Song song) throws Exception;
	
	
	
	
}
