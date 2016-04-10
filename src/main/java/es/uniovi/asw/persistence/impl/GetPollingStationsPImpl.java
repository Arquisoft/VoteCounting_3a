package es.uniovi.asw.persistence.impl;

import java.util.List;

import es.uniovi.asw.model.Circunscripcion;
import es.uniovi.asw.model.ColegioElectoral;
import es.uniovi.asw.persistence.GetPollingStationsP;
import es.uniovi.asw.persistence.impl.repository.CircunscripcionRepository;
import es.uniovi.asw.persistence.impl.repository.PollingStationRepository;

public class GetPollingStationsPImpl implements GetPollingStationsP{

	@Override
	public List<ColegioElectoral> getPollingStation(PollingStationRepository pRep) {
		return pRep.findAll();
	}
	
	@Override
	public List<Circunscripcion> getCircunscripciones(CircunscripcionRepository cRep) {
		return cRep.findAll();
	}

	
	public ColegioElectoral getById(PollingStationRepository pRep, Long id) {
		return pRep.findById(id);
	}
	
}
