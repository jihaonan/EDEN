package com.liaoyb.ssm.mapper;

import com.liaoyb.ssm.po.SongUser;
import com.liaoyb.ssm.po.SongUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SongUserMapper {
    int countByExample(SongUserExample example);

    int deleteByExample(SongUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SongUser record);

    int insertSelective(SongUser record);

    List<SongUser> selectByExample(SongUserExample example);

    SongUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SongUser record, @Param("example") SongUserExample example);

    int updateByExample(@Param("record") SongUser record, @Param("example") SongUserExample example);

    int updateByPrimaryKeySelective(SongUser record);

    int updateByPrimaryKey(SongUser record);
}