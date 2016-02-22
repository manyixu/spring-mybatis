package com.guang;

import com.guang.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by admin on 2016/2/22.
 */

@RunWith(SpringJUnit4ClassRunner.class)        //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-myBatis.xml"})
public class SpringTest {
    @Resource
    private UserService userService;

//    @Before
//	public void before() {
//      引入spring的配置文件获取上下文
//		ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		userService = (IUserService) ac.getBean("userService");
//	}

    @Test
    public void test1() {
        System.out.println(userService == null);
        String name = userService.getUsers();
        System.out.println(name);

    }
}
