package com.ak.dao;

import com.ak.entity.User;

/**
 * Created by arthur on 7/11/17.
 */
public interface UserDao {
    void addUser(User user);
    User getUserByName(String name);

}
