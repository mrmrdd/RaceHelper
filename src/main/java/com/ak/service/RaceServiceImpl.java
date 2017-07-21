package com.ak.service;


import com.ak.dao.RaceDao;
import com.ak.entity.Race;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class RaceServiceImpl implements RaceService{

    @Autowired
    RaceDao raceDao;

    @Override
    @Transactional
    public void addRace(Race race) {
        raceDao.addRace(race);
    }
}
