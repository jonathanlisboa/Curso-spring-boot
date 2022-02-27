package com.educandoweb.secao25.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.secao25.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
	
	

}
