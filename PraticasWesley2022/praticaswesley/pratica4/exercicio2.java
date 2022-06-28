package praticaswesley.pratica4;

import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int lado1;
        int lado2;
        int lado3;

        System.out.println("Entre com os 3 lados do triângulo: ");
        lado1 = input.nextInt();
        lado2 = input.nextInt();
        lado3 = input.nextInt();

        if (lado1 == lado2 && lado1 == lado3) {
            System.out.println("Equilátero");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("Isósceles");
        } else {
            System.out.println("Escaleno");
        }
    }

}
