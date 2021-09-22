package com.semifir.cinema.services;

import java.util.List;

import com.semifir.cinema.models.Salle;

public interface SalleService {

	List<Salle> findAll();

	Salle findOne(String id);

	Salle create(Salle salle);

	Salle putSalle(Salle salle);

	Salle patchSalle(String id, Salle salle);

	void delete(String id);

}
