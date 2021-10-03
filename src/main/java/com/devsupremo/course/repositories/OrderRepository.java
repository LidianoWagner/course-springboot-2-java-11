package com.devsupremo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsupremo.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
