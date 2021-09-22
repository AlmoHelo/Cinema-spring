package com.semifir.cinema.services;

import java.util.List;

import com.semifir.cinema.models.Film;
import com.semifir.cinema.repositories.FilmRepository;

public class FilmServiceImpl implements FilmService {
	
	private FilmRepository filmRepository;
	
	public FilmServiceImpl(FilmRepository filmRepository) {
		this.filmRepository = filmRepository;
	}

	@Override
	public List<Film> findAll() {
		return this.filmRepository.findAll();
	}

	@Override
	public Film findOne(String id) {
		return this.filmRepository.findById(id).get();
	}

	@Override
	public Film create(Film film) {
		return this.filmRepository.save(film);
	}

}
