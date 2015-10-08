package com.liaoyb.ssm.po;

import java.util.List;

public class ArtistCustom extends Artist {
	//歌手发布的音乐
	private List<SongCustom> songCustoms;
	
	//歌手头像
	private Img  avatar;
	
	
	public Img getAvatar() {
		return avatar;
	}

	public void setAvatar(Img avatar) {
		this.avatar = avatar;
	}

	public List<SongCustom> getSongCustoms() {
		return songCustoms;
	}

	public void setSongCustoms(List<SongCustom> songCustoms) {
		this.songCustoms = songCustoms;
	} 
	
}
