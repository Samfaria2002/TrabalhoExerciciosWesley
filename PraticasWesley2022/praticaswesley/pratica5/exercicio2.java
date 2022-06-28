package praticaswesley.pratica5;

import java.util.Scanner;

public class exercicio2 {
    /*
     * Solicite ao usuário que informe a matrícula e as três notas de um conjunto de
     * alunos. O
     * programa deverá exibir uma mensagem informando se o aluno foi aprovado (média
     * maior ou igual a 70), se está em recuperação exame (nota maior ou igual a 60
     * e menor
     * que 70) ou se foi reprovado (nota inferior a 60). O programa irá terminar
     * quando o
     * usuário informar uma matrícula negativa.
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int matricula = 0;
        int nota;
        int soma = 0;
        int media = 0;

        System.out.println("Entre com a matrícula e 3 notas dos alunos (uma matricula negativa encerra o processo)");
        while (matricula >= 0) {
            System.out.print("Matrícula: ");
            matricula = input.nextInt();

            for (int i = 1; i < 4; i++) {
                System.out.println(i + "° nota: ");
                nota = input.nextInt();
                soma = soma + nota;
                media = soma / 3;
            }

            if (media >= 90) {
                System.out.println("Aprovado!");
            } else if (media >= 70) {
                System.out.println("Recuperação!");
            } else if (media < 60) {
                System.out.println("Reprovado");
            }

        }
    }
}
