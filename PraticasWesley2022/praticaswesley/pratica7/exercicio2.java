package praticaswesley.pratica7;

import java.util.Scanner;

public class exercicio2 {
    /*Leia 2 números inteiros positivos e que imprima todos os números inteiros existentes
    entre esses dois limites informados.*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2;
        int i;

        System.out.print("Entre com o valor 1: ");
        num1 = input.nextInt();
        System.out.print("Entre com o valor 2: ");
        num2 = input.nextInt();
        
        for (i = num1; i < num2; i++) {
            System.out.println(i);
        }
    }
}
