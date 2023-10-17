package com.ims.in.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class Invoice {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String location;
	private Double amount;
	
}
