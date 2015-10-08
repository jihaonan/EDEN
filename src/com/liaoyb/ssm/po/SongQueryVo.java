package com.liaoyb.ssm.po;

import java.util.List;

/**
 * 查询歌曲
 * 查询条件
 * @author Liao-Pc
 *
 */
public class SongQueryVo {

	private Song song;
	
	//根据，比如id,歌名等
	private SongCustom songCustom;
	
	//根据歌手id,歌手名字
	private ArtistCustom artistCustom;
	
	//可以进行批量插入
	private List<SongCustom> songCustomlist;

	public Song getSong() {
		return song;
	}

	public void setSong(Song song) {
		this.song = song;
	}

	public SongCustom getSongCustom() {
		return songCustom;
	}

	public void setSongCustom(SongCustom songCustom) {
		this.songCustom = songCustom;
	}

	public ArtistCustom getArtistCustom() {
		return artistCustom;
	}

	public void setArtistCustom(ArtistCustom artistCustom) {
		this.artistCustom = artistCustom;
	}

	public List<SongCustom> getSongCustomlist() {
		return songCustomlist;
	}

	public void setSongCustomlist(List<SongCustom> songCustomlist) {
		this.songCustomlist = songCustomlist;
	}
	
	//按地区(比如欧美、华语、日韩)
	
	
	//按风格、标签(轻音乐、流行、摇滚、民谣、电子、爵士、古典、清新、伤感、浪漫)
	
}
