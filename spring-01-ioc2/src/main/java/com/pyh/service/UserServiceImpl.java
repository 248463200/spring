package com.pyh.service;

import com.pyh.dao.UserDao;
import com.pyh.dao.UserDaoImpl;

public class UserServiceImpl implements UserService {
    private UserDao userdao;

    public void setUserdao(UserDao userdao) {
        this.userdao = userdao;
    }

    public void getUser() {
        userdao.getUser();
    }
}
