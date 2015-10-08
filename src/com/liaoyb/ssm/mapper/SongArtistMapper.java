package com.liaoyb.ssm.mapper;

import com.liaoyb.ssm.po.SongArtist;
import com.liaoyb.ssm.po.SongArtistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SongArtistMapper {
    int countByExample(SongArtistExample example);

    int deleteByExample(SongArtistExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SongArtist record);

    int insertSelective(SongArtist record);

    List<SongArtist> selectByExample(SongArtistExample example);

    SongArtist selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SongArtist record, @Param("example") SongArtistExample example);

    int updateByExample(@Param("record") SongArtist record, @Param("example") SongArtistExample example);

    int updateByPrimaryKeySelective(SongArtist record);

    int updateByPrimaryKey(SongArtist record);
}