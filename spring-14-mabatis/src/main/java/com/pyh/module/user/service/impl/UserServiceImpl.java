package com.pyh.module.user.service.impl;

import com.pyh.module.user.dao.UserMapper;
import com.pyh.module.user.entity.UserEntity;
import com.pyh.module.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public List<UserEntity> list(Map<String,Object> map) {
        return userMapper.list(map);
    }
}
