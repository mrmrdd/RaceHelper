package com.ak.controller;

import com.ak.entity.Race;
import com.ak.entity.Uzer;
import com.ak.service.RaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Created by arthur on 7/21/17.
 */
@Controller("/createrace")
public class RaceController {

    @Autowired
    RaceService raceService;

    @RequestMapping(method = RequestMethod.GET)
    public String passRaceToForm(Model model) {
        model.addAttribute("race", new Race());
        return "/createrace";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String addNewRace(Race race) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Object current = authentication.getPrincipal();
       race.setRace_id(5);
       raceService.addRace(race);
        return "/home";
    }
}
