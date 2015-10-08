package com.liaoyb.ssm.page.po;

import java.util.ArrayList;
import java.util.List;

public class PageDiscover {
	private List<PageDiscoverItem> discoverItem=new ArrayList<PageDiscoverItem>();
	//当前的页数
	private int currentPage;
	
	//每页的数量
	private int pageSize;
	
	//总共多少页
	private int pageCount;

	public List<PageDiscoverItem> getDiscoverItem() {
		return discoverItem;
	}

	public void setDiscoverItem(List<PageDiscoverItem> discoverItem) {
		this.discoverItem = discoverItem;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	
}
