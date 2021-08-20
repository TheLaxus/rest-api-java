package com.astro.crm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.EqualsAndHashCode;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Data
@EqualsAndHashCode
public class Clients {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String nome;


}
