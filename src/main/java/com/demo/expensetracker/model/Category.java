package com.demo.expensetracker.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
@Table(name="category")

public class Category {
	
	@Id
	private Long id;
	
	//Type of category
	private String name;
	

}
