package com.qingz.zhiqiang.controller;

import com.qingz.zhiqiang.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class UserController {
    @Reference
    private UserService userService;

    @RequestMapping("/get")
    public String getStudent(){
        return userService.queryStudentById(3).getName();
    }
}
