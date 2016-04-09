package es.uniovi.asw.model.types;

import java.io.Serializable;

public class Votokey implements Serializable{

	private static final long serialVersionUID = 1L;

	Long opcion;
	Long colegio;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((colegio == null) ? 0 : colegio.hashCode());
		result = prime * result + ((opcion == null) ? 0 : opcion.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Votokey other = (Votokey) obj;
		if (colegio == null) {
			if (other.colegio != null)
				return false;
		} else if (!colegio.equals(other.colegio))
			return false;
		if (opcion == null) {
			if (other.opcion != null)
				return false;
		} else if (!opcion.equals(other.opcion))
			return false;
		return true;
	}
	
	
}
