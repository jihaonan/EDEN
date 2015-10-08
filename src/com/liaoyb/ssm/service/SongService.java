package com.liaoyb.ssm.service;

import java.util.List;

import com.liaoyb.ssm.page.po.PageDiscover;
import com.liaoyb.ssm.page.po.PageNewSongs;
import com.liaoyb.ssm.page.po.PageTops;
import com.liaoyb.ssm.po.Song;
import com.liaoyb.ssm.po.SongCustom;
import com.liaoyb.ssm.po.User;

public interface SongService {
		//所有歌曲
		List<SongCustom> findAllSong() throws Exception;
		
		//分页查询
		List<SongCustom> findAllSongUsePaging(int pageNumber,int pageSize) throws Exception;
		
		//所有歌曲数量
		int findcountSong() throws Exception;
		
		
		//得到PageDiscover,user和是否添加到收藏有关，如果user为null,是否收藏为false
		public   PageDiscover gainPageDiscover(User user,int pageSize,int pageNumber)throws Exception;
		
		//得到某首歌曲的星级
		public int gainSongstar_num(Song song) throws Exception;
		
		
		//得到总页数
		public int gainPageCount(int pageSize) throws Exception ;
		
		//得到disvoer的json数据
		public String gainPageDiscoverJson(PageDiscover discover) throws Exception;
		
		
		//要获取前几首歌曲(按播放量)
		public PageTops gainPageTops(int count) throws Exception;
		public String gainPageToplistJson(PageTops pageTops)throws Exception;
		
		
		//获取最新歌曲
		public PageNewSongs gainPageNewSongs(int count) throws Exception;
		public String gainPageNewSonglistJson(PageNewSongs newSongs) throws Exception;
		
		
}
