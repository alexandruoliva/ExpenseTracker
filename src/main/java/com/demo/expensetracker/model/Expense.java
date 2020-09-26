package com.demo.expensetracker.model;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="expense")
public class Expense {
	
	@Id
	private Long id;
	
	private Instant expensedate;
	
	private String descript;
	
	@ManyToOne
	private Category category;
	
	@ManyToOne
	private User user;

}
