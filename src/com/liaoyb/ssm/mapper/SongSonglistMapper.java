package com.liaoyb.ssm.mapper;

import com.liaoyb.ssm.po.SongSonglist;
import com.liaoyb.ssm.po.SongSonglistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SongSonglistMapper {
    int countByExample(SongSonglistExample example);

    int deleteByExample(SongSonglistExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SongSonglist record);

    int insertSelective(SongSonglist record);

    List<SongSonglist> selectByExample(SongSonglistExample example);

    SongSonglist selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SongSonglist record, @Param("example") SongSonglistExample example);

    int updateByExample(@Param("record") SongSonglist record, @Param("example") SongSonglistExample example);

    int updateByPrimaryKeySelective(SongSonglist record);

    int updateByPrimaryKey(SongSonglist record);
}