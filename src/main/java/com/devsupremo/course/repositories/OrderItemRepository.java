package com.devsupremo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsupremo.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
