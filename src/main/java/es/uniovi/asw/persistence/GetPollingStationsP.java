package es.uniovi.asw.persistence;

import java.util.List;

import es.uniovi.asw.model.Circunscripcion;
import es.uniovi.asw.model.ColegioElectoral;
import es.uniovi.asw.persistence.impl.repository.CircunscripcionRepository;
import es.uniovi.asw.persistence.impl.repository.PollingStationRepository;

public interface GetPollingStationsP {

	List<ColegioElectoral> getPollingStation(PollingStationRepository pRep);
	
	List<Circunscripcion> getCircunscripciones(CircunscripcionRepository cRep);
	
	ColegioElectoral getById(PollingStationRepository pRep, Long id);
	
}
