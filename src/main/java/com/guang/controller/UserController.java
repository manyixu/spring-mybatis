package com.guang.controller;

import com.guang.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by admin on 2016/2/24.
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/getUsers")
    public String getUsers(HttpServletRequest req, HttpServletResponse res){
        List users = userService.getUsers();
        return users.toString();

    }

}
