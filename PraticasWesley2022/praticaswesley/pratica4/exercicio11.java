package praticaswesley.pratica4;

import java.util.Scanner;

public class exercicio11 {
    /*Leia o número de diárias e calcule o total a ser pago pelo cliente de um hotel. O hotel
    cobra R$ 500,00 a diária e mais uma taxa de serviços. A taxa de serviços é de:
     R$ 15,00 por dia, se número de diárias < 15.
     R$ 10,00 por dia, se número de diárias = 15.
     R$ 5,00 por dia, se número de diárias > 15.*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int diarias;
        int valorTotal;
        int taxaServico = 0;
        int taxaServicoTotal;

        System.out.print("Entre com o número de diárias: ");
        diarias = input.nextInt();
        valorTotal = diarias * 500;

        if (diarias < 15) {
            taxaServico = 15;
        } else if (diarias == 15) {
            taxaServico = 10;
        } else if (diarias > 15) {
            taxaServico = 5;
        }

        taxaServicoTotal = taxaServico * diarias;

        System.out.println("Seu valor total das diárias é de: "+ valorTotal +"\nO valor da taxa de serviço das diárias é de: "+ taxaServicoTotal);
    }
}
