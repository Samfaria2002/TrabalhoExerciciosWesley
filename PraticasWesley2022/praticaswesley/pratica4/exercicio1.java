package praticaswesley.pratica4;

import java.util.*;

public class exercicio1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int nota1;
        int nota2;
        int media;

        System.out.println("Entre coma primeira nota: ");
        nota1 = input.nextInt();
        System.out.println("Entre com a segunda nota: ");
        nota2 = input.nextInt();

        media = (nota1 + nota2) / 2;

        if (media >= 7) {
            System.out.println("Aprovado! Média maior ou igual a 7.");
        } else if (media < 7) {
            System.out.println("Reprovado! Média menor que 7.");
        }
    }
}
