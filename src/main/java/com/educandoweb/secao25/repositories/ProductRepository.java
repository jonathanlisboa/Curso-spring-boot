package com.educandoweb.secao25.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.secao25.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
