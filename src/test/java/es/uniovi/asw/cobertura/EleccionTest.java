/**
 * 
 */
package es.uniovi.asw.cobertura;

import static org.junit.Assert.*;

import java.sql.Time;
import java.util.Date;

import org.junit.Test;

import es.uniovi.asw.model.Eleccion;

/**
 * @author Amir
 *
 */
public class EleccionTest {

	private Eleccion e; 
	private Date date1= new Date();
	private Time t1 = new Time(0);
	private Time t2 = new Time(154651847);
	private String nombre = "a";

	/**
	 * Test method for {@link es.uniovi.asw.model.Eleccion#hashCode()}.
	 */
	@Test
	public final void testHashCode() {
		e = new Eleccion();		
		assertEquals(29791, e.hashCode());
		e= new Eleccion("a" , null, null, new Time(0), new Time(1));
		assertEquals(29888, e.hashCode());
	}

	/**
	 * Test method for {@link es.uniovi.asw.model.Eleccion#Eleccion(java.lang.String, java.util.Date, java.util.Date, java.sql.Time, java.sql.Time)}.
	 */
	@Test
	public final void testEleccionStringDateDateTimeTime() {
		Date date2= new Date();
		e= new Eleccion(nombre , date1, date2, t1, t2);
		assertEquals(nombre, e.getNombre());
		assertEquals(date2, e.getFechaFin());
		assertEquals(date1, e.getFechaInicio());
		assertEquals(t2, e.getHoraFin());
		assertEquals(t1, e.getHoraInicio());
		assertNull(e.getNumeroOpciones());
		assertNotNull(e.getOpciones());
		assertEquals(0, e.getOpciones().size());
		assertEquals(0, e.getVotantes().size());
	}

	/**
	 * Test method for {@link es.uniovi.asw.model.Eleccion#Eleccion(java.lang.String)}.
	 */
	@Test
	public final void testEleccionString() {	
		e= new Eleccion(nombre);	
		assertEquals(nombre, e.getNombre());
		assertNull(e.getFechaFin());
		assertNull(e.getHoraFin());
		assertNull(e.getNumeroOpciones());
		assertNotNull(e.getOpciones());
		assertEquals(0, e.getOpciones().size());
		assertEquals(0, e.getVotantes().size());


	}

	/**
	 * Test method for {@link es.uniovi.asw.model.Eleccion#Eleccion()}.
	 */
	@Test
	public final void testEleccion() {
		e= new Eleccion();
		assertNull(e.getHoraInicio());
		assertNull(e.getNombre());
		assertNull(e.getHoraInicio());
		assertNull(e.getNumeroOpciones());
		assertNotNull(e.getOpciones());
		assertEquals(0, e.getOpciones().size());
		assertEquals(0, e.getVotantes().size());

	}

	/**
	 * Test method for {@link es.uniovi.asw.model.Eleccion#toString()}.
	 */
	@Test
	public final void testToString() {
		e= new Eleccion(nombre , null, null, t1, t2);		
		String s ="Eleccion [id=null, nombre=a, fechaInicio=null, fechaFin=null, horaInicio=01:00:00, horaFin=19:57:31, opciones=[]]";
		assertEquals(s, e.toString());
	}

	/**
	 * Test method for {@link es.uniovi.asw.model.Eleccion#equals(java.lang.Object)}.
	 */
	@Test
	public final void testEqualsObject() {
		e= new Eleccion();
		Eleccion e1, e2, e3;
		Date date2= new Date();
		e1= new Eleccion(nombre , date1, date2, t1, t2);
		e2= new Eleccion("otroNombre");
		e3= new Eleccion(nombre , date1, date2, t1, t2);
		
		assertTrue(e.equals(e));
		assertTrue(e1.equals(e3));

		assertFalse(e.equals(new Object()));
		assertFalse(e.equals(e1));
		assertFalse(e1.equals(e));
		assertFalse(e1.equals(e2));
		assertFalse(e2.equals(e1));
		e3.setNombre(null);
		assertFalse(e1.equals(e3));
		assertFalse(e3.equals(e1));
 
		
	}

}
