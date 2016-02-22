package com.guang.service;

import com.guang.dao.UserDAO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by admin on 2016/2/22.
 */
@Service
public class UserService {
    @Resource
    private UserDAO userDAO;

    public String getUsers(){
        System.out.println(userDAO == null);
        return this.userDAO.getUsers();
    }


}
