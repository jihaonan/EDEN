package com.liaoyb.ssm.mapper;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.liaoyb.ssm.po.Artist;
import com.liaoyb.ssm.po.ArtistCustom;

public class ArtistMapperCustomTest {
	private ApplicationContext applicationContext;
	private String []configs=new String[] { "classpath:spring/applicationContext-dao.xml", "classpath:spring/applicationContext-service.xml","classpath:spring/applicationContext-transaction.xml"};
	//在setUp方法中得到spring容器
	@Before
	public void setUp() throws Exception {
		//载入多个配置文件
		applicationContext=new ClassPathXmlApplicationContext(configs);
	}

	@Test
	public void testFindArtistBySongId() {
		ArtistMapperCustom artistMapperCustom=(ArtistMapperCustom) applicationContext.getBean("artistMapperCustom");
		
		 List<Artist> artists=artistMapperCustom.findArtistBySongId(1);
		 System.out.println(artists);
	}
	
	
	@Test
	public void testFindArtistCustomBySongId() {
		ArtistMapperCustom artistMapperCustom=(ArtistMapperCustom) applicationContext.getBean("artistMapperCustom");
		
		 List<ArtistCustom> artistCustoms=artistMapperCustom.findArtistCustomsBySongId(1);
		 System.out.println(artistCustoms);
	}

}
