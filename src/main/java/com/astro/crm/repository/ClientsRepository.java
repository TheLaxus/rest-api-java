package com.astro.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.astro.crm.model.Clients;

@Repository
public interface ClientsRepository extends JpaRepository<Clients, Long> {
	
	
}
