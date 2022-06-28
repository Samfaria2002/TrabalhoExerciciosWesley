package praticaswesley.pratica10;

import java.util.Scanner;

public class modularPratica8ex1 {
    /*Leia 10 números inteiros a partir do teclado e os armazene em um vetor. O algoritmo
    deve imprimir o vetor e apresentar a soma dos números pares.*/

    private int i;
    private int[] num = new int[10];
    private int soma = 0;
    public Scanner input = new Scanner(System.in);

    public modularPratica8ex1() {
        entrada();
    }

    private void entrada() {
        for (i = 0; i < num.length; i++) {
            System.out.println("Entre com um número");

            num[i] = input.nextInt();

            soma = soma + num[i];
        }
        retorna();
    }

    private void retorna() {
        System.out.println("A soma do vetor é: " + soma);
        for (i = 0; i < num.length; i++){
            System.out.printf("v[%d] = %2d\n", i, num[i]);
        }
    }

    public static void main(String[] args) {
        
        new modularPratica8ex1();
        
    }
}
