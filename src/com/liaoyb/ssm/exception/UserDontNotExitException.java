package com.liaoyb.ssm.exception;

public class UserDontNotExitException extends CustomException {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "用户不存在";
	}

}
