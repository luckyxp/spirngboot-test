package com.xp.shop.controller;

import com.xp.shop.dao.OrderDao;
import com.xp.shop.dao.UserDao;
import com.xp.shop.pojo.Order;
import com.xp.shop.pojo.OrderResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Climb.Xu
 * @date 2020/5/28 16:42
 */
@RestController
public class OrderController {
    @Resource
    private UserDao userDao;
    @Resource
    private OrderDao orderDao;

    @PutMapping("/order")
    public OrderResult add(@RequestBody OrderResult orderResult) {
        System.out.println(orderResult.getMessage());
        Order order = orderResult.getOrder();
        order.setUserId(userDao.getByName(orderResult.getUserName()).get(0).getId());
        orderDao.add(order);
        return orderResult;
    }
}
