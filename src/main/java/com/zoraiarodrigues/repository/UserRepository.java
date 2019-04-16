package com.zoraiarodrigues.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.zoraiarodrigues.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{


	public User getByEmail(String email);
	
	public User getByEmailAndPassword(String email, String passaword);
	

	//@Query("SELECT * FROM User WHERE email = ?1 AND password = ?2")
	//public Optional<User> login(String email, String passaword);

}
