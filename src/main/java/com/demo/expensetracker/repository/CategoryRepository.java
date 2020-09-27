package com.demo.expensetracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.expensetracker.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	Category findByName(String name);

}
