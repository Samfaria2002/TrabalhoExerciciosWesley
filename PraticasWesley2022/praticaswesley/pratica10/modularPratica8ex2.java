package praticaswesley.pratica10;

import java.util.Scanner;

public class modularPratica8ex2 {

    private int i;
    private String entrada;
    private double[] num = new double[10];

    public Scanner input = new Scanner(System.in);

    public modularPratica8ex2() {
        entrada();
    }

    private void entrada() {
        for (i = 0; i < num.length; i++) {
            System.out.println("Entre com um número");

            entrada = input.next();
            num[i] = Double.parseDouble(entrada);

        }
        retorna();
    }

    private void retorna() {
        for (i = 0; i < num.length; i++){
            if (num[i] < 0) {
                System.out.printf("v[%d] = "+num[i] + "\n", i);
            }
        }
    }

    public static void main(String[] args) {
        
        new modularPratica8ex2();
        
    }
}
