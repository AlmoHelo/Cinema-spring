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

	@Override
	public Film putFilm(Film film) {
		return this.filmRepository.save(film);
	}


	@Override
	public void delete(String id) {
		this.filmRepository.deleteById(id);
	}

	@Override
	public Film patchFilm(String id, Film film) {
		Film findFilm = this.filmRepository.findById(id).get();
		if(film.getNom() != null) {
			findFilm.setNom(film.getNom());
		} else {
			findFilm.setNom(findFilm.getNom());
		}
		if(film.getDuree() != null) {
			findFilm.setDuree(film.getDuree());
		}else {
			findFilm.setDuree(film.getDuree());
		}
		return this.filmRepository.save(findFilm);
	}



}
