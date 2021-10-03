package com.devsupremo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsupremo.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
