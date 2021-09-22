package com.semifir.cinema.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.semifir.cinema.models.Salle;

public interface SalleRepository extends MongoRepository<Salle, String>  {

}
