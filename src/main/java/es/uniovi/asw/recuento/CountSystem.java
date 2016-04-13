package es.uniovi.asw.recuento;

import java.util.HashMap;
import java.util.List;

public interface CountSystem {

	public boolean iniciar();

	public boolean terminar();
	
	public HashMap<String, Long> getResults();
	
	public String getName();
	
	public List<String> GetOptions();
	
}
