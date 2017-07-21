package com.ak.dao;

import com.ak.entity.Race;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class RaceDaoImpl implements RaceDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void addRace(Race race) {
       em.persist(race);
    }
}
