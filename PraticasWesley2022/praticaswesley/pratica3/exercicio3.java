package praticaswesley.pratica3;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double cotdolar = 0, reaisuser = 0, qtddolar = 0;

        cotdolar = 4.74;
        System.out.println("No dia 31/03/2022, a cotação do dolár está atualmente em: " + cotdolar + " reais");

        System.out.println("Você tem quantos reais? ");
        reaisuser = input.nextDouble();

        if (reaisuser > 0) {
            qtddolar = reaisuser / cotdolar;
            System.out.println("Você possui: " + String.format("%.2f", qtddolar) + " dólares.");
        } else {
            System.out.println("Você não possui dólares.");
        }
    }
}
