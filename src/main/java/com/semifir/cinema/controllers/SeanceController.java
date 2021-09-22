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

import com.semifir.cinema.models.Seance;
import com.semifir.cinema.services.SeanceService;

@RestController
@CrossOrigin
@RequestMapping("seance")
public class SeanceController {

	private SeanceService seanceService;
	
	public SeanceController(SeanceService seanceService) {
		this.seanceService = seanceService;
	}
	
	@GetMapping
	public List<Seance> findAll(){
		return this.seanceService.findAll();
	}
	
	@GetMapping("{id}")
	public Seance findOne(@PathVariable String id) {
		return this.seanceService.findOne(id);
	}
	
	@PostMapping
	public Seance create(@RequestBody Seance seance) {
		return this.seanceService.create(seance);
	}
	
	@PutMapping
	public Seance putSeance(@RequestBody Seance seance) {
		return this.seanceService.putSeance(seance);
	}
	
	@PatchMapping("{id}")
	public Seance patchSeance(@PathVariable String id, @RequestBody Seance seance) {
		return this.seanceService.patchSeance(id, seance);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable String id) {
		this.seanceService.delete(id);
	}
}
