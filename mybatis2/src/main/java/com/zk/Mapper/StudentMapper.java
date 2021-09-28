package com.zk.Mapper;

import com.zk.pojo.Student;

import java.util.List;

public interface StudentMapper {
    //查询所有学生的信息以及对应老师的信息
    List<Student> getStudentInfo();
}
