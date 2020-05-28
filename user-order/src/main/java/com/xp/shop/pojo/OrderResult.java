package com.xp.shop.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.mockito.internal.matchers.Or;

/**
 * @author Climb.Xu
 * @date 2020/5/28 16:38
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderResult {
    private String message;
    private String userName;
    private Order order;
}
