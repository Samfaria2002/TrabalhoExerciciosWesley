package praticaswesley.pratica3;
import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double celsius, far, kel;

        System.out.print("Temperatura em Celsius: ");
        celsius = input.nextDouble();

        far = 9 * celsius / 5 + 32;
        kel = celsius + 273.15;

        System.out.println("Convertido em Farenheit: " + String.format("%.2f", far));
        System.out.println("Convertido em Kelvin: " + String.format("%.2f", kel));
    }
}
