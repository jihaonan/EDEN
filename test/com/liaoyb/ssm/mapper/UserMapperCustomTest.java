package com.liaoyb.ssm.mapper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.liaoyb.ssm.po.UserCustom;

public class UserMapperCustomTest {

	private ApplicationContext applicationContext;
	private String []configs=new String[] { "classpath:spring/applicationContext-dao.xml", "classpath:spring/applicationContext-service.xml","classpath:spring/applicationContext-transaction.xml"};
	//在setUp方法中得到spring容器
	@Before
	public void setUp() throws Exception {
		//载入多个配置文件
		applicationContext=new ClassPathXmlApplicationContext(configs);
	}

	@Test
	public void testFindUserCustomById() {
		UserMapperCustom userMapperCustom=(UserMapperCustom) applicationContext.getBean("userMapperCustom");
		UserCustom userCustom=userMapperCustom.findUserCustomById(1);
		System.out.println(userCustom);
	}

}
