/**
 * Un test del models y no trabajo para tripAdvisor ojo... este es otro models. 
 */
package es.uniovi.asw.cobertura;

import static org.junit.Assert.*;

import org.junit.Test;

import es.uniovi.asw.model.Candidatura;

/**
 * @author Amir
 *
 */
public class TestCandidatura {
	
	Candidatura c = null; 
	

	@Test
	public void testConstructorVacio() {
		c=  new Candidatura();
		System.out.println(c);
		assertEquals(null, c.getId());
		assertEquals(null, c.getEleccion());
		assertEquals(null, c.getDescripcion());
		assertEquals(null, c.getProgramaElectoral());
		assertEquals(0, c.getVotos().size());
		
	}

}
