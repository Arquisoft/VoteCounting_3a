package es.uniovi.asw.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Table(name="Eleccion")
@Entity
public class Eleccion {

	@Id @GeneratedValue
	private long id;
	
	@OneToMany(mappedBy="eleccion")
	private Set<VotoConfirmado> votosConfirmados;

	
	private String nombre;
	private Date fechaInicio;
	private Date fechaFin;
	
	
	Eleccion(){}
	
	public Eleccion(String nombre, Date fechaInicio, Date fechaFin){
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	
	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	@Override
	public String toString(){
		return "Eleccion: "+ nombre + "\nfechaInicio: " + fechaInicio;
	}

	
}
