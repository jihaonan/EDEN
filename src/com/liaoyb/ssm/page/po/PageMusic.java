package com.liaoyb.ssm.page.po;
/**
 * 在页面中音乐的pojo类
 * @author Liao-Pc
 *
 */
public class PageMusic {
	private String  title;//"Time Lapse",
	private String artist;//      artist:"ADG3",
	private String mp3;// mp3:"http://127.0.0.1:8080/sources/music/TheFatRat - Time Lapse.mp3",
	
	//封面
    private String poster;//poster: "images/m0.jpg"

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getMp3() {
		return mp3;
	}

	public void setMp3(String mp3) {
		this.mp3 = mp3;
	}

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}
    
      
}
