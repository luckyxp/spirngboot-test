package com.xp.shop.controller;

import com.xp.shop.dao.UserDao;
import com.xp.shop.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Climb.Xu
 * @date 2020/5/27 15:15
 */
@RestController
public class UserController {
    @Resource
    private UserDao userDao;

    @GetMapping(value = {"/user/{name}","/user"})
    public List getByName(@PathVariable(value = "name",required = false) String name) {
        List<User> names = userDao.getByName(name);
        return names;
    }
    @PostMapping("/user")
    public User add(User user) {
        System.out.println(user);
        return user;
    }
}
