package com.liaoyb.ssm.mapper;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.liaoyb.ssm.po.ArtistCustom;
import com.liaoyb.ssm.po.SongCustom;
import com.liaoyb.ssm.po.SongQueryVo;

public class SongMapperCustomTest {
	private ApplicationContext applicationContext;
	private String []configs=new String[] { "classpath:spring/applicationContext-dao.xml", "classpath:spring/applicationContext-service.xml","classpath:spring/applicationContext-transaction.xml"};
	//在setUp方法中得到spring容器
	@Before
	public void setUp() throws Exception {
		//载入多个配置文件
		applicationContext=new ClassPathXmlApplicationContext(configs);
	}
	@Test
	public void testFindsongs() {
		SongMapperCustom songMapperCustom=(SongMapperCustom) applicationContext.getBean("songMapperCustom");
		SongQueryVo songQueryVo=new SongQueryVo();
		SongCustom songCustom=new SongCustom();
		songCustom.setId(1);
		
		ArtistCustom artistCustom=new ArtistCustom();
		artistCustom.setName("红");
		
		
		songQueryVo.setSongCustom(songCustom);
		songQueryVo.setArtistCustom(artistCustom);
		
		
		
		List<SongCustom> songCustoms=songMapperCustom.findsongs(songQueryVo);
		
		
		System.out.println(songCustoms);
	}

}
