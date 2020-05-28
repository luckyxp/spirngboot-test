package com.xp.shop.config;

import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureWebMvc;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Climb.Xu
 * @date 2020/5/27 17:16
 */
@Configuration
public class Config {
    @Bean
    public WebMvcConfigurer webMvcConfigurer() {
        WebMvcConfigurer webMvcConfigurer = new WebMvcConfigurer(){
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/html/order/add").setViewName("order/add");
                registry.addViewController("/html/user/list").setViewName("user/list");
            }
        };
        return webMvcConfigurer;
    }
}
