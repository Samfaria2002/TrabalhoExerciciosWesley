package Testes.AtividadeTresTeste.src.atividade;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ImcTeste {

	Imc teste;
	
	@Before
	public void setUp() throws Exception {
		teste = new Imc();
	}

	@Test
	public void testCalcularIMC() {
		assertEquals("Abaixo do peso", teste.calcularIMC(65, 1.90));
		assertEquals("Peso normal", teste.calcularIMC(70, 1.70));
		assertEquals("Sobre peso", teste.calcularIMC(80, 1.75));
		assertEquals("Obeso", teste.calcularIMC(110, 1.73));
		assertEquals("Obeso m�rbido", teste.calcularIMC(115, 1.60));
	}

}
