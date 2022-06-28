package praticaswesley.pratica3;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int anonasc, anoatual;
        int somaatual = 0;
        int soma2050 = 0;

        System.out.println("Quando você nasceu? ");
        anonasc = input.nextInt();

        System.out.println("Qual o ano atual? ");
        anoatual = input.nextInt();

        if (anonasc < anoatual) {
            somaatual = anoatual - anonasc;
        }

        System.out.println("Atualmente, você tem: " + somaatual);

        if (anonasc < 2050) {
            soma2050 = 2050 - anonasc;
        }

        System.out.println("Em 2050, você terá: " + soma2050);
    }
}
