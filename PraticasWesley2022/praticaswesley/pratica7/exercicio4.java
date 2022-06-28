package praticaswesley.pratica7;

import java.util.Scanner;

public class exercicio4 {
    /*Leia uma quantidade indeterminada de idades e que calcule e mostre a média das
    idades informadas.*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i;
        int idade;
        int media;
        int soma = 0;

        System.out.println("Entre com quantas idades quiser (entre com a idade 0 para cancelar): ");
        for (i = 0; i >= 0; i++) {
            idade = input.nextInt();
            if (idade == 0) {
                break;
            }
            soma = idade + soma;
        }

        media = soma / i;
        System.out.println("A média é: " + media);
    }
}
