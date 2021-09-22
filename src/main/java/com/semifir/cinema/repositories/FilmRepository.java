package com.semifir.cinema.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.semifir.cinema.models.Film;

public interface FilmRepository extends MongoRepository<Film, String> {

}
