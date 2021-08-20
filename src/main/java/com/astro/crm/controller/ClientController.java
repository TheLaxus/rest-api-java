package com.astro.crm.controller;
import org.springframework.web.bind.annotation.RestController;

import com.astro.crm.model.Clients;
import com.astro.crm.repository.ClientsRepository;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/clientes")
public class ClientController {
	
	@Autowired
	private ClientsRepository clientsRepository;
	
	@GetMapping
	public List<Clients> listClients() {
		return clientsRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Clients add(@RequestBody Clients client) {
		return clientsRepository.save(client);
	}
}
