package praticaswesley.pratica4;


import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int nota = 0;
        int notasSoma = 0;
        int media = 0;

        System.out.println("Insira as 3 notas do aluno entre 0 a 10");
        for (int i = 1; i <= 3; i++) {
            nota = input.nextInt();
            if (nota <= 10 && nota >= 0) {
                notasSoma = notasSoma + nota;
            } else {
                System.out.println("Nota menor que 0 ou maior que 10.\nFavor inserir nota de 0 a 10.");
            }
        }

        media = notasSoma / 3;

        if (media >= 0 && media < 3) {
            System.out.println("Reprovado");
        } else if (media >= 3 && media < 7) {
            System.out.println("Exame");
        } else if (media >= 7 && media <= 10) {
            System.out.println("Aprovado");
        }
    }
}
