package praticaswesley.pratica5;

import java.util.*;

public class exercicio1 {

    /*
     * Receba a nota final e o total de faltas de um conjunto indeterminado de
     * alunos e
     * imprima:
     * a. A quantidade de alunos que obtiveram nota final maior ou igual a 90.
     * b. A quantidade de alunos que foram reprovados por nota (nota menor que 70)
     * ou por falta (quantidade de faltas maior ou igual a 20).
     * c. A maior e a menor nota.
     * d. A média de notas da turma.
     * O programa deverá terminar quando o usuário informar uma nota negativa.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int notaFinal = 0;
        int falta;
        int notaMaior = 0;
        int notaMenor = 9999;
        int faltaFinalIdc = 0;
        int notaMaiorIdc = 0;
        int notaReprovIdc = 0;
        int media;
        int soma = 0;
        int indiceMedia = 0;

        System.out.println("Entre com as notas finais e as faltas (digite uma nota negativa para encerrar): ");

        while (notaFinal >= 0) {
            System.out.print("Nota: ");
            notaFinal = input.nextInt();
            System.out.print("Falta: ");
            falta = input.nextInt();

            if (notaFinal >= 90) {
                notaMaiorIdc++;
            }

            if (notaFinal < 70) {
                notaReprovIdc++;
            }

            if (falta >= 20) {
                faltaFinalIdc++;
            }

            if (notaFinal > 0) {
                if (notaFinal > notaMaior) {
                    notaMaior = notaFinal;
                }
            }

            if (notaFinal > 0) {
                if (notaFinal < notaMenor) {
                    notaMenor = notaFinal;
                }
            }

            indiceMedia++;
            soma = notaFinal + soma;

        }

        media = soma / indiceMedia;

        System.out.println(notaMaiorIdc + " obtiveram nota maior ou igual a 90;\n" + notaReprovIdc
                + " foram reprovados por nota menor que 70;\n" + faltaFinalIdc
                + " foram reprovados por faltas iguais ou superiores a 20\nA maior nota foi: " + notaMaior
                + "\nA menor nota foi: " + notaMenor + "\nA média da turma foi: " + media);

    }
}