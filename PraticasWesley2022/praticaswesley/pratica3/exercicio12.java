package praticaswesley.pratica3;
import java.util.Scanner;

public class exercicio12 {

    int a, b, c;
    double delta, x1, x2;

    Scanner input = new Scanner(System.in);

    public exercicio12() {
        deltaCalculo();
    }

    private void deltaCalculo() {

        System.out.println("Digite os valores de A, B e C respectivamente: ");

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        delta = (b * b) - 4 * (a * c);

        System.out.println("Delta: " + delta);

        if (delta >= 0) {
            raiz();
        } else {
            System.out.println("Delta não possui raiz!");
            System.exit(0);
        }
    }

    private void raiz() {

        x1 = (double) ((- b + Math.sqrt(delta)) / 2 * a);
        x2 = (double) ((- b - Math.sqrt(delta)) / 2 * a);

        System.out.println("X1 = " + x1);
        System.out.println("X2 = " + x2);
    }

    public static void main(String[] args) {
        new exercicio12();
    }

}