package es.iessoterohernandez.daw.endes.pruebaJUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestIngresoNegativo extends CoreMatchers {
	private static IngresoNegativoException i;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		i=new IngresoNegativoException("ingreso negativo");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	void testIngresoNegativoException() {
		assertThat("el metodo no va", i.equals(i), is(true));
		
	}

}
