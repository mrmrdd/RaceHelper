package com.ak.dao;


import com.ak.entity.Race;

import java.util.List;

public interface RaceDao {
    void addRace(Race race);

    List getRacesById(int id);
}
