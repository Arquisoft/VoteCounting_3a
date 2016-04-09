package es.uniovi.asw.persistence.impl.repository;

import java.util.List;

import es.uniovi.asw.model.Candidatura;

public interface CandidacyRepository {

	List<Candidatura> findAll();
	
}
