package guang;

import com.guang.daomain.User;
import com.guang.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by admin on 2016/2/22.
 */

@RunWith(SpringJUnit4ClassRunner.class)        //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class SpringTest {

    @Autowired
    private UserService userService;

    public void test1() {
        List<User> users = userService.getUsers();
        System.out.println(users.size());
    }

    public void test2() {
        for (int i = 0; i < 100; i++) {
            User user = new User();
            user.setPhone("1350000000" + i);
            user.setPassWord(user.getPhone());
            user.setUserName("小明" + i);
            user.setSex(i % 2 == 0 ? "男" : "女");
            user.setCity("北京" + i);
            userService.addUsers(user);
            System.out.println(i);
        }
    }

    @Test
    public void test3() {
        User user = new User();
        user.setPhone("13500000002");
        user.setUserName("小强");
        System.out.println(userService.updateUsersByPhone(user));
    }

}
