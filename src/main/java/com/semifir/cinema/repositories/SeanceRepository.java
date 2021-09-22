package com.semifir.cinema.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.semifir.cinema.models.Seance;

public interface SeanceRepository extends MongoRepository<Seance, String>  {

}
