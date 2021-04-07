package ca.kirti.jpa.springdatajpademo.service;

import ca.kirti.jpa.springdatajpademo.enity.User;

import javax.persistence.EntityManager;

public class UserDAOService {

    private EntityManager entityManager;

    public long insert(User user) {
        entityManager.persist(user);
        return user.getId();
    }
}

