package com.zk.Mapper;

import com.zk.Utils.MybatisUtil;
import com.zk.pojo.Student;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class StudentMapperTest {
    @Test
    public void getStudentInfo(){
        SqlSession sqlSeesion = MybatisUtil.getSqlSeesion();
        StudentMapper mapper = sqlSeesion.getMapper(StudentMapper.class);
        List<Student> studentInfo = mapper.getStudentInfo();
        for (Student student : studentInfo) {
            System.out.println(student);
        }
        sqlSeesion.close();
    }
}
