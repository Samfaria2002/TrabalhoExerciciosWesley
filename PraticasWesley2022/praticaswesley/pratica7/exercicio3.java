package praticaswesley.pratica7;

import java.util.Scanner;

public class exercicio3 {
    /*
    Calcule o fatorial de um número. O fatorial de um número n é representado por n! e é
    calculado como apresentado abaixo:
    n! = n x (n – 1) x (n – 2) x ... x 2 x 1, para n > 0 e 0! = 1.
        Exemplos:
        5! = 5 x 4 x 3 x 2 x 1 = 120
        4! = 4 x 3 x 2 x 1 = 24
        3! = 3 x 2 x 1 = 6
        2! = 2 x 1 = 2
        1! = 1
        0! = 1 (OBS: o fatorial de 0 é sempre 1).
    O algoritmo deve ler um número natural informado pelo usuário a partir do teclado e
    informar o fatorial desse número. Se o usuário inserir um número negativo, o algoritmo
    deve informar que o número é inválido.
    */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;
        int i;
        int fatorial = 1;
        System.out.print("Entre com o número que será fatorado: ");

        numero = input.nextInt();
        
        for(i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);

    }

}