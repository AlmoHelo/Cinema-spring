package com.semifir.cinema.services;

import java.util.List;

import com.semifir.cinema.models.Cinema;

public interface CinemaService {

	List<Cinema> findAll();

	Cinema findOne(String id);

	Cinema create(Cinema cinema);

	Cinema putCinema(Cinema cinema);

	Cinema patchCinema(String id, Cinema cinema);

	void delete(String id);


}
