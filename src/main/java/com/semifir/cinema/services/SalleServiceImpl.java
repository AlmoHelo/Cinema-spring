package com.semifir.cinema.services;

import java.util.List;

import com.semifir.cinema.models.Salle;
import com.semifir.cinema.repositories.SalleRepository;

public class SalleServiceImpl implements SalleService{

	private SalleRepository salleRepository;

	public SalleServiceImpl(SalleRepository salleRepository) {
		this.salleRepository = salleRepository;
	}
	
	@Override
	public List<Salle> findAll() {
		return this.salleRepository.findAll();
	}

	@Override
	public Salle findOne(String id) {
		return this.salleRepository.findById(id).get();
	}

	@Override
	public Salle create(Salle salle) {
		return this.salleRepository.save(salle);
	}

	@Override
	public Salle putSalle(Salle salle) {
		return this.salleRepository.save(salle);
	}

	@Override
	public Salle patchSalle(String id, Salle salle) {
		Salle findSalle = this.salleRepository.findById(id).get();
		if(salle.getNumero() != null) {
			findSalle.setNumero(salle.getNumero());
		} else {
			findSalle.setNumero(findSalle.getNumero());
		}
		if(salle.getNbPlaces() != null) {
			findSalle.setNbPlaces(salle.getNbPlaces());
		}else {
			findSalle.setNbPlaces(findSalle.getNbPlaces());;
		}
		if(salle.getSeance() != null) {
			findSalle.setSeance(salle.getSeance());
		}else {
			findSalle.setSeance(findSalle.getSeance());;
		}
		return this.salleRepository.save(findSalle);
	}

	@Override
	public void delete(String id) {
		this.salleRepository.deleteById(id);
	}

}
