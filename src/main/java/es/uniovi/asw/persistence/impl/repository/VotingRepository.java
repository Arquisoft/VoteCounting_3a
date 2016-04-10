package es.uniovi.asw.persistence.impl.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import es.uniovi.asw.model.Eleccion;

public interface VotingRepository extends CrudRepository<Eleccion, Long>{

	List<Eleccion> findAll();
	
	Eleccion findById(Long id);
	
}
