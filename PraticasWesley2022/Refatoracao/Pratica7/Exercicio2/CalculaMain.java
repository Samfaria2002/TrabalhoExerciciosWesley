package Refatoracao.Pratica7.Exercicio2;

import java.util.Scanner;

public class CalculaMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calcula calc = new Calcula();

        System.out.println("Entre com o primeiro e segundo número respectivamente:");
        calc.setNum1(input.nextInt());
        calc.setNum2(input.nextInt());

        System.out.println("1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão");
        calc.setIndice(input.nextInt());

        try {
            calc.calcula();
        } catch (Exception e) {
            if(calc.getNum1() == 0) {
                System.out.println("Um ou mais números introduzidos para a divisão são iguais a zero, lhe foi atribuído um valor padrão '2'");
                calc.setNum1(2);
            } else if (calc.getNum2() == 0) {
                System.out.println("Um ou mais números introduzidos para a divisão são iguais a zero, lhe foi atribuído um valor padrão '2'");
                calc.setNum2(2);
            }
        }
    }
}
