package es.uniovi.asw.model;

import java.util.List;

public class Colegio {
	private String nombre;
	private String poblacion;
	private List<Voto> votos;
	
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
	public List<Voto> getVotos() {
		return votos;
	}
	public void setVotos(List<Voto> votos) {
		this.votos = votos;
	}
}
