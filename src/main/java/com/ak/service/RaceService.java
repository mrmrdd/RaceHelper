package com.ak.service;

import com.ak.entity.Race;

import java.util.List;

/**
 * Created by arthur on 7/21/17.
 */
public interface RaceService {
    void addRace(Race race);
    List getRacesById(int id);
    Race getRaceById(int id);
}
