package com.liaoyb.ssm.mapper;

import com.liaoyb.ssm.po.Artist;
import com.liaoyb.ssm.po.ArtistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArtistMapper {
    int countByExample(ArtistExample example);

    int deleteByExample(ArtistExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Artist record);

    int insertSelective(Artist record);

    List<Artist> selectByExample(ArtistExample example);

    Artist selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Artist record, @Param("example") ArtistExample example);

    int updateByExample(@Param("record") Artist record, @Param("example") ArtistExample example);

    int updateByPrimaryKeySelective(Artist record);

    int updateByPrimaryKey(Artist record);
}