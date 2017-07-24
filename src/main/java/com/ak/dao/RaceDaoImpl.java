package com.ak.dao;

import com.ak.entity.Race;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class RaceDaoImpl implements RaceDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void addRace(Race race) {
       em.persist(race);
    }

    @Override
    public List<Race> getRacesById(int id) {
        return em.createQuery("from Race where uzer_id=:id", Race.class)
                .setParameter("id", id)
                .getResultList();
    }
}
