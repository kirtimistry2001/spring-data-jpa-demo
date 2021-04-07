package ca.kirti.jpa.springdatajpademo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ca.kirti.jpa.springdatajpademo.enity.User;
import ca.kirti.jpa.springdatajpademo.service.UserDAOService;

/**
 * This class will run on Application startup
 * @author Kirti
 *
 */
@Component
public class UserDAOCommandlineRunner implements CommandLineRunner{

	Logger log = LoggerFactory.getLogger(UserDAOCommandlineRunner.class);
	
	@Autowired
	private UserDAOService userDAOService;
	
	@Override
	public void run(String... args) throws Exception {
		//Inserting some data for test pupose in inMemory H2 Database
		User user = new User("Roy", "ROLE_USER");
		log.info("****Before saving New User created with id:"+ user);
		//save in dtabase		
		long userId = userDAOService.insert(user);
		log.info("**** New User created with id:"+ user);
		
	}

}
