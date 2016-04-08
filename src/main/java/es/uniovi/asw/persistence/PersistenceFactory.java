package es.uniovi.asw.persistence;

import es.uniovi.asw.persistence.impl.EleccionDaoImpl;
import es.uniovi.asw.persistence.impl.VotoDaoImpl;

public class PersistenceFactory {

	public EleccionDao newEleccionDao(){
		return new EleccionDaoImpl();
	}
	
	public VotoDao newVotoDao(){
		return new VotoDaoImpl();
	}
	
}
