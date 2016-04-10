package es.uniovi.asw.persistence.impl.repository;

import java.util.List;

import es.uniovi.asw.model.Circunscripcion;

public interface CircunscripcionRepository {

	List<Circunscripcion> findAll();
	
	Circunscripcion findById(Long id);
	
}
