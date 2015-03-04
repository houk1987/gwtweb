package com.gwt.presistence.service;

import com.gwt.presistence.dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by 30 on 2015/3/4.
 */
public class UserService {

    @Resource(name = "userDao")
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public int getUserCount(){
        return userDao.getAllUser().size();
    }
}
