package com.xp.shop.dao;

import com.xp.shop.pojo.Order;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Climb.Xu
 * @date 2020/5/27 14:04
 */
@Mapper
public interface OrderDao {
    void add(Order order);
}
