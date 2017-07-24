package com.ak.dao;

import com.ak.entity.Uzer;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by arthur on 7/11/17.
 */
@Repository("userRepository")
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void addUser(Uzer user) {
        em.persist(user);
    }

    @Override
    public Uzer getUserByName(String name) {
        return em.createQuery("from Uzer u where u.name=:name", Uzer.class)
                .setParameter("name", name)
                .getSingleResult();
    }

    @Override
    public Uzer getUserById(String id) {
        return em.createQuery("from Uzer u where u.name=:id", Uzer.class)
                .setParameter("id", id)
                .getSingleResult();
    }
}
