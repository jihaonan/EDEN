package com.liaoyb.ssm.page.po;

import java.util.ArrayList;
import java.util.List;
/**
 * Top Songs
 * @author Liao-Pc
 *
 */
public class PageTops {
	private List<PageTopItem>topItems=new ArrayList<PageTopItem>();

	public List<PageTopItem> getTopItems() {
		return topItems;
	}

	public void setTopItems(List<PageTopItem> topItems) {
		this.topItems = topItems;
	}
	
	
}
