package ca.kirti.jpa.springdatajpademo.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ca.kirti.jpa.springdatajpademo.enity.User;

/**
 * This  class helps in string/accessing data 
 * from the database (DAO), inspring this type of component known as Repository
 * using entityManager
 * @author Kirti
 *
 */
@Repository //is component that helps in Accessing/Storing Data to database
@Transactional //ability to declaratively control transaction (open transaction, close transaction)
public class UserDAOService {

	//entityManager was there with JPA and it was cumbersome to use 
	// and now with spring-data-jpa we have JPARepository - which are easy to handle!!
	@PersistenceContext //helps in tracking the entity
    private EntityManager entityManager;

    public long insert(User user) {
    	// example
    /*	User user1 = new User("Roy", "ROLE_USER");
    	User user2 = new User("Lina", "ROLE_ADMIN");
    	//adding user1 to  Persistence Context using  entity manager to persist
    	entityManager.persist(user1); // now user1 is managed and tracked by entity Manager
    	/ 
    	user1.setRole("ROLE_ADMIN"); //changes tracked by entity manager
    	
    	user2.setRole("ROLE_USER"); //Here user2 is not added to entity manger so it will not be tracked by entity manager
    	*/
    	
        entityManager.persist(user); // persist and manage that is it now tracked by entity manager
        return user.getId();
    }
}

