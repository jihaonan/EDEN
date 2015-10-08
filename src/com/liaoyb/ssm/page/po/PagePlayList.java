package com.liaoyb.ssm.page.po;

import java.util.ArrayList;
import java.util.List;
/**
 * 页面中的播放列表
 * @author Liao-Pc
 *
 */
public class PagePlayList {
	private List<PageMusic> pagemusics=new ArrayList<PageMusic>();

	public List<PageMusic> getPagemusics() {
		return pagemusics;
	}

	public void setPagemusics(List<PageMusic> pagemusics) {
		this.pagemusics = pagemusics;
	}
	
}
