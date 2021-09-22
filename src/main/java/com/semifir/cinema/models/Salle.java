package com.semifir.cinema.models;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Salle {
	
	@Id
	private String id;
	private Integer numero;
	private Integer nbPlaces;
	
	@DBRef
	@Field("seance")
	private List<Seance> seance = new ArrayList<>();

}
