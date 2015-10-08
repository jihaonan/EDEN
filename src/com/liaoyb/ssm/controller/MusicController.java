package com.liaoyb.ssm.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.ws.rs.DefaultValue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.liaoyb.ssm.page.po.PageDiscover;
import com.liaoyb.ssm.page.po.PageDiscoverItem;
import com.liaoyb.ssm.page.po.PageNewSongs;
import com.liaoyb.ssm.page.po.PagePlayList;
import com.liaoyb.ssm.page.po.PageTops;
import com.liaoyb.ssm.po.SongCustom;
import com.liaoyb.ssm.po.User;
import com.liaoyb.ssm.po.UserCustom;
import com.liaoyb.ssm.service.SongService;
import com.liaoyb.ssm.service.UserService;


@Controller
@RequestMapping("/music")
public class MusicController {

	@Autowired 
	private UserService userService;
	@Autowired 
	private SongService songService;
	//Music首页
	@RequestMapping("/index")
	public String index(Model model,HttpSession session) throws Exception{
		
		//得到播放列表,生成json数据，放到域中
		UserCustom currentuser=(UserCustom) session.getAttribute("currentuser");
		int live=session.getMaxInactiveInterval();
		//如果用户不存在，返回默认的播放列表
		PagePlayList  pagePlayList=null;
		if(currentuser!=null){
			pagePlayList=userService.gainPagePlayList(currentuser);
		}else{
			User defaultUser=new User();
			defaultUser.setId(3);
			pagePlayList=userService.gainPagePlayList(defaultUser);
		}
		
		String playListJson=userService.gainPagePlayListJson(pagePlayList);
		model.addAttribute("playlist", playListJson);
		System.out.println("播放列表的json数据:"+playListJson);
		
		
		//得到好友列表,生成json或者其他
		
		
		//得到discover列表,在session中存放当前页为第一页
		
		//拿到登陆用户
		User user=(User) session.getAttribute("currentuser");
		//拿到这页内容
		
		PageDiscover pageDiscover=songService.gainPageDiscover(user, 6, 1);
		//把当前页放到session中
		session.setAttribute("discover_currentPageNum", 1);
		//把discover列表放到域中
		model.addAttribute("discover", pageDiscover.getDiscoverItem());
		//这里放json数据
		model.addAttribute("discoverlist", songService.gainPageDiscoverJson(pageDiscover));
		
		
		
		//得到new  songs
		
		PageNewSongs newSongs=songService.gainPageNewSongs(8);
		model.addAttribute("newsongs",newSongs.getNewSongsItems());
		model.addAttribute("newsonglist", songService.gainPageNewSonglistJson(newSongs));
		
		
		
		//得到top songs
		PageTops pageTops=songService.gainPageTops(5);
		model.addAttribute("top",pageTops.getTopItems());
		model.addAttribute("topsonglist", songService.gainPageToplistJson(pageTops));
		//
		return "music/index";
		
	}
	
	
	//得到discover数据,返回Json数据
	@RequestMapping("/discover")
	public @ResponseBody List<PageDiscoverItem> discover(HttpSession session,@RequestParam( defaultValue="6")int pageSize ) throws Exception{
		
		//pageSize这里默认为12
		Integer currentPageNum=(Integer) session.getAttribute("discover_currentPageNum");
		if(currentPageNum==null){
			currentPageNum=0;
		}
		//拿到下一页内容，如果页数已经到末尾了，重新从第一页开始
		if(currentPageNum>=songService.gainPageCount(pageSize)){
			currentPageNum=1;
		}else{
			currentPageNum++;
		}
		//拿到登陆用户
		User user=(User) session.getAttribute("currentuser");
		//拿到这页内容
		PageDiscover pageDiscover=songService.gainPageDiscover(user, pageSize, currentPageNum);
		
		
		//设置当前页码
		session.setAttribute("discover_currentPageNum", currentPageNum);
		
		return pageDiscover.getDiscoverItem();
		
		
		
	}
	
	
	@RequestMapping("template_discover")
	public String template_discover(){
		
		
		return null;
		
	}
	
	
	
	
	
	//分页测试
	
	@RequestMapping("/testPaging")
	public void test(HttpServletRequest request,HttpServletResponse response) throws Exception{

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
	
		
		List<SongCustom>songCustoms=songService.findAllSongUsePaging(1, 3);
		SongCustom songCustom=songCustoms.get(0);
		out.print(songCustoms.size());
		out.flush();
		out.close();
		
	}
	
	
	@RequestMapping("/testPageCount")
	public void testPage(HttpServletResponse response) throws Exception{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int count=songService.gainPageCount(6);
		System.out.println(count);
		out.print(count);
		out.flush();
		out.close();
	}
	
	
	@RequestMapping("/testCount")
	public void testCount(HttpServletResponse response) throws Exception{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int count=songService.findcountSong();
		System.out.println(count);
		out.print(count);
		out.flush();
		out.close();
	}
	
	
	
	//Top songs测试
	@RequestMapping("testTop")
	public void testTop() throws Exception{
		PageTops pageTops=songService.gainPageTops(5);
		System.out.println(songService.gainPageToplistJson(pageTops));
	}
	
	
	
	
}
