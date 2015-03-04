package com.gwt.presistence.control;

import com.gwt.presistence.dao.UserDao;
import com.gwt.presistence.service.UserService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Created by 30 on 2015/3/4.
 */
public class UserControl {

    @Resource(name = "userService")
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public int getUserCount(){
        return userService.getUserCount();
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-ioc-config.xml");
        UserService  dao = (UserService)applicationContext.getBean("userService");
        System.out.println(dao.getUserCount());
    }
}
