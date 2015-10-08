package com.liaoyb.ssm.controller;

import java.lang.reflect.Field;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.liaoyb.ssm.controller.validation.ValidGroup_Register;
import com.liaoyb.ssm.page.po.PageErrorUserRegister;
import com.liaoyb.ssm.po.User;
import com.liaoyb.ssm.po.UserCustom;
import com.liaoyb.ssm.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired 
	private UserService userService;
	
	@RequestMapping("/login")
	public String login(){
		return "music/signin";
		
	}
	
	@RequestMapping("/register")
	public String register(){
		return "music/signup";
	}
	
	

	
	
	//登陆
	
	//@ModelAttribute("user") 可以指定pojo回显到页面在request中key
	//RedirectAttributes attr使用重定向传参的
	@RequestMapping("/login_submit")
	public String login_submit(Model model,HttpSession session,@ModelAttribute("user") User user,RedirectAttributes attr)throws Exception{
		
		UserCustom userCustom=userService.select_login(user);
		if(userCustom==null){
			//登陆失败，重新登陆
			attr.addFlashAttribute("user", user);
			attr.addFlashAttribute("message", "登录失败请重试");
			
		
			return "redirect:/user/login";
			
		}

		session.setAttribute("currentuser", userCustom);
		//登陆成功到重定向到主页
		return "redirect:/music/index";
		
	}
	
	
	
	//注册提交页面
	//添加校验
	//@Validated(value={ValidGroup_Register.class})指定使用ValidGroup_Register.class分组的校验
	@RequestMapping("/register_submit")
	public String register_submit(HttpSession session,String code,@ModelAttribute("user") @Validated(value={ValidGroup_Register.class})User user,BindingResult bindingResult,RedirectAttributes attr)throws Exception{
		PageErrorUserRegister errorUser=new PageErrorUserRegister();
		//验证码
		String origalCode=(String) session.getAttribute("code");
		if(!origalCode.equals(code)){
			//验证码不正确
			errorUser.setCode("验证码有误");
			attr.addFlashAttribute("user", user);
			
			attr.addFlashAttribute("erroruser", errorUser);
			return "redirect:/user/register";
		}
		
		
		
		//获取校验出错信息
		if(bindingResult.hasErrors()){
			//输出错误信息
			List<FieldError> fieldErrors=bindingResult.getFieldErrors();
			
			for(FieldError fieldError:fieldErrors){
				//输出错误信息
				System.out.println("error:"+fieldError.getField()+"="+fieldError.getDefaultMessage());
				
				Field field=errorUser.getClass().getField(fieldError.getField());
				field.set(errorUser, fieldError.getDefaultMessage());
				
			}
			//将出错信息传到页面
			attr.addFlashAttribute("erroruser", errorUser);
			
			return "redirect:/user/register";
		}
		
		//判断用户是否存在
		if(userService.select_ifuserExist(user)){
			attr.addFlashAttribute("message", "用户已存在");
			return "redirect:/user/register";
		}
		
		
		//注册
		userService.save_register(user);
		
		
		//注册成功
		//进行登陆
		
		return "forward:login_submit.action";
		
//		return "login_submit.action";//这样写不行，会自动给我加上前后缀，变成/EDEN/WEB-INF/jsp/login_submit.action.jsp
		
		
		
		
	}
		
		
		
	
}
