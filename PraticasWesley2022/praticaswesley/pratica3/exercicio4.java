package praticaswesley.pratica3;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double salario;
        double novoSalario;

        System.out.println("Entre com seu salário para aumento de 25%: ");
        salario = input.nextDouble();

        novoSalario = ((salario * 25) / 100) + salario;

        System.out.println("Com o aumento de 25%, seu salário passou para " + novoSalario);
    }
}
