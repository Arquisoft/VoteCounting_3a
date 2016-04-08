package es.uniovi.asw.persistence;

import java.util.List;

import es.uniovi.asw.model.Colegio;
import es.uniovi.asw.model.ComunidadAutonoma;
import es.uniovi.asw.model.Voto;

public interface VotoDao {
	
	public List<Voto> findAll();
	
	public List<Voto> findVotos(Colegio colegio);

	public List<Voto> findVotos(ComunidadAutonoma colegio);
}
