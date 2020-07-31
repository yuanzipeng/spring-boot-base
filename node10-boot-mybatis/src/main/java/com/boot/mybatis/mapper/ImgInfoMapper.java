package com.boot.mybatis.mapper;

import java.util.List;
import com.boot.mybatis.entity.ImgInfo;
import com.boot.mybatis.entity.ImgInfoExample;
import org.apache.ibatis.annotations.Param;

public interface ImgInfoMapper {
    int countByExample(ImgInfoExample example);

    int deleteByExample(ImgInfoExample example);

    int deleteByPrimaryKey(Integer imgId);

    int insert(ImgInfo record);

    int insertSelective(ImgInfo record);

    List<ImgInfo> selectByExample(ImgInfoExample example);

    ImgInfo selectByPrimaryKey(Integer imgId);

    int updateByExampleSelective(@Param("record") ImgInfo record, @Param("example") ImgInfoExample example);

    int updateByExample(@Param("record") ImgInfo record, @Param("example") ImgInfoExample example);

    int updateByPrimaryKeySelective(ImgInfo record);

    int updateByPrimaryKey(ImgInfo record);
}