package guang;

import com.guang.daomain.User;
import com.guang.service.UserService;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by admin on 2016/2/22.
 */

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(SpringJUnit4ClassRunner.class)        //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class SpringTest {

    @Autowired
    private UserService userService;

    public void test1() {
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

    public void test2() {
        List<User> users = userService.getUsers();
        System.out.println(users.size());
    }

    public void test3() {
        User user = new User();
        user.setPhone("13500000002");
        user.setUserName("小强");
        System.out.println(userService.updateUsersByPhone(user));
    }



    @Test
    public void test4(){
        int x = 5;//瓶盖剩余
        int y = 5;//瓶的剩余
        int z = 5;//总瓶数
        while (x >= 4 || y >= 2){
            if(x >= 4){
                int t = (int) Math.floor(x / 4);
                z = z + t;
                x = x % 4;
                y = y + t;
                x = x + t;
                System.out.println("x:" + x + "---y:" + y +"---z:" + z + "---t:" + t);
            }
            if(y >= 2){
                int t = (int) Math.floor(y / 2);
                z = z + t;
                y = y % 2;
                x = x + t;
                y = y + t;
                System.out.println("x:" + x + "---y:" + y +"---z:" + z + "---t:" + t);
            }
        }
        System.out.println(z);

    }










}
