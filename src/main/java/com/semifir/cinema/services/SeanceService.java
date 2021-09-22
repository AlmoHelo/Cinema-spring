package com.semifir.cinema.services;

import java.util.List;

import com.semifir.cinema.models.Seance;

public interface SeanceService {

	List<Seance> findAll();

	Seance findOne(String id);

	Seance create(Seance seance);

	Seance putSeance(Seance seance);

	Seance patchSeance(String id, Seance seance);

	void delete(String id);

}
