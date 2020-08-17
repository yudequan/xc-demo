package com.example.xcdemo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Created by dequan.yu on 2020/8/14.
 */
@Service
@Slf4j
public class LoginServiceImpl implements LoginService{
    @Override
    public void login() {
        log.info("login....");
    }
}
