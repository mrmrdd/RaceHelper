package com.ak.controller;

import com.ak.entity.Race;
import com.ak.entity.Uzer;
import com.ak.toolkits.CommonToolkit;
import com.ak.service.RaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.persistence.EntityManager;


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
        Uzer uzer = new Uzer();
        uzer.setId(CommonToolkit.getCustomUser().getId());
        race.setUzer(uzer);
        raceService.addRace(race);
        return "/home";
    }
}
