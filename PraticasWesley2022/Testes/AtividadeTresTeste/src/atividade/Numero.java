package Testes.AtividadeTresTeste.src.atividade;

public class Numero {

	private double resDouble = 0;
	private int resInt = 0;
	
	public double raizCubica(double val) {
		if (val >=0)
			resDouble = Math.cbrt(val);
		else
			throw new IllegalArgumentException("O Valor n�o pode ser negativo");
		
		System.out.println(resDouble);
		return resDouble;
	}	
	
	public int fatorial(int val) {
		if (val == 0)
			resInt = 1;
		else if(val < 0)
			throw new IllegalArgumentException("O Valor n�o pode ser negativo");
		else {
			resInt = val;
			for(int i = val; val > 0; val--) {
				resInt = resInt * i;
			}
		}
			
		return resInt;
	}	
	
	public int somaIntervalo(int val) {
		for(int i = 0; i < val; i++) {
			resInt += i; 
		}
		return resInt;
	}
	
}
