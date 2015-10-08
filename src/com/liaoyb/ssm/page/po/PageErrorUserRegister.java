package com.liaoyb.ssm.page.po;

/**
 * 注册页面的验证的错误信息,回显
 * @author Liao-Pc
 *
 */
public class PageErrorUserRegister {
	private String username;
	private String password;
	
	//验证码
	private String code;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
