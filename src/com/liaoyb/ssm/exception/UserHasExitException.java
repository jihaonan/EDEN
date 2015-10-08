package com.liaoyb.ssm.exception;

public class UserHasExitException extends CustomException{

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "用户名已经存在";
	}
	

}
