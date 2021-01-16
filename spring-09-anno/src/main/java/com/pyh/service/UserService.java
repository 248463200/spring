package com.pyh.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Configuration
@Service
public interface UserService {
    @Bean
    void getUser();
}
