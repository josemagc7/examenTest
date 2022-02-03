package es.iessoterohernandez.daw.endes.pruebaJUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.hamcrest.CoreMatchers;
import org.hamcrest.Matcher;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestMovimiento extends CoreMatchers {
	private static Movimiento m;
	@BeforeAll
	static void init() {
	m = new Movimiento();
	}

	@AfterAll
	static void finish() {
	m = null;
	}
	@Test
	void testGetImporte() {
	m.setImporte(300.0);
	assertThat("no funciona.", m.getImporte(), is(300.0));
	}

	@Test
	void testGetConcepto() {
	m.setConcepto("Comida");
	assertThat(" no funciona.", m.getConcepto(), is("Comida"));
	}
	
	@Test
	void testSetConcepto() {
		m.setConcepto("Comida");
		assertThat("El metodo no funciona.", m.getConcepto(), is("Comida"));
		}
	

	
	@Test
	void testSetImporte()   {
		m.setImporte(300.0);
		assertThat("el metodo no funciona.", m.getImporte(), is(300.0));
		}
}
