<<<<<<< HEAD
package es.uniovi.asw.persistence.impl.repository;

import java.util.List;

import es.uniovi.asw.model.Candidatura;

public interface CandidacyRepository {

	List<Candidatura> findAll();
	
}
=======
package es.uniovi.asw.persistence.impl.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import es.uniovi.asw.model.Candidatura;

public interface CandidacyRepository extends CrudRepository<Candidatura, Long>{

	List<Candidatura> findAll();
	
}
>>>>>>> master
