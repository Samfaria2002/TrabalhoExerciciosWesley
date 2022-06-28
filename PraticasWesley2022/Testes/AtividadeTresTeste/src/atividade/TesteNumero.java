package Testes.AtividadeTresTeste.src.atividade;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteNumero {
	
	Numero num;

	@Before
	public void setUp() throws Exception {
		num = new Numero();
	}

	@Test
	public void testRaizCubica() {
		assertEquals("CASO 1: ", 3, num.raizCubica(27), 0);
		assertEquals("CASO 2: ", 2.71, num.raizCubica(20), 0.01);
	}

	
	@Test(expected = AssertionError.class)
	public void testFatorial() {
		assertEquals("CASO 3: ", 120, num.fatorial(5), 0);
		assertEquals("CASO 4: ", 1, num.fatorial(0), 0);
	}

	@Test(expected = AssertionError.class)
	public void testSomaIntervalo() {
		assertEquals("CASO 5: ", 15, num.somaIntervalo(5), 0);
		assertEquals("CASO 6: ", 0, num.somaIntervalo(0), 0);
	}
	

}
