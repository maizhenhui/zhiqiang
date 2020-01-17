package com.qingz.zhiqiang.service.Impl;

import com.qingz.zhiqiang.mapper.UserMapper;
import com.qingz.zhiqiang.pojo.Student;
import com.qingz.zhiqiang.service.UserService;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public int addStudent(Student student) {
        return userMapper.add(student);
    }

    @Override
    public Student queryStudentById(int i) {
        Student student = new Student();
        student.setId(i);
        return userMapper.get(student);
    }
}
