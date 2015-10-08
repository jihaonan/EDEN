package com.liaoyb.ssm.page.po;

public class PageDiscoverItem extends PageMusic {
	//星级，总共5颗星
	private int star_num;
	
	//播放数量
	private int playcount;
	
	//是否被当前用户收藏,默认false
	private boolean iscollect=false;

	public boolean isIscollect() {
		return iscollect;
	}

	public void setIscollect(boolean iscollect) {
		this.iscollect = iscollect;
	}

	public int getStar_num() {
		return star_num;
	}

	public void setStar_num(int star_num) {
		this.star_num = star_num;
	}

	public int getPlaycount() {
		return playcount;
	}

	public void setPlaycount(int playcount) {
		this.playcount = playcount;
	}
	
	
}
