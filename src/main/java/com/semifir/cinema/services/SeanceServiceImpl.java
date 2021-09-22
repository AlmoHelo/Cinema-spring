package com.semifir.cinema.services;

import java.util.List;

import com.semifir.cinema.models.Seance;
import com.semifir.cinema.repositories.SeanceRepository;

public class SeanceServiceImpl implements SeanceService{

	private SeanceRepository seanceRepository;

	public SeanceServiceImpl(SeanceRepository seanceRepository) {
		this.seanceRepository = seanceRepository;
	}
	@Override
	public List<Seance> findAll() {
		return this.seanceRepository.findAll();
	}

	@Override
	public Seance findOne(String id) {
		return this.seanceRepository.findById(id).get();
	}

	@Override
	public Seance create(Seance seance) {
		return this.seanceRepository.save(seance);
	}

	@Override
	public Seance putSeance(Seance seance) {
		return this.seanceRepository.save(seance);
	}

	@Override
	public Seance patchSeance(String id, Seance seance) {
		Seance findSeance = this.seanceRepository.findById(id).get();
		if(seance.getDate() != null) {
			findSeance.setDate(seance.getDate());
		} else {
			findSeance.setDate(findSeance.getDate());
		}
		if(seance.getFilm() != null) {
			findSeance.setFilm(seance.getFilm());
		}else {
			findSeance.setFilm(findSeance.getFilm());
		}
		return this.seanceRepository.save(findSeance);
	}

	@Override
	public void delete(String id) {
		this.seanceRepository.deleteById(id);
	}

}
