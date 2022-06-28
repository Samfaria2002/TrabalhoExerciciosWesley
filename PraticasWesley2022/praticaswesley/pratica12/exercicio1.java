package praticaswesley.pratica12;

import java.lang.*;
import java.util.Scanner;

public class exercicio1 {
    /*Em linguagem de programação Java, implemente um algoritmo para efetuar a divisão
    entre dois números inteiros. No método “main” da classe principal, leia os dois números
    e efetue a divisão. Realize o tratamento de exceção: empregue uma ArithmeticException.
    Os números devem ser lidos a partir do teclado.*/

    private int num1;
    private int num2;

    public exercicio1() {
        this.num1 = 0;
        this.num2 = 0;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum2() {
        return num2;
    }

    public int divide() {

        if (num2 == 0) {
            throw new ArithmeticException("O valor 1 não pode ser maior que o valor 2");
        } else {
            return num1/num2;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        exercicio1 ex = new exercicio1();

        System.out.println("Entre com o número 1 e 2 respectivamente: ");
        ex.setNum1(input.nextInt());
        ex.setNum2(input.nextInt());

        System.out.println(ex.divide());
    }
}
