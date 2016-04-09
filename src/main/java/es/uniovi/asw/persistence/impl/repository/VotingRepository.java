package es.uniovi.asw.persistence.impl.repository;

import java.util.List;

import es.uniovi.asw.model.Eleccion;

public interface VotingRepository {

	List<Eleccion> findAll();
	
	Eleccion findById(Long id);
	
}
