package es.uniovi.asw.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Circunscripcion")
public class Circunscripcion {
	
	@Id @GeneratedValue
	private long id;
	
	@ManyToOne
	private ComunidadAutonoma comunidadAutonoma;
	
	
	@OneToMany(mappedBy="circunscripcion")
	private Set<ColegioElectoral> colegios;
	
	Circunscripcion(){}
	
	public ComunidadAutonoma getComunidadAutonoma() {
		return comunidadAutonoma;
	}
	public void setComunidadAutonoma(ComunidadAutonoma comunidadAutonoma) {
		this.comunidadAutonoma = comunidadAutonoma;
	}
	public Set<ColegioElectoral> getColegios() {
		return colegios;
	}
	public void setColegios(Set<ColegioElectoral> colegios) {
		this.colegios = colegios;
	}

	
	
}
