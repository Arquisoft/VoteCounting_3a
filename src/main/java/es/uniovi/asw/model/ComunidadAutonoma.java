package es.uniovi.asw.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name="CCAA")
@Entity
public class ComunidadAutonoma {

	@Id @GeneratedValue
	private long id;
	
	@OneToMany(mappedBy="comunidadAutonoma")
	Set <ColegioElectoral> colegios;
	
	private String nombre;

	ComunidadAutonoma(){}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<ColegioElectoral> getColegios() {
		return colegios;
	}

	public void setColegios(Set<ColegioElectoral> colegios) {
		this.colegios = colegios;
	}
	
	
	
}
