package com.semifir.cinema.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.semifir.cinema.models.Film;
import com.semifir.cinema.services.FilmService;

@RestController
@CrossOrigin
@RequestMapping("film")
public class FilmController {
	
	private FilmService filmService;
	
	public FilmController(FilmService filmService) {
		this.filmService = filmService;
	}

	@GetMapping
	public List<Film> findAll(){
		return this.filmService.findAll();
	}
	
	@GetMapping("{id}")
	public Film findOne(@PathVariable String id) {
		return this.filmService.findOne(id);
	}
	
	@PostMapping
	public Film create(@RequestBody Film film) {
		return this.filmService.create(film);
	}
}
