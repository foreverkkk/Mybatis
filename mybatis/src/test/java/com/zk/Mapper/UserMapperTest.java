package com.zk.Mapper;

import com.zk.Bean.User;
import com.zk.Utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMapperTest {
    /**
     * 获取所有用户列表
     */
    @Test
    public void getuserlistTest(){
        SqlSession sqlSeesion = MybatisUtil.getSqlSeesion();
        UserMapper mapper = sqlSeesion.getMapper(UserMapper.class);
        List<User> userList = mapper.getuserlist();
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSeesion.close();
    }

    /**
     * 向表中增加一个用户
     */
    @Test
    public void addUserTest(){
        SqlSession sqlSeesion = MybatisUtil.getSqlSeesion();
        UserMapper mapper = sqlSeesion.getMapper(UserMapper.class);
        mapper.addUser(new User(6,"zkz","男",22,"河南","137091","137091@qq.com"));
        sqlSeesion.commit();
        sqlSeesion.close();
    }

    /**
     * 根据ID删除一个用户
     */
    @Test
    public void delUserTest(){
        SqlSession sqlSeesion = MybatisUtil.getSqlSeesion();
        UserMapper mapper = sqlSeesion.getMapper(UserMapper.class);
        mapper.delUser(2);
        sqlSeesion.commit();
        sqlSeesion.close();
    }

    /**
     * 根据ID修改用户信息
     */
    @Test
    public void updataUserTest(){
        SqlSession sqlSeesion = MybatisUtil.getSqlSeesion();
        UserMapper mapper = sqlSeesion.getMapper(UserMapper.class);
        Map<String, Object> map = new HashMap<>();
        map.put("username","zkk");
        map.put("id",2);
        mapper.updataUser(map);
        sqlSeesion.commit();
        sqlSeesion.close();
    }

    /**
     * 模糊查询
     */
    @Test
    public void getUserLikeTest() {
        SqlSession sqlSeesion = MybatisUtil.getSqlSeesion();
        UserMapper mapper = sqlSeesion.getMapper(UserMapper.class);
        List<User> userLike = mapper.getUserLike("%朱%");
        for (User user : userLike) {
            System.out.println(user);
        }
        sqlSeesion.commit();
        sqlSeesion.close();
    }

    /**
     * 使用注解格式查询所有用户
     */
    @Test
    public void getUsersTest(){
        SqlSession sqlSeesion = MybatisUtil.getSqlSeesion();
        UserMapper mapper = sqlSeesion.getMapper(UserMapper.class);
        List<User> users = mapper.getUsers();
        for (User user : users) {
            System.out.println(user);
        }
        sqlSeesion.close();
    }
}
