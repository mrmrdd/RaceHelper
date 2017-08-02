package com.ak.controller;

import com.ak.entity.Role;
import com.ak.entity.Uzer;
import com.ak.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by arthur on 7/11/17.
 */
@Controller
@RequestMapping("/registration")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    private PasswordEncoder pswdEncoder;

    @RequestMapping(method = RequestMethod.GET)
    public String passUserToForm(Model model) {
        model.addAttribute("uzer", new Uzer());
        return "/registration";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String addNewUser(@Valid Uzer user, BindingResult bindingResult, Model model) {
        user.setPassword(pswdEncoder.encode(user.getPassword()));
        if(bindingResult.hasErrors())
            return "/registration";

        user.setRole(Role.ROLE_USER);
        userService.addUser(user);
        return "/login";
    }


}
