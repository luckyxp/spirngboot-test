package com.xp.shop.controller;

import com.alibaba.fastjson.JSON;
import com.xp.shop.dao.UserDao;
import com.xp.shop.pojo.User;
import net.minidev.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Climb.Xu
 * @date 2020/5/27 15:15
 */
@RestController
public class UserController {
    @Resource
    private UserDao userDao;

    @GetMapping(value = {"/user/{name}","/user"})
    public String getByName(@PathVariable(value = "name",required = false) String name,String callback) {
        List<User> users = userDao.getByName(name);
        return callback+"("+ JSON.toJSONString(users) +")";
    }
    @GetMapping("/add/user")
    public String add(String name,String phone,String callback) {
        System.out.println(name+"\t"+phone);
        userDao.add(new User(null, name, phone,null));
        return callback+"()";
    }

    @GetMapping("/del/{id}")
    public String del(@PathVariable("id") Integer id,String callback) {
        System.out.println(id);
        userDao.del(id);
        return callback+"()";
    }
}
