package es.uniovi.asw.persistence;

import es.uniovi.asw.persistence.impl.EleccionDaoImpl;

public class PersistenceFactory {

	public static EleccionDao newEleccionDao(){
		return new EleccionDaoImpl();
	}
	
	
}
