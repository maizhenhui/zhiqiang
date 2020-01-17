package com.qingz.zhiqiang.service;

import com.qingz.zhiqiang.pojo.Student;

public interface UserService {
    int addStudent(Student student);
    Student queryStudentById(int id);
}
