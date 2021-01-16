package com.pyh.dao;

import com.pyh.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDaoImpl implements UserDao{

    @Autowired
    private User user;

    public void getUser() {
        user.getName();
    }
}
