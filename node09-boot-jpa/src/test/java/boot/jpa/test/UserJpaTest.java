package boot.jpa.test;

import com.boot.jpa.JpaApplication;
import com.boot.jpa.entity.User;
import com.boot.jpa.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = JpaApplication.class)
public class UserJpaTest {

    @Resource
    private UserService userService ;

    @Test
    public void addUser (){
        User user = new User() ;
        user.setName("知了一笑");
        user.setAge(22);
        userService.addUser(user);
        User user1 = new User() ;
        user1.setName("cicada");
        user1.setAge(23);
        userService.addUser(user1);
    }

    @Test
    public void findByAge (){
        Integer age = 22 ;
        // User{id=3, name='知了一笑', age=22}
        System.out.println(userService.findByAge(age));
    }

    @Test
    public void findByNameAndAge (){
        System.out.println(userService.findByNameAndAge("cicada",23));
    }

    @Test
    public void findSql (){
        // User{id=4, name='cicada', age=23}
        System.out.println(userService.findSql("cicada"));
    }

    @Test
    public void update (){
        User user = new User() ;
        // 如果这个主键不存在，会以主键自增的方式新增入库
        user.setId(3);
        user.setName("哈哈一笑");
        user.setAge(25);
        userService.update(user) ;
    }

    @Test
    public void deleteStudentById (){
        userService.deleteStudentById(5) ;
    }

}
