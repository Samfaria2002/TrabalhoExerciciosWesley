package Testes.MockCalcEAtividade7Teste.src.teste;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import entidades.ServicoEquacaoSegundoGrau;
import entidades.EquacaoSegundoGrauInterface;

public class EquacaoSegundoGrauTeste {
	
	ServicoEquacaoSegundoGrau objTeste;

	@Before
	public void setUp() throws Exception {
		// a 1 b 6 c 7
		objTeste = Mockito.mock(ServicoEquacaoSegundoGrau.class);
		Mockito.when(objTeste.delta()).thenReturn((double) 8);
		Mockito.when(objTeste.x()).thenReturn(-0.5);
		Mockito.when(objTeste.x1()).thenReturn(-1.59);
		Mockito.when(objTeste.x2()).thenReturn(-4.41);
		//objTeste = new ServicoEquacaoSegundoGrau();
		//objTeste.setCalc(objTeste);
	}
	
	@After
	public void tearDown() throws Exception {
		objTeste = null;
		System.gc(); // Chamada ao Garbage Collector.
	}


	@Test
	public void testDelta() {
		assertEquals("CASO 1", 8, objTeste.delta(), 0);
	}

	@Test
	public void testX() {
		assertEquals("CASO 2", -0.5, objTeste.x(), 0);
	}

	@Test
	public void testX1() {
		assertEquals("CASO 3", -1.59, objTeste.x1(), 0);
	}

	@Test
	public void testX2() {
		assertEquals("CASO 3", -4.41, objTeste.x2(), 0);
	}

}
