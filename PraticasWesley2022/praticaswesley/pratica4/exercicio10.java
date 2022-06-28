package praticaswesley.pratica4;

import java.util.Scanner;

public class exercicio10 {
    /*10) Receba 2 números e mostre o seguinte menu:

    1 - Somar os dois números.
    2 - Multiplicar os dois números.
    3 - Subtrair o número maior pelo número menor (se os dois forem iguais, retorne zero).
    4 - Dividir o primeiro número pelo segundo (lembre-se de que não existe divisão por zero).

    De acordo com a opção escolhida, o algoritmo deve apresentar o resultado correspondente.*/

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int num1, num2;
        int indice;

        System.out.println("Entre com os 2 números: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        System.out.println("Escolha um número para realizar uma operação:\n1 - Somar\n2 - Subtrair\n3 - Multiplicar\n4 - Dividir");
        indice = input.nextInt();

        if (indice == 1) {
            System.out.println("Soma: "+ (num1 + num2));
        } else if (indice == 2) {
            System.out.println("Subtração: "+ (num1 - num2));
        } else if (indice == 3) {
            System.out.println("Multiplicação: "+ (num1 * num2));
        } else if (indice == 4) {
            System.out.println("Dividir: "+ (num1 / num2));
        }
    }
}
