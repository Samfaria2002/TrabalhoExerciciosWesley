package praticaswesley.pratica4;

import java.util.Scanner;

public class exercicio12 {
    /*Leia a idade e sexo do cliente de uma academia de musculação e imprima o valor da
    mensalidade a ser paga. A academia possui a seguinte tabela para cobrança da
    mensalidade de seus clientes:*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idade;
        int mensalidade = 0;
        char sexo;

        System.out.println("Entre com sua idade e sexo (M ou F): ");
        idade = input.nextInt();
        sexo = input.next().charAt(0);

        if (sexo == 'm') {
            if (idade <= 15) {
                mensalidade = 60;
            } else if (idade >= 16 && idade <= 18) {
                mensalidade = 75;
            } else if (idade >= 19 && idade <= 30) {
                mensalidade = 90;
            } else if (idade >= 31 && idade <= 40) {
                mensalidade = 85;
            } else if (idade > 40) {
                mensalidade = 80;
            }
        } else if (sexo == 'f') {
            if (idade <= 18) {
                mensalidade = 60;
            } else if (idade >= 19 && idade <= 25) {
                mensalidade = 90;
            } else if (idade >= 26 && idade <= 40) {
                mensalidade = 85;
            } else if (idade > 40) {
                mensalidade = 80;
            }
        }

        System.out.println("Sua mensalidade é: "+ mensalidade);
    }
}
