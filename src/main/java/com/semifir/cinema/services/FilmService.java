package com.semifir.cinema.services;

import java.util.List;

import com.semifir.cinema.models.Film;

public interface FilmService {

	public List<Film> findAll();

	public Film findOne(String id);

	public Film create(Film film);

	public void delete(String id);

	public Film putFilm(Film film);

	public Film patchFilm(String id, Film film);

}
