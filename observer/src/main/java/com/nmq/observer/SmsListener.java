package com.nmq.observer;

import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author niemengquan
 * @create 2019/7/17
 * @modifyUser
 * @modifyDate
 */
@Component
public class SmsListener implements ApplicationListener<UserLoginEvent> {
    @Override
    @Async
    public void onApplicationEvent(UserLoginEvent event) {
        User user = (User) event.getSource();
        System.out.println(Thread.currentThread().getName()  + "用户登录成功，向手机号："+ user.getEmail() +"发送信息成功");
    }
}
