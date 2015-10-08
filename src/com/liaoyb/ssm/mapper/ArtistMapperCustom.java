package com.liaoyb.ssm.mapper;

import java.util.List;

import com.liaoyb.ssm.po.Artist;
import com.liaoyb.ssm.po.ArtistCustom;
/**
 * 
 * @author Liao-Pc
 *
 */
public interface ArtistMapperCustom {
	List<ArtistCustom> findArtistCustomsBySongId(Integer songid);
	List<Artist> findArtistBySongId(Integer songid);
	
	//
	ArtistCustom findArtistCustomByid(Integer id);
}
