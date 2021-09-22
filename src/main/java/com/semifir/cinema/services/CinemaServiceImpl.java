package com.semifir.cinema.services;

import java.util.List;

import com.semifir.cinema.models.Cinema;
import com.semifir.cinema.repositories.CinemaRepository;

public class CinemaServiceImpl implements CinemaService{

	private CinemaRepository cinemaRepository;

	public CinemaServiceImpl(CinemaRepository cinemaRepository) {
		this.cinemaRepository = cinemaRepository;
	}
	
	@Override
	public List<Cinema> findAll() {
		return this.cinemaRepository.findAll();
	}

	@Override
	public Cinema findOne(String id) {
		return this.cinemaRepository.findById(id).get();
	}

	@Override
	public Cinema create(Cinema cinema) {
		return this.cinemaRepository.save(cinema);
	}

	@Override
	public Cinema putCinema(Cinema cinema) {
		return this.cinemaRepository.save(cinema);
	}

	@Override
	public Cinema patchCinema(String id, Cinema cinema) {
		Cinema findCinema = this.cinemaRepository.findById(id).get();
		if(cinema.getNom() != null) {
			findCinema.setNom(cinema.getNom());
		} else {
			findCinema.setNom(findCinema.getNom());
		}
		if(cinema.getSalles() != null) {
			findCinema.setSalles(cinema.getSalles());
		}else {
			findCinema.setSalles(findCinema.getSalles());
		}
		return this.cinemaRepository.save(findCinema);
	}

	@Override
	public void delete(String id) {
		this.cinemaRepository.deleteById(id);
	}

}
