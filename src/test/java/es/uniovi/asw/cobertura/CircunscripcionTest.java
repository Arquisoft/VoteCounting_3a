/**
 * Un test del models y no trabajo para tripAdvisor ojo... este es otro models. 
 */
package es.uniovi.asw.cobertura;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import es.uniovi.asw.Application;

import es.uniovi.asw.model.Circunscripcion;


/**
 * @author Amir
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
@IntegrationTest({ "server.port=0" })
public class CircunscripcionTest {
	
	Circunscripcion c = null; 
	

	@Test
	public void testConstructorVacio() {
	
	
		
	}
	
	@Test
	public void testConstructorFull() {
	}
	
	@Test
	public void testToString() {
	
	}
	
	@Test
	public void testSets() {

	}
	
	@Test
	public void testHashNull() {

		
	}
	
	@Test
	public void testHash() {

	}

	@Test
	public void testEquals() {

	}

}
