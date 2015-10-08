package com.liaoyb.ssm.mapper;

import com.liaoyb.ssm.po.User;
import com.liaoyb.ssm.po.UserCustom;

public interface UserMapperCustom {
	UserCustom findUserCustomById(Integer id);
	
	//插入用户要返回自动生成的注解
	int insertSelectiveReturnId(User user);
}
