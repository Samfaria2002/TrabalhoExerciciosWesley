package praticaswesley.pratica4;

import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double peso;
        double altura;
        double imc;

        System.out.println("Entre com o peso e a altura, respectivamente: ");
        peso = input.nextFloat();
        altura = input.nextFloat();

        imc = peso / Math.pow(altura, 2);

        if (imc < 20) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 20 && imc < 25) {
            System.out.println("Normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Sobrepeso");
        } else if (imc >= 30 && imc < 40) {
            System.out.println("Obesidade");
        } else if (imc >= 40) {
            System.out.println("Obesidade Mórbida");
        }

    }

}
