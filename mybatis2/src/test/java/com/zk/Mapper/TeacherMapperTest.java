package com.zk.Mapper;

import com.zk.Utils.MybatisUtil;
import com.zk.pojo.Teacher;
import org.junit.Test;

public class TeacherMapperTest {
    @Test
    public void getTeacherById(){
        Teacher teacher = MybatisUtil.getSqlSeesion().getMapper(TeacherMapper.class).getTeacherById(1);
        System.out.println(teacher);
    }
}
