package com.pyh.pojo;

import com.pyh.service.UserService;
import com.pyh.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public User user(){
        return new User();
    }
}
