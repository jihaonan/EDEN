package com.liaoyb.ssm.exception;

public class UserLoginUserNameAndEmailBothNullException extends CustomException {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "用户名和邮箱都为空";
	}
	
}
