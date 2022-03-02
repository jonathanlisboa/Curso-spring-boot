package com.educandoweb.secao25.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.secao25.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
	
	

}
