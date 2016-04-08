package es.uniovi.asw.model;

import java.util.Date;
import java.util.List;

public class Eleccion {
	private String eleccion;
	private Date fecha;
	private List<ComunidadAutonoma> ccaa;
	
	
	public List<ComunidadAutonoma> getCcaa() {
		return ccaa;
	}
	public void setCcaa(List<ComunidadAutonoma> ccaa) {
		this.ccaa = ccaa;
	}
	public String getEleccion() {
		return eleccion;
	}
	public void setEleccion(String eleccion) {
		this.eleccion = eleccion;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
}
