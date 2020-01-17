package com.qingz.zhiqiang.mapper;

import com.qingz.zhiqiang.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    Student get(Student student);
    int add(Student student);
}
