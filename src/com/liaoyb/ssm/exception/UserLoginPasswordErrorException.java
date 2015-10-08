package com.liaoyb.ssm.exception;

public class UserLoginPasswordErrorException extends CustomException {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "密码错误";
	}

}
