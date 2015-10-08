package com.liaoyb.ssm.mapper;

import com.liaoyb.ssm.po.Songlist;
import com.liaoyb.ssm.po.SonglistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SonglistMapper {
    int countByExample(SonglistExample example);

    int deleteByExample(SonglistExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Songlist record);

    int insertSelective(Songlist record);

    List<Songlist> selectByExample(SonglistExample example);

    Songlist selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Songlist record, @Param("example") SonglistExample example);

    int updateByExample(@Param("record") Songlist record, @Param("example") SonglistExample example);

    int updateByPrimaryKeySelective(Songlist record);

    int updateByPrimaryKey(Songlist record);
}