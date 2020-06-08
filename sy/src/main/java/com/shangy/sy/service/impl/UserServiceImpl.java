package com.shangy.sy.service.impl;

import com.shangy.sy.dao.UserDao;
import com.shangy.sy.entity.User;
import com.shangy.sy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    @Cacheable("baseCache")
    public Object test() {
        return userDao.test();
    }

    @Override
    public Object test1() {
        return userDao.test1();
    }

    @Override
    public int insert(User user) {
        userDao.insert(user);
        return user.getId();
    }
}
