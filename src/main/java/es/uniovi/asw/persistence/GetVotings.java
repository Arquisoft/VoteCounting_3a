package es.uniovi.asw.persistence;

import java.util.List;

import es.uniovi.asw.model.Eleccion;
import es.uniovi.asw.persistence.impl.repository.VotingRepository;

public interface GetVotings {

List<Eleccion> getVotings(VotingRepository vr);
	
	Eleccion getEleccionById(VotingRepository vr, Long id);
	
}
