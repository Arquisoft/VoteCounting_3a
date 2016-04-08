package es.uniovi.asw.model;

import java.util.List;

public class ComunidadAutonoma {
	private String nombre;
	private List<Colegio> colegios;

	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Colegio> getColegios() {
		return colegios;
	}
	public void setColegios(List<Colegio> colegios) {
		this.colegios = colegios;
	}
	
}
