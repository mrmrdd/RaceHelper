package com.ak.dao;

import com.ak.entity.Uzer;

/**
 * Created by arthur on 7/11/17.
 */
public interface UserDao {
    void addUser(Uzer user);
    Uzer getUserByName(String name);
    Uzer getUserById(String id);
}
