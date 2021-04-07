package ca.kirti.jpa.springdatajpademo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ca.kirti.jpa.springdatajpademo.enity.User;
import ca.kirti.jpa.springdatajpademo.repository.UserRepository;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner{

	Logger log = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public void run(String... args) throws Exception {
		User user = new User("Loy", "ROLE_ADMINs");
		userRepo.save(user);
		log.info("**** New User created usiong Repo :"+ user);

	}

}
