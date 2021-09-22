package com.semifir.cinema;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.semifir.cinema.repositories.FilmRepository;
import com.semifir.cinema.services.FilmService;
import com.semifir.cinema.services.FilmServiceImpl;



@Configuration
public class AppConfig {
	
	@Bean
	public FilmService filmService(FilmRepository filmRepository) {
		return new FilmServiceImpl(filmRepository);
	}
}
