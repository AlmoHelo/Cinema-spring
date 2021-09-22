package com.semifir.cinema;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.semifir.cinema.repositories.FilmRepository;
import com.semifir.cinema.repositories.SalleRepository;
import com.semifir.cinema.repositories.SeanceRepository;
import com.semifir.cinema.services.FilmService;
import com.semifir.cinema.services.FilmServiceImpl;
import com.semifir.cinema.services.SalleService;
import com.semifir.cinema.services.SalleServiceImpl;
import com.semifir.cinema.services.SeanceService;
import com.semifir.cinema.services.SeanceServiceImpl;

@Configuration
public class AppConfig {

	@Bean
	public FilmService filmService(FilmRepository filmRepository) {
		return new FilmServiceImpl(filmRepository);
	}

	@Bean
	public SeanceService seanceService(SeanceRepository seanceRepository) {
		return new SeanceServiceImpl(seanceRepository);
	}
	
	@Bean
	public SalleService salleService(SalleRepository salleRepository) {
		return new SalleServiceImpl(salleRepository);
	}
}
