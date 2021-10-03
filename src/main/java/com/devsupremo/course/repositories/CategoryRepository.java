package com.devsupremo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsupremo.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
