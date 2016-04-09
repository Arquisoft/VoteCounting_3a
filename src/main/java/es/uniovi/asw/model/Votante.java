package es.uniovi.asw.model;

public class Votante {

	private String nombre;

	
	Votante(){}
	
	public Votante(String nombre){
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
