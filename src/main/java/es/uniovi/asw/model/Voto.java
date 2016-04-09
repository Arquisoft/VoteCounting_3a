package es.uniovi.asw.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import es.uniovi.asw.model.types.Votokey;

@Table(name="Voto")
@IdClass (Votokey.class)
@Entity
public class Voto {
	
	@Id @ManyToOne
	private ColegioElectoral colegio;
	
	@Id @ManyToOne
	private Candidatura candidatura;

	Voto(){}
	
	public ColegioElectoral getColegio() {
		return colegio;
	}

	public void setColegio(ColegioElectoral colegio) {
		this.colegio = colegio;
	}

	public Candidatura getOpcion() {
		return candidatura;
	}

	public void setCandidatura(Candidatura candidatura) {
		this.candidatura = candidatura;
	}
	
	
}
