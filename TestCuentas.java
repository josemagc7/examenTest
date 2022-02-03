package es.iessoterohernandez.daw.endes.pruebaJUnit;

import static org.hamcrest.MatcherAssert.assertThat;

import static org.junit.jupiter.api.Assertions.*;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestCuentas extends CoreMatchers{
	private static Cuenta c;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		c=new Cuenta("2", "Pedro");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		c=null;
	}

	@Test
	void testCuenta() {
		assertThat("El metodo test cuenta no funciona", c, notNullValue());
	}

	@Test
	
		void testIngresar() throws IngresoNegativoException {
			c.ingresar("Nomina", 400.0);
			assertThat("el metodo ingresar no funciona", c.getSaldo(), is(780.0));
			}
	

	@Test
	void testRetirar() throws IngresoNegativoException, SaldoInsuficienteException {
		c.ingresar("Nomina", 400.0);
		c.retirar("Comida", 20.0);
		assertThat("El metodo retirar no funciona", c.getSaldo(), is(380.0));
		}

	

}
