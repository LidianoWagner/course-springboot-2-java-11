package com.devsupremo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsupremo.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
