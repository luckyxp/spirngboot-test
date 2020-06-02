package com.xp.shop.dao;

import com.xp.shop.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Climb.Xu
 * @date 2020/5/27 13:57
 */
@Mapper
public interface UserDao {
    List<User> getByName(@Param("name") String name);

    void add(User user);

    void del(Integer id);
}
