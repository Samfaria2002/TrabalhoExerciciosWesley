package praticaswesley.pratica3;

import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {

        int soma = 0;
        int nota;
        int media;
        int i = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Entre com 3 valores para o cálculo da média: ");

        do {

            System.out.println((i + 1) + "° valor: ");
            nota = input.nextInt();
            soma += nota;
            i++;

        } while (i < 3);

        media = soma / i;

        System.out.println("A média dos 3 números resultou em: " + media);
    }
}
