package praticaswesley.pratica8;

import java.util.Scanner;

public class exercicio1 {
    
    /*Leia 10 números inteiros a partir do teclado e os armazene em um vetor. O algoritmo
    deve imprimir o vetor e apresentar a soma dos números pares.*/

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int i;
        int[] num = new int[10];
        int soma = 0;

        for (i = 0; i < num.length; i++) {
            System.out.println("Entre com um número");

            num[i] = input.nextInt();

            soma = soma + num[i];
        }

        System.out.println("A soma do vetor é: " + soma);
        for (i = 0; i < num.length; i++){
            System.out.printf("v[%d] = %2d\n", i, num[i]);
        }
    }
}
