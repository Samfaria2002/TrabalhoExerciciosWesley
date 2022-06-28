package praticaswesley.pratica8;

import java.util.Scanner;

public class exercicio2 {
    
    /*Leia 10 números reais a partir do teclado e os armazene em um vetor. O algoritmo deve
    imprimir o vetor e as posições do vetor que armazenam números negativos.*/

    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i;
        String entrada;
        double[] num = new double[10];

        for (i = 0; i < num.length; i++) {
            System.out.println("Entre com um número");

            entrada = input.next();
            num[i] = Double.parseDouble(entrada);

        }

        for (i = 0; i < num.length; i++){
            if (num[i] < 0) {
                System.out.printf("v[%d] = "+num[i] + "\n", i);
            }
        }
    }
}