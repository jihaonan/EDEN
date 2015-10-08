package com.liaoyb.ssm.mapper;

import java.util.List;

import com.liaoyb.ssm.po.SonglistCustom;

public interface SonglistMapperCustom {
	
	//根据用户id找到他创建的所有歌单
	List<SonglistCustom> findCreateSonglistsByUserid(Integer userid);
	
	//根据用户id找到他收藏的所有歌单
	List<SonglistCustom> findCollectSonglistByUserid(Integer userid);
	


}
