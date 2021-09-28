package com.zk.Mapper;

import com.zk.Bean.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author zk
 */
@SuppressWarnings("all")
public interface UserMapper {
    /**
     * 查询所有用户
     */
    List<User> getuserlist();
    /**
     * 插入一个用户
     */
    int addUser(User user);

    /**
     * 根据ID删除一个用户
     */
    int delUser(int id);

    /**
     * 根据ID修改用户信息
     */
    int updataUser(Map<String,Object> map);

    /**
     * 模糊查询
     */
    List<User> getUserLike(String username);

    /**
     * 使用注解（不用***Mapper.xml配置）
     */
    @Select("select * from user")
    List<User> getUsers();
}
