<<<<<<< HEAD
package es.uniovi.asw.persistence.impl.repository;

import java.util.List;

import es.uniovi.asw.model.Circunscripcion;
import es.uniovi.asw.model.ColegioElectoral;

public interface PollingStationRepository {

	List<ColegioElectoral> findAll();
	
	ColegioElectoral findById(Long id);
	
	List<ColegioElectoral> findByCircunscripcion(Circunscripcion c);
	
}
=======
package es.uniovi.asw.persistence.impl.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import es.uniovi.asw.model.Circunscripcion;
import es.uniovi.asw.model.ColegioElectoral;

public interface PollingStationRepository extends CrudRepository<ColegioElectoral, Long>{

	List<ColegioElectoral> findAll();
	
	ColegioElectoral findById(Long id);
	
	List<ColegioElectoral> findByCircunscripcion(Circunscripcion c);
	
}
>>>>>>> master
