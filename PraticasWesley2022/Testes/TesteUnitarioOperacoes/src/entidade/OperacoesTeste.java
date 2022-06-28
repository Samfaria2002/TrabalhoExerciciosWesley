package Testes.TesteUnitarioOperacoes.src.entidade;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OperacoesTeste {
	
	Operacoes op1, op2;
	
	// op2 foi criado para testar assertiva "same" (verifica se � o mesmo objeto).
	
	// @ Before � executado uma �nica vez:
	@Before
	public void setUp() throws Exception {
		op1 = new Operacoes();
		op2 = new Operacoes();
	}
		
	@After
	public void tearDown() throws Exception {
		op1 = null;
		op2 = null;
		System.gc(); // Chamada do Garbage Collector.		
	}

	@Test
	public void deveriaVerificarMaiorValor() {
		// assertEquals("TEXTO ", valor esperado, objeto.m�todo(lista de par�metros), delta);
		assertEquals("CASO 1:", 16, op1.maiorValor(16, 9), 0); //delta = varia��o no valor.
		assertEquals("CASO 2:", 17, op1.maiorValor(16, 9), 1);
		assertEquals("CASO 3:", 14, op1.maiorValor(16, 9), 2);
	}

	@Test
	public void deveriaVerificarMenorValor() {
		/*
		assertTrue("TEXTO ", valor esperado ==  objeto.m�todo(lista de par�metros));
		assertFalse("TEXTO ", valor esperado ==  objeto.m�todo(lista de par�metros));
		*/
		assertFalse("CASO 4: ", 16 == op1.menorValor(16, 9));
		assertTrue("CASO 5: ", 9 == op2.menorValor(16, 9));	
		//assertTrue("CASO VARIA��O: ", 8 == op2.menorValor(16, 9), 1); <- assertTrue n�o aceita varia��o (delta).	
	}
	
	@Test
	public void deveriaCompararDoisObjetos() {
		/*
		 * assertSame("TEXTO ", objeto1, objeto2); 
		 * assertNotSame("TEXTO ", objeto1, objeto2);
		 */
		assertSame("CASO 6: ", op1, op1);
		assertNotSame("CASO 7: ", op1, op2);
		op2 = op1;
		assertSame("CASO 7: ", op1, op2);
	}
	
	// Teste adicional
	// Refer�ncia: teste anterior (same)
	@Test
	public void verificandoHashDosObjetos() {
		System.out.println("Hash de o1: " + op1.hashCode());
		System.out.println("Hash de o1: " + op2.hashCode());
	}

	@Test
	public void deveriaCalcularRaizQuadrada() {
		assertEquals("CASO 8: ", 9.380, op1.raizQuadrada(88), 0.001);
		/*
		 * Para evitar o erro:
		 * expected 9.38 but was: 9.380831151964686
		 * foi usado "delta" 0.001
		 */
	}

	@Test(expected = AssertionError.class)
	public void deveriaCalcularDivisao() {
		assertEquals("CASO 9: ", 25, op1.divide(50, 2), 0);
		assertEquals("CASO 10: ", 0, op1.divide(50, 0), 0);
		assertEquals("CASO 11: ", 0, op1.divide(0, 0), 0);
		/*
		 * 50/0 => Infinity (para doubles)
		 * 0/0 => NaN
		 * Para evitar e documentar o problema usamos assertiva AssertionError
		 */
	}

	@Test(expected = AssertionError.class)
	public void deveriaCalcularProduto() {
		assertEquals("CASO 12: ", 1000000000, op1.produto(1000000, 1000000), 0);
	}
	
	// Teste adicional (timeout)
	@Test(timeout = 100)
	public void verificandoTempoDeExecucaoAcumulador() {		
		op1.acumulador(10000);
	    /* Exemplo de timeOut com sa�da na console
	     * At� 10000 Passa (para esse exemplo)
	     * para valores maiores o teste "falha"
	     */
	}	

	@Test
	public void deveriaCalcularSoma() {
		assertEquals("CASO 13: ", 20, op1.soma(10, 10), 0);
		assertFalse("CASO 14: ", 21 == op1.soma(10, 10));
		assertTrue("CASO 15: ", 20 == op1.soma(10, 10));
	}
}
