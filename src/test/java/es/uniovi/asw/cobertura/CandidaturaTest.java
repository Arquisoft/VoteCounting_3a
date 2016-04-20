/**
 * Un test del models y no trabajo para tripAdvisor ojo... este es otro models. 
 */
package es.uniovi.asw.cobertura;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import es.uniovi.asw.Application;
import es.uniovi.asw.model.Candidatura;
import es.uniovi.asw.model.Eleccion;
import es.uniovi.asw.model.Voto;

/**
 * @author Amir
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
@IntegrationTest({ "server.port=0" })
public class CandidaturaTest {
	
	Candidatura c = null; 
	

	@Test
	public void testConstructorVacio() {
		c=  new Candidatura();
		assertNull(c.getEleccion());
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
	
	@Test
	public void testSets() {
		c=  new Candidatura();
		c.setNombre("a");
		c.setDescripcion("b");
		c.setProgramaElectoral("c");
		c.setEleccion(new Eleccion());
		Set<Voto> v = new HashSet<Voto>();
		c.setVotos(v);
			
		assertEquals(null, c.getId());
		assertEquals("a", c.getNombre());
		assertEquals("b", c.getDescripcion());
		assertEquals("c", c.getProgramaElectoral());
		assertEquals(0, c.getVotos().size());
		assertNotNull(c.getEleccion());
		
	}
	
	@Test
	public void testHashNull() {
		c=  new Candidatura();
		assertEquals(961, c.hashCode());
		
	}
	
	@Test
	public void testHash() {
		c=  new Candidatura("a", "b", "c", new Eleccion());
		System.out.println(c.hashCode());
		//assertEquals(961, c.hashCode());
		
	}

	

	


}
