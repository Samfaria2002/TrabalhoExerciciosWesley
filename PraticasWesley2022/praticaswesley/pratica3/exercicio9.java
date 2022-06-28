package praticaswesley.pratica3;
import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double cateto1 = 0, cateto2 = 0;
        double teorema;
        double hipotenusa;

        System.out.println("Teorema de Pitagoras. Entre com os valores dos catetos");
        cateto1 = input.nextDouble();
        cateto2 = input.nextDouble();

        teorema = Math.pow(cateto1, 2) + Math.pow(cateto2, 2);
        hipotenusa = Math.sqrt(teorema);
        System.out.println("O valor da Hipotenusa é: " + String.format("%.2f", hipotenusa));

        input.close();
    }
}
