package com.educandoweb.secao25.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.secao25.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	
	

}
