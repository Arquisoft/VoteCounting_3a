package es.uniovi.asw.persistence;

import java.util.List;

import es.uniovi.asw.model.Candidatura;
import es.uniovi.asw.persistence.impl.repository.CandidacyRepository;

public interface GetCandidacyS {

	List<Candidatura> getCandidacys(CandidacyRepository cRep, Long id);
}
