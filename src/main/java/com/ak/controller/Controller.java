package com.ak.controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by arthur on 7/20/17.
 */
@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("/")
    public String home(){
        return "/home";
    }
}
