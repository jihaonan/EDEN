package com.liaoyb.ssm.po;

import java.util.List;

public class UserCustom extends User {
	//头像
	private ImgCustom avatars;
	
	//用户自己创建的的歌单
	private List<SonglistCustom> ownSonglists;
	
	//收藏的歌单
	private List<SonglistCustom> collectSonglists;
	
	//用户的播放列表
	private List<SongCustom>playlist;
	
	

	public ImgCustom getAvatars() {
		return avatars;
	}

	public void setAvatars(ImgCustom avatars) {
		this.avatars = avatars;
	}

	public List<SonglistCustom> getOwnSonglists() {
		return ownSonglists;
	}

	public void setOwnSonglists(List<SonglistCustom> ownSonglists) {
		this.ownSonglists = ownSonglists;
	}

	public List<SonglistCustom> getCollectSonglists() {
		return collectSonglists;
	}

	public void setCollectSonglists(List<SonglistCustom> collectSonglists) {
		this.collectSonglists = collectSonglists;
	}

	public List<SongCustom> getPlaylist() {
		return playlist;
	}

	public void setPlaylist(List<SongCustom> playlist) {
		this.playlist = playlist;
	}
	
}
