package com.liaoyb.ssm.po;

import java.util.List;

public class SonglistCustom extends Songlist {
	//歌单中包含的音乐
	private List<SongCustom> songCustoms;
	
	//创建者
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<SongCustom> getSongCustoms() {
		return songCustoms;
	}

	public void setSongCustoms(List<SongCustom> songCustoms) {
		this.songCustoms = songCustoms;
	}


	
	
}
