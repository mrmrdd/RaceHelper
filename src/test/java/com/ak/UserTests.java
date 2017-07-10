package com.ak;

import com.ak.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by arthur on 7/10/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTests {

    @Test
    public void createNewUser(){
        new User("name", "password", "asd@qwe.com");
    }

    @Test
    public void checkUserName(){
        User user =  new User("name", "password", "asd@qwe.com");
        assertEquals("name", user.getName());
    }
}
