package com.ak.controller;

import com.ak.entity.Race;
import com.ak.service.RaceService;
import com.ak.toolkits.CommonToolkit;
import com.ak.toolkits.CustomUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by arthur on 7/20/17.
 */
@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    RaceService raceService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Model model) {
        List<Race> races = new ArrayList<>();
        CustomUser customUser = CommonToolkit.getCustomUser();
        if (customUser != null)
            races.addAll(raceService.getRacesById(customUser.getId()));
        model.addAttribute("race", new Race());
        model.addAttribute("races", races);
        return "/home";
    }
}
