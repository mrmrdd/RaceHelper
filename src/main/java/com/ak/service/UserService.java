package com.ak.service;

import com.ak.entity.User;

/**
 * Created by arthur on 7/11/17.
 */
public interface UserService {
    void addUser(User user);
    User getUserByName(String name);
}
