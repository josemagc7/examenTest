package es.iessoterohernandez.daw.endes.pruebaJUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestEmpleado extends CoreMatchers {
	private static Empleado e,o;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		e=new Empleado("Pedro", "Hermoso",26 , 800);
		o=new Empleado("Julian", "Oso",29 , 1200);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	void testEqualsEmpleado() {
		assertThat("el metodo no funciona", e.equals(o), is(false));
	}

	@Test
	void testCompareTo() {
		assertThat("El metodo no funciona", e.compareTo(o), is(-1));
	}

	@Test
	void testEmpleadoStringStringIntDouble() {
		assertThat("El metodo empleado no funciona", e, notNullValue());
	}

}
