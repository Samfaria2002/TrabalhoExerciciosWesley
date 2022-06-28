package praticaswesley.pratica2;

import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x;
        int y;
        int z;
        int calc;

        System.out.println("Entre com os valores de x: ");
        x = input.nextInt();
        System.out.println("Entre com os valores de y: ");
        y = input.nextInt();
        System.out.println("Entre com os valores de z: ");
        z = input.nextInt();

        calc = x + y - z;

        System.out.println("O resultado de 'x + y - z' é: " + calc);
    }

}
