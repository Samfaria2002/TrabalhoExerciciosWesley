package praticaswesley.pratica4;

import java.util.Scanner;

public class exercicio7 {

    int a;
    int b;
    int c;
    int delta;
    double x, x1, x2;

    Scanner input = new Scanner(System.in);

    public exercicio7() {
        deltacalc();
    }

    private void deltacalc() {

        System.out.println("Entre com os valores de a, b e c respecitivamente para o cálculo do delta: ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        if (a == 0 && b == 0 && c == 0) {
            System.out.println("Igualdade confirmada 0 = 0");
            System.exit(0);
        } else if (a == 0 && b == 0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente");
            System.exit(0);
        }

        delta = (b * b) - 4 * (a * c);

        System.out.println("Delta :" + delta);

        if (delta >= 0) {
            System.out.println("Se delta for igual a 0, as raízes serão iguais");
            System.out.println("Se delta for maior que 0, as raízes serão diferentes");
            raiz();
        } else {
            System.out.println("Delta não possui raizes reais ou a raiz é raiz negativa!");
            System.exit(0);
        }
    }

    private void raiz() {

        x1 = (double) ((-b + Math.sqrt(delta)) / 2 * a);
        x2 = (double) ((-b - Math.sqrt(delta)) / 2 * a);

        System.out.println("X1 = " + x1);
        System.out.println("X2 = " + x2);
    }

    public static void main(String[] args) {
        new exercicio7();
    }
}
