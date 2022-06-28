package praticaswesley.pratica10;

import java.util.Scanner;

public class modularPratica9 {

    Scanner input = new Scanner(System.in);
    int i, j;
    int[][] matriz = new int[5][5];

    public modularPratica9() {
        defineMatriz();
    }

    private void defineMatriz() {
        //Entrando com os números na Matriz
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {

                System.out.println("Informe um número: ");
                matriz[i][j] = input.nextInt();

            }
        }
        printMatriz();
        elementoParImpar();
        matrizTransposta();
        inverteDiagonal();
    }

    private void printMatriz() {
        //Printa a Matriz
        System.out.println("Matriz informada:");
        for (i = 0; i < matriz.length; i++) {

            for (j = 0; j < matriz[i].length; j++) {
                System.out.printf("%2d ", matriz[i][j]);
            }

            System.out.println();
        }
    }

    private void elementoParImpar() {
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
    }

    private void matrizTransposta() {
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
    }

    private void inverteDiagonal() {
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

    public static void main(String[] args) {
        new modularPratica9();
    }
}
