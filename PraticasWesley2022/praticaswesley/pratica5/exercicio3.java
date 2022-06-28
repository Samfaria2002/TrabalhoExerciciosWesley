package praticaswesley.pratica5;

import java.util.Scanner;

public class exercicio3 {
    /*
     * Realize uma pesquisa de audiência de canal de TV em várias casas de uma
     * cidade em um
     * determinado dia. Para cada casa consultada, devem ser fornecidos: o número do
     * canal
     * (4, 5, 7, 12) e o número de pessoas que estavam assistindo àquele canal. O
     * algoritmo
     * deve:
     * a. Ler um número indeterminado de dados: número do canal e número de
     * pessoas assistindo o canal.
     * b. Calcular e apresentar o percentual de audiência de cada canal.
     * c. Encerrar o processamento quando o usuário informar o número do canal
     * igual a ZERO.
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int canal = 1;
        int[] canais = { 4, 5, 7, 12 };
        int c4 = 0, c5 = 0, c7 = 0, c12 = 0;
        int p4 = 0, p5 = 0, p7 = 0, p12 = 0;
        int p4soma = 0, p5soma = 0, p7soma = 0, p12soma = 0;
        int pessoas;
        int pessoasSoma = 0;

        while (canal >= 1) {
            System.out.println("Entre com o número do canal: ");
            canal = input.nextInt();
            System.out.println("Quantas pessoas estavam assistindo a esse canal?");
            pessoas = input.nextInt();

            if (canal == 4) {
                c4++;
                p4 = pessoas;
                p4soma = p4soma + p4;
            } else if (canal == 5) {
                c5++;
                p5 = pessoas;
                p5soma = p5soma + p5;
            } else if (canal == 7) {
                c7++;
                p7 = pessoas;
                p7soma = p7soma + p7;
            } else if (canal == 12) {
                c12++;
                p12 = pessoas;
                p12soma = p12soma + p12;
            }

            pessoasSoma = pessoas + pessoasSoma;

        }
    }
}
