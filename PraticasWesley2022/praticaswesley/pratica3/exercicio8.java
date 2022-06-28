package praticaswesley.pratica3;
import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int peso;
        int emagrecer;
        int engordar;

        System.out.println("Entre com seu peso: ");
        peso = input.nextInt();

        engordar = ((peso * 15) / 100) + peso;
        emagrecer = -((peso * 20) / 100) + peso;

        System.out.println(
                "Se engordar, seu peso vai para: " + engordar + "\nSe emagrecer, seu peso vai para: " + emagrecer);
    }
}
