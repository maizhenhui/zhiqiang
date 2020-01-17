package com.qingz.zhiqiang.service.Impl;

import com.qingz.zhiqiang.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceImplTest {
    @Autowired
    UserService userService;

    @Test
    void addStudent() {
    }

    @Test
    void queryStudentById() {
        System.out.println(userService.queryStudentById(3).getName());
    }
}