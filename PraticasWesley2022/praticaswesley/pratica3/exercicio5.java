package praticaswesley.pratica3;
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int diagmaior = 0, diagmenor = 0;
        double arealos;

        System.out.println("Qual a diagonal maior? ");
        diagmaior = input.nextInt();

        System.out.println("Qual a diagonal menor? ");
        diagmenor = input.nextInt();

        arealos = (diagmaior * diagmenor) / 2;

        System.out.println("A área desse losango é: " + String.format("%.2f", arealos));
    }
}
