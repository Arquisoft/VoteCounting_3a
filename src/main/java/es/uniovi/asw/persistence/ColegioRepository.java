package es.uniovi.asw.persistence;

import org.springframework.data.repository.CrudRepository;

import es.uniovi.asw.model.Candidatura;

public interface ColegioRepository extends CrudRepository<Candidatura, Long>{
	Candidatura findById(Long id);

}
