package com.nmq.observer;

import org.springframework.context.ApplicationEvent;

/**
 * @author niemengquan
 * @create 2019/7/17
 * @modifyUser
 * @modifyDate
 */
public class UserLoginEvent extends ApplicationEvent{

    /**
     * Create a new ApplicationEvent.
     *
     * @param user the object on which the event initially occurred (never {@code null})
     */
    public UserLoginEvent(User user) {
        super(user);
    }
}
