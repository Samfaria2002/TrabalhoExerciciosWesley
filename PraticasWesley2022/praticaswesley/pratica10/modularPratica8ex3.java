package praticaswesley.pratica10;

import java.util.Scanner;

public class modularPratica8ex3 {
    private int i;
    private String entrada;
    private double maior = 0.0;
    private double menor = 99999999.9;
    private double[] num = new double[10];

    public Scanner input = new Scanner(System.in);

    public modularPratica8ex3() {
        entrada();
    }

    private void entrada() {
        for (i = 0; i < num.length; i++) {
            System.out.println("Entre com um número");

            entrada = input.next();
            num[i] = Double.parseDouble(entrada);

            if (num[i] > maior) {
                maior = num[i];
            } else if (num[i] < menor) {
                menor = num[i];
            }
        }
        retorna();
    }

    private void retorna() {
        for (i = 0; i < num.length; i++){
            System.out.printf("v[%d] = "+num[i] + "\n", i);
        }
        System.out.println("Menor: "+ menor + "\nMaior: " + maior);
    }

    public static void main(String[] args) {
        new modularPratica8ex3();
    }
}
