package com.nmq.observer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author niemengquan
 * @create 2019/7/17
 * @modifyUser
 * @modifyDate
 */
@RestController
@RequestMapping(value = "loginController")
public class UserLoginController {
    @Autowired
    private ApplicationContext applicationContext;

    @GetMapping("/login")
    public String userLogin(){
        User user = new User();
        user.setEmail("123131313@gmail.com").setPhone("18519888809");
        UserLoginEvent loginEvent = new UserLoginEvent(user);
        // 发布事件
        System.out.println(Thread.currentThread().getName()  + "用户登录成功!发送消息");
        applicationContext.publishEvent(loginEvent);
        return "success";
    }
}
