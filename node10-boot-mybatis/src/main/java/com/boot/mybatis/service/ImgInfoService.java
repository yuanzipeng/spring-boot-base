package com.boot.mybatis.service;

import com.boot.mybatis.entity.ImgInfo;
import com.boot.mybatis.entity.ImgInfoExample;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface ImgInfoService {

    // 增加
    int insert(ImgInfo record);

    // 组合查询
    List<ImgInfo> selectByExample(ImgInfoExample example);

    // 修改
    int updateByPrimaryKeySelective(ImgInfo record);

    // 删除
    int deleteByPrimaryKey(Integer imgId);

    // 分页查询
    PageInfo<ImgInfo> queryPage (int page,int pageSize) ;

}
