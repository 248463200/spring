package com.pyh.module.user.service;

import com.pyh.module.user.entity.UserEntity;

import java.util.List;
import java.util.Map;

public interface UserService {

    List<UserEntity> list(Map<String,Object> map);

}
