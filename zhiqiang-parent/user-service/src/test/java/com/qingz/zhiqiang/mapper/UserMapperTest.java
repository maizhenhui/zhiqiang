package com.qingz.zhiqiang.mapper;

import com.qingz.zhiqiang.pojo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserMapperTest {
    @Autowired
    UserMapper userMapper;

    @Test
    public void get() {
        Student student = new Student();
        student.setId(3);
        System.out.println(userMapper.get(student).getName());
    }

    @Test
    public void add() {
        Student student = new Student();
        student.setName("123");
        student.setPassword("321");
        student.setSno("abc");
        System.out.println(userMapper.add(student));
    }
}