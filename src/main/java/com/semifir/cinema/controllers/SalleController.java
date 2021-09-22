package com.semifir.cinema.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.semifir.cinema.models.Salle;
import com.semifir.cinema.services.SalleService;

@RestController
@CrossOrigin
@RequestMapping("salle")
public class SalleController {

	private SalleService salleService;
	
	public SalleController(SalleService salleService) {
		this.salleService = salleService;
	}
	
	@GetMapping
	public List<Salle> findAll(){
		return this.salleService.findAll();
	}
	
	@GetMapping("{id}")
	public Salle findOne(@PathVariable String id) {
		return this.salleService.findOne(id);
	}
	
	@PostMapping
	public Salle create(@RequestBody Salle salle) {
		return this.salleService.create(salle);
	}
	
	@PutMapping
	public Salle putSeance(@RequestBody Salle salle) {
		return this.salleService.putSalle(salle);
	}
	
	@PatchMapping("{id}")
	public Salle patchSeance(@PathVariable String id, @RequestBody Salle salle) {
		return this.salleService.patchSalle(id, salle);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable String id) {
		this.salleService.delete(id);
	}

}
