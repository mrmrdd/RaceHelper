package com.ak.service;

import com.ak.dao.UserDao;
import com.ak.entity.Uzer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by arthur on 7/11/17.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    @Transactional
    public void addUser(Uzer user) {
        userDao.addUser(user);
    }

    @Override
    public Uzer getUserByName(String name) {
        return userDao.getUserByName(name);
    }
}
