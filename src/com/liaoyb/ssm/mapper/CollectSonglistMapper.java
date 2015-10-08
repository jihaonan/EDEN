package com.liaoyb.ssm.mapper;

import com.liaoyb.ssm.po.CollectSonglist;
import com.liaoyb.ssm.po.CollectSonglistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CollectSonglistMapper {
    int countByExample(CollectSonglistExample example);

    int deleteByExample(CollectSonglistExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CollectSonglist record);

    int insertSelective(CollectSonglist record);

    List<CollectSonglist> selectByExample(CollectSonglistExample example);

    CollectSonglist selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CollectSonglist record, @Param("example") CollectSonglistExample example);

    int updateByExample(@Param("record") CollectSonglist record, @Param("example") CollectSonglistExample example);

    int updateByPrimaryKeySelective(CollectSonglist record);

    int updateByPrimaryKey(CollectSonglist record);
}