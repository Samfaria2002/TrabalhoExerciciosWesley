package Testes.AtividadeTresTeste.src.atividade;

public class Imc {
	
	public String calcularIMC(double peso, double altura) {
		
		double imc = peso/Math.pow(altura, 2);
		
		//System.out.println(imc + " " + peso + " " + Math.sqrt(altura));
		
		String res = "";
		if (imc <= 20) {
			res = "Abaixo do peso";
		} else if (imc > 20 && imc <= 25) {
			res = "Peso normal";
		} else if (imc > 25 && imc <= 30) {
			res = "Sobre peso";
		} else if (imc > 30 && imc <= 40) {
			res = "Obeso"; 
		} else {
			res = "Obeso m�rbido";
		}
		
		return res;
	}
	
}
