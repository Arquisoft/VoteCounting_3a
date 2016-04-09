package es.uniovi.asw.model;

import javax.persistence.ManyToOne;

public class ColegioElectoral {
	
	private String nombre;
	private String poblacion;
	
	@ManyToOne
	private Circunscripcion circunscripcion;

	ColegioElectoral(){}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	public Circunscripcion getCircunscripcion() {
		return circunscripcion;
	}

	public void setCircunscripcion(Circunscripcion circunscripcion) {
		this.circunscripcion = circunscripcion;
	}
	
	
	
}
