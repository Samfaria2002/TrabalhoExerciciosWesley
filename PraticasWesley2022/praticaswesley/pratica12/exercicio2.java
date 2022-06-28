package praticaswesley.pratica12;

import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) throws Exception {

        int num1, num2;

        Scanner input = new Scanner(System.in);
        exercicio2secundaria ex = new exercicio2secundaria();
        
        System.out.println("Entre com o número 1 e 2 respectivamente: ");
        ex.setNum1(input.nextInt());
        ex.setNum2(input.nextInt());

        try {
            System.out.println(ex.divide());
        } catch (Exception e) {
            System.out.println("Um ou mais números introduzidos para a divisão são iguais a zero, lhe foi atribuído um valor padrão '2'");
            if (ex.getNum1() == 0) {
                ex.setNum1(2);
            } else if (ex.getNum2() == 0) {
                ex.setNum2(2);
            }
            System.out.println(ex.divide());
        }
    }
}
