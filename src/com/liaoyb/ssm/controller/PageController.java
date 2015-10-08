package com.liaoyb.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	
	//主页
	@RequestMapping("/index")
	public String index(){
		//进行很多数据处理，查询等，然后放到....
		
		
		
		return "index/index";
		
	}
}
