package com.guang.service;

import com.guang.dao.UserDAO;
import com.guang.daomain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by admin on 2016/2/22.
 */
@Service
public class UserService {
    @Autowired
    private UserDAO userDAO;

    public List<User> getUsers(){
        return this.userDAO.getUsers();
    }

    public Integer addUsers(User user){
        return this.userDAO.addUsers(user);
    }

    public Integer updateUsersByPhone(User user){
        return this.userDAO.updateUsersByPhone(user);
    }

}
