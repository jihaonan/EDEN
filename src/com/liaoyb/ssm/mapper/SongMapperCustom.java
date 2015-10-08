package com.liaoyb.ssm.mapper;

import java.util.List;

import com.liaoyb.ssm.po.SongCustom;
import com.liaoyb.ssm.po.SongQueryVo;

public interface SongMapperCustom {
	
	//查询歌曲
	List<SongCustom> findsongs(SongQueryVo songQueryVo);
	
	//ArtistMapperCustom.xml中调用了它，来查找歌手的音乐
	List<SongCustom> findSongCustomsByArtistId(Integer artistid);
	
	//通过歌单id找到其中的歌曲
	List<SongCustom> findSongCustomsBySonglistId(Integer songlistid);
	
	//通过用户id找到他的播放列表
	List<SongCustom> findPlaylistByUserid(Integer userid);
	
	
	//按播放量排名
	List<SongCustom> findTopSongs(Integer num);
	
	
	//通过歌曲id找到对应的SongCustom
	SongCustom findSongCustomById(Integer id);
	
}
