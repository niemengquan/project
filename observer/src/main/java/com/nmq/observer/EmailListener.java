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
public class EmailListener implements ApplicationListener<UserLoginEvent> {
    /**
     *  @Async 异步执行任务
     * @param event
     */
    @Override
    @Async
    public void onApplicationEvent(UserLoginEvent event) {
        User user = (User) event.getSource();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()  + "用户登录成功，向邮箱地址："+ user.getEmail() +"发送邮件成功");
    }
}
