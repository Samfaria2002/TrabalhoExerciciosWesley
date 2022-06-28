package praticaswesley.pratica9;

import java.util.Scanner;

public class exercicio1 {

    /*Em linguagem de programação Java, escreva um algoritmo que leia os elementos de
    uma matriz 5 x 5 a partir do teclado. O algoritmo deve:
        a. Imprimir a matriz informada. Exemplo:

        b. Imprimir os elementos armazenados nas posições em que o índice da linha é
        par e o índice da coluna é ímpar. Exemplo:

        c. Imprimir a matriz transposta a matriz informada. OBS: na matriz transposta,
        as linhas da matriz tornam-se colunas e as colunas, linhas.

        d. Trocar os elementos da diagonal principal com os elementos da diagonal
        secundária. Imprimir a matriz resultante.
    */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int i, j;
        int[][] matriz = new int[5][5];

        //Entrando com os números na Matriz
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {

                System.out.println("Informe um número: ");
                matriz[i][j] = input.nextInt();

            }
        }
        
        //Printa a Matriz
        System.out.println("Matriz informada:");
        for (i = 0; i < matriz.length; i++) {

            for (j = 0; j < matriz[i].length; j++) {
                System.out.printf("%2d ", matriz[i][j]);
            }

            System.out.println();
        }
        
        //Printar as linhas pares com colunas ímpares
        System.out.println("\nElementos armazenados nas posições em que o índice da linha é par e o índice da coluna é ímpar: ");
        for (i = 0; i < matriz.length; i++) {

            for (j = 0; j < matriz[i].length; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 1) {
                        System.out.printf("%2d ", matriz[i][j]);
                    }
                }
            }
        }

        //Matriz transposta
        int [][] matriztransposta = new int [5][5];
        System.out.println("\nMatriz Transposta: ");
        for (j = 0; j < matriz.length; j++) {
            for (i = 0; i < matriz[j].length; i++) {
                matriztransposta[j][i]= matriz[i][j];
                System.out.printf("%2d " , matriztransposta[j][i]);
            }

            System.out.println();
        }

        //Inverter os valores das diagonais
        System.out.println("\nDiagonais invertidas: ");
        for (i = 0; i < matriz.length; i++) {

            for (j = 0; j < matriz[i].length; j++) {
                if(j == i) {
                    System.out.print(matriz[4-i][4-j]+" ");
                } else {
                    System.out.print(matriz[i][j]+" ");
                }
            }

            System.out.println();
                
        }
    }
}