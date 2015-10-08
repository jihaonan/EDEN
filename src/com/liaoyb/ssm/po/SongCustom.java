package com.liaoyb.ssm.po;

import java.util.List;

public class SongCustom extends Song {
	//排名
	private int rank;
	
	//对应音乐资源
	private  MusicCustom musicCustom;
	
	//封面
	private ImgCustom imgCustom;
	
	private List<Artist> artists;
	//在哪些歌单中包含
	private List<Songlist> songlists;
	
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public MusicCustom getMusicCustom() {
		return musicCustom;
	}
	public void setMusicCustom(MusicCustom musicCustom) {
		this.musicCustom = musicCustom;
	}
	public ImgCustom getImgCustom() {
		return imgCustom;
	}
	public void setImgCustom(ImgCustom imgCustom) {
		this.imgCustom = imgCustom;
	}
	public List<Artist> getArtists() {
		return artists;
	}
	public void setArtists(List<Artist> artists) {
		this.artists = artists;
	}
	public List<Songlist> getSonglists() {
		return songlists;
	}
	public void setSonglists(List<Songlist> songlists) {
		this.songlists = songlists;
	}
	
	
	
	
}
