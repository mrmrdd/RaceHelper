package com.ak.service;

import com.ak.entity.Uzer;

/**
 * Created by arthur on 7/11/17.
 */
public interface UserService {
    void addUser(Uzer user);
    Uzer getUserByName(String name);
}
