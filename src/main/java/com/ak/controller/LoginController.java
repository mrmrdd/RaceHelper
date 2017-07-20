package com.ak.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by arthur on 7/20/17.
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @RequestMapping
    public String login() {
        return "/login";
    }
}
