package es.uniovi.asw.persistence.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import es.uniovi.asw.model.Eleccion;
import es.uniovi.asw.persistence.GetVotings;
import es.uniovi.asw.persistence.impl.repository.VotingRepository;

public class GetVotingsImpl implements GetVotings{

	@Override
	public List<Eleccion> getVotings(VotingRepository vr) {
		List<Eleccion> elecciones = new ArrayList<>();
		for(Eleccion e : vr.findAll()){
			if(e.getFechaInicio().after(new Date(System.currentTimeMillis()))){
				elecciones.add(e);
			}
		}
		return elecciones;	
	}

	@Override
	public Eleccion getEleccionById(VotingRepository vr, Long id) {
		List<Eleccion> elecciones = vr.findAll();
		for(Eleccion e : elecciones){
			if(e.getId() == id){
				e.getOpciones().size();
				return e;
			}
		}
		return null;
	}

}
