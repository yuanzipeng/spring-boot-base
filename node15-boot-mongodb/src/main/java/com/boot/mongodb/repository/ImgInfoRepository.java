package com.boot.mongodb.repository;

import com.boot.mongodb.entity.ImgInfo;

public interface ImgInfoRepository {
    void saveImg(ImgInfo imgInfo) ;
    ImgInfo findByImgTitle(String imgTitle);
    long updateImgInfo(ImgInfo imgInfo) ;
    void deleteById(Integer imgId);
}
