package com.boot.test;

import com.boot.cache.CacheApplication;
import com.boot.cache.entity.User;
import com.boot.cache.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CacheApplication.class)
public class CacheTest {
    @Resource
    private UserService userService ;
    // 分别测试：增、改、查、删,四个方法
    @Test
    public void testAdd (){
        User user = new User() ;
        user.setId(1);
        user.setName("cicada");
        userService.addUser(user) ;
    }
    @Test
    public void testUpdate (){
        userService.updateUser(2) ;
    }
    @Test
    public void testSelect (){
        userService.selectUser(3) ;
    }
    @Test
    public void testDelete (){
        userService.deleteUser(3) ;
    }

}
