package es.uniovi.asw.persistence.impl.repository;

import java.util.List;

import es.uniovi.asw.model.Circunscripcion;
import es.uniovi.asw.model.ColegioElectoral;

public interface PollingStationRepository {

	List<ColegioElectoral> findAll();
	
	ColegioElectoral findById(Long id);
	
	List<ColegioElectoral> findByCircunscripcion(Circunscripcion c);
	
}
