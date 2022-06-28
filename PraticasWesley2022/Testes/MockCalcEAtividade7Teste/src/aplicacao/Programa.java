package Testes.MockCalcEAtividade7Teste.src.aplicacao;

import entidades.ChamaServico;

/*
public class Programa {

	public static void main(String[] args) {
		ChamaServico cs = new ChamaServico();
		System.out.println(cs.adicionarDoisNumeros(10, 10));
	}
}
*/

import entidades.ServicoEquacaoSegundoGrau;
public class Programa {
	public static void main (String[] args) {
		ServicoEquacaoSegundoGrau servicoEquacao = new ServicoEquacaoSegundoGrau();
		System.out.println(servicoEquacao.delta());
		System.out.println(servicoEquacao.x());
		System.out.println(servicoEquacao.x1());
		System.out.println(servicoEquacao.x2());
	}
}