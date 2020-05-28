package com.xp.shop.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Climb.Xu
 * @date 2020/5/27 13:53
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order implements Serializable {
    private Integer id;
    private String name;
    private String no;
    private double money;
    private Integer userId;
}
