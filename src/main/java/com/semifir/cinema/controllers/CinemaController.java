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

import com.semifir.cinema.models.Cinema;
import com.semifir.cinema.services.CinemaService;

@RestController
@CrossOrigin
@RequestMapping("cinema")
public class CinemaController {

	private CinemaService cinemaService;
	
	public CinemaController(CinemaService cinemaService) {
		this.cinemaService = cinemaService;
	}
	
	@GetMapping
	public List<Cinema> findAll(){
		return this.cinemaService.findAll();
	}
	
	@GetMapping("{id}")
	public Cinema findOne(@PathVariable String id) {
		return this.cinemaService.findOne(id);
	}
	
	@PostMapping
	public Cinema create(@RequestBody Cinema cinema) {
		return this.cinemaService.create(cinema);
	}
	
	@PutMapping
	public Cinema putCinema(@RequestBody Cinema cinema) {
		return this.cinemaService.putCinema(cinema);
	}
	
	@PatchMapping("{id}")
	public Cinema patchCinema(@PathVariable String id, @RequestBody Cinema cinema) {
		return this.cinemaService.patchCinema(id, cinema);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable String id) {
		this.cinemaService.delete(id);
	}
}
