package com.pyh.module.user.controller;

import com.pyh.base.bean.ResultBean;
import com.pyh.module.user.entity.UserEntity;
import com.pyh.module.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class UserController {
    @Autowired
    private UserService userService;
    public ResultBean getUserList(){
        Map<String,Object> condition = new HashMap<String, Object>();
        condition.put("id",1);
        List<UserEntity> u1 =  userService.list(condition);
        return new ResultBean<List<UserEntity>>(u1);
    }
}
