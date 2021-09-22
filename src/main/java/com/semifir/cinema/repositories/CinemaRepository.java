package com.semifir.cinema.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.semifir.cinema.models.Cinema;

public interface CinemaRepository extends MongoRepository<Cinema, String>  {

}
