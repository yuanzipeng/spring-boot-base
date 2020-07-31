package com.boot.test;

import com.boot.mongodb.MongoDBApplication;
import com.boot.mongodb.entity.ImgInfo;
import com.boot.mongodb.repository.ImgInfoRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import javax.annotation.Resource;
import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MongoDBApplication.class)
public class MongoTest {

    @Resource
    private ImgInfoRepository imgInfoRepository ;

    @Test
    public void test1 (){
        ImgInfo record = new ImgInfo() ;
        record.setImgId(1);
        record.setUploadUserId("A123");
        record.setImgTitle("博文图片");
        record.setSystemType(1) ;
        record.setImgType(2);
        record.setImgUrl("https://avatars0.githubusercontent.com/u/50793885?s=460&v=4");
        record.setLinkUrl("https://avatars0.githubusercontent.com/u/50793885?s=460&v=4");
        record.setShowState(1);
        record.setCreateDate(new Date());
        record.setUpdateDate(record.getCreateDate());
        record.setRemark("知了");
        record.setbEnable("1");
        imgInfoRepository.saveImg(record);
    }

    @Test
    public void test2 (){
        ImgInfo imgInfo = imgInfoRepository.findByImgTitle("博文图片") ;
        System.out.println("imgInfo === >> " + imgInfo);
    }

    @Test
    public void test3 (){
        ImgInfo record = new ImgInfo() ;
        record.setImgId(1);
        record.setUploadUserId("A123");
        record.setImgTitle("知了图片");
        record.setSystemType(1) ;
        record.setImgType(2);
        record.setImgUrl("https://avatars0.githubusercontent.com/u/50793885?s=460&v=4");
        record.setLinkUrl("https://avatars0.githubusercontent.com/u/50793885?s=460&v=4");
        record.setShowState(1);
        record.setCreateDate(new Date());
        record.setUpdateDate(record.getCreateDate());
        record.setRemark("知了");
        record.setbEnable("1");
        long result = imgInfoRepository.updateImgInfo(record) ;
        System.out.println("result == >> " + result);
    }

    @Test
    public void test4 (){
        imgInfoRepository.deleteById(1);
    }

}
