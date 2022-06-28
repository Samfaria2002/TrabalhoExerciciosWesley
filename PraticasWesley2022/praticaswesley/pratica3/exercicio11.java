package praticaswesley.pratica3;
import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        int multiplicar;
        int i;

        System.out.println("Entre com um número para ver a tabuada: ");
        num = input.nextInt();

        for (i = 0; i <= 10; i++) {
            multiplicar = num * i;
            System.out.println(num + " x " + i + " = " + multiplicar);
        }
    }
}
