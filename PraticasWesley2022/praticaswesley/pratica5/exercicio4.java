package praticaswesley.pratica5;

import java.util.Scanner;

public class exercicio4 {
    /*Realize uma pesquisa para a prefeitura de uma cidade. A pesquisa deve ser realizada
    entre os habitantes da cidade. A prefeitura irá coletar dados sobre o salário e o número
    de filhos da população. A prefeitura deseja saber:
    a. A média salarial da população.
    b. A média do número de filhos.
    O final da leitura de dados dar-se-á com a entrada de um salário negativo.*/

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int salario = 0, filho = 0;
        int contsalario = 0, contfilho = 0;
        double bxsalario = 0, mediasalario;
        double bxfilho = 0, mediafilho;
        
        while (salario >= 0) {
            System.out.println("Entre com os salários: ");
            salario = input.nextInt();
            if (salario >= 0) {
                contsalario++;
                bxsalario = bxsalario + salario;
            }
        }

        while (filho >= 0) {
            System.out.println("Entre com a quantidade de filhos: ");
            filho = input.nextInt();
            if (filho >= 0) {
                contfilho++;
                bxfilho = bxfilho + filho;
            }
        }

        mediasalario = bxsalario / contsalario;
        mediafilho = bxfilho / contfilho;

        System.out.println("A média dos salários: "+ mediasalario);
        System.out.println("A média dos filhos: "+ mediafilho);
        
        
    }
}
