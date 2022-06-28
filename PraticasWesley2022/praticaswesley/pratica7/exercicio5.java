package praticaswesley.pratica7;

import java.util.Scanner;

public class exercicio5 {
    /*Leia uma quantidade indeterminada de números inteiros e que exiba o maior e o menor
    número informado.*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i;
        String entrada;
        int num;
        int media;
        int maiorNum = 0;
        int menorNum = 99999999;
        int soma = 0;

        System.out.println("Entre com quantas idades quiser (digite 'parar' para cancelar): ");
        for (i = 0; i >= 0; i++) {
            entrada = input.next();
            num = Integer.parseInt(entrada);
            if (entrada == "parar") {
                break;
            }
            if (num > maiorNum){
                maiorNum = num;
            } else if (num < menorNum) {
                menorNum = num;
            }
            
        }
        System.out.println("O maior número é: " + maiorNum + "\nO menor número é: "+ menorNum);
    }
}