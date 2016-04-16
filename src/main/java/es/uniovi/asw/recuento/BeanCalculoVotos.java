package es.uniovi.asw.recuento;

import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import es.uniovi.asw.model.Candidatura;
import es.uniovi.asw.model.Eleccion;

@Component("BeanCalculo")
@Scope("session")
public class BeanCalculoVotos {
	
	private Map<String, Integer> votos;
	//private Map<String, Map<String, Integer>> colegios;
	//private Map<String, Map<String, Integer>> comunidad;


	public String recuentoVotos (Eleccion e) {
		for(Candidatura cand : e.getOpciones()){
			votos.put(cand.getNombre(), cand.getVotos().size());
		}
		
		return "exito";
	}

}
