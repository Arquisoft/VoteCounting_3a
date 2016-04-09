package es.uniovi.asw.persistence;

import java.util.Date;

import es.uniovi.asw.model.Eleccion;

public interface EleccionDao {
	
	public Eleccion getEleccion(String nombre, Date fecha);
	
	public void iniciarRecuento();
	
	public void terminarRecuento();
	
}
