package com.pyh.service;

import com.pyh.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    public void getUser() {
        userDao.getUser();
    }
}
