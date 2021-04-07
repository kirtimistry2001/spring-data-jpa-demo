package ca.kirti.jpa.springdatajpademo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ca.kirti.jpa.springdatajpademo.enity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
