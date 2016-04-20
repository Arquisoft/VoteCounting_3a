/**
 * Un test del models y no trabajo para tripAdvisor ojo... este es otro models. 
 */
package es.uniovi.asw.cobertura;

import static org.junit.Assert.*;

import org.junit.Test;

import es.uniovi.asw.model.Candidatura;
import es.uniovi.asw.model.Eleccion;

/**
 * @author Amir
 *
 */
public class TestCandidatura {
	
	Candidatura c = null; 
	

	@Test
	public void testConstructorVacio() {
		c=  new Candidatura();
		assertEquals(null, c.getId());
		assertEquals(null, c.getNombre());
		assertEquals(null, c.getEleccion());
		assertEquals(null, c.getDescripcion());
		assertEquals(null, c.getProgramaElectoral());
		assertEquals(0, c.getVotos().size());
	}
	
	@Test
	public void testConstructorFull() {
		c=  new Candidatura("a", "b", "c", new Eleccion());
		assertEquals(null, c.getId());
		assertEquals("a", c.getNombre());
		assertEquals("b", c.getDescripcion());
		assertEquals("c", c.getProgramaElectoral());
		assertEquals(0, c.getVotos().size());
	}
	
	@Test
	public void testToString() {
		c=  new Candidatura();
		assertEquals(null, c.getId());
		assertEquals(null, c.getEleccion());
		assertEquals(null, c.getDescripcion());
		assertEquals(null, c.getProgramaElectoral());
		assertEquals(0, c.getVotos().size());
		assertEquals("Candidatura [id=null, eleccion=null, nombre=null, descripcion=null, programaElectoral=null, votos=[]]", c.toString());
	}
	

	


}
