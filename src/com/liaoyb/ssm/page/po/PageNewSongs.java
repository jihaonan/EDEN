package com.liaoyb.ssm.page.po;

import java.util.ArrayList;
import java.util.List;

public class PageNewSongs {
	private List<PageNewSongItem> newSongsItems=new ArrayList<PageNewSongItem>();

	public List<PageNewSongItem> getNewSongsItems() {
		return newSongsItems;
	}

	public void setNewSongsItems(List<PageNewSongItem> newSongsItems) {
		this.newSongsItems = newSongsItems;
	}
	
}
