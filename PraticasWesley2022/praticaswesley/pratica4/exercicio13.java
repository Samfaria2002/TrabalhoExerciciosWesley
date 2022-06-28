package praticaswesley.pratica4;

import java.util.Locale;
import java.util.Scanner;

public class exercicio13 {
    /*Leia a tipo de apartamento e a quantidade de dias em que um hóspede esteve
    hospedado em um hotel e apresente o total a ser pago. O hotel possui a seguinte tabela
    para cobrança da diária de seus clientes:*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String tipo;
        int qtdDias;
        int valor = 0;

        System.out.println("Entre com o tipo do apartamento (simples ou duplo) e a quantidade de dias hospedado (respectivamente): ");
        tipo = input.next().toLowerCase(Locale.getDefault());
        qtdDias = input.nextInt();

        if (tipo == "simples") {
            if (qtdDias < 10) {
                valor = 100;
            } else if (qtdDias > 10 && qtdDias < 15) {
                valor = 90;
            } else if (qtdDias > 15) {
                valor = 80;
            }
        } else if (tipo == "duplo") {
            if (qtdDias < 10) {
                valor = 140;
            } else if (qtdDias > 10 && qtdDias < 15) {
                valor = 120;
            } else if (qtdDias > 15) {
                valor = 100;
            }
        }

        System.out.println("O valor a ser pago é: " + valor);
    }
}
