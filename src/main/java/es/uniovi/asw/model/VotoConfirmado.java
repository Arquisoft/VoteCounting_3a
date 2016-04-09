package es.uniovi.asw.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import es.uniovi.asw.model.types.VotoConfirmadokey;

@Table(name="VotoConfirmado")
@IdClass(VotoConfirmadokey.class)
@Entity
public class VotoConfirmado {
	
	@Id @ManyToOne
	private Votante votante;
	@Id @ManyToOne
	private Eleccion eleccion;
	
	VotoConfirmado(){}

	public Votante getVotante() {
		return votante;
	}

	public void setVotante(Votante votante) {
		this.votante = votante;
	}

	public Eleccion getEleccion() {
		return eleccion;
	}

	public void setEleccion(Eleccion eleccion) {
		this.eleccion = eleccion;
	}
	
	
	
}
