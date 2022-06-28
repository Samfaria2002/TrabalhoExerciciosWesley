package praticaswesley.pratica8;

import java.util.Scanner;

public class exercicio3 {
    /*Leia 10 números reais a partir do teclado e os armazene em um vetor. O algoritmo deve
    imprimir o vetor, o menor e o maior número informado.*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i;
        String entrada;
        double maior = 0.0;
        double menor = 99999999.9;
        double[] num = new double[10];

        for (i = 0; i < num.length; i++) {
            System.out.println("Entre com um número");

            entrada = input.next();
            num[i] = Double.parseDouble(entrada);

            if (num[i] > maior) {
                maior = num[i];
            } else if (num[i] < menor) {
                menor = num[i];
            }

        }

        for (i = 0; i < num.length; i++){
            System.out.printf("v[%d] = "+num[i] + "\n", i);
        }
        System.out.println("Menor: "+ menor + "\nMaior: " + maior);
    }
}
