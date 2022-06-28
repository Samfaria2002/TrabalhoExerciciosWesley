package praticaswesley.pratica4;

import java.util.Scanner;

public class exercicio6 {

    /*
     * Informados três valores X, Y e Z, verifique e informe se eles podem, ou não,
     * ser os
     * comprimentos dos lados de um triângulo. Em um triangulo, cada lado é menor
     * que a
     * soma dos outros dois lados. Além disso, cada lado é maior que o valor
     * absoluto
     * (módulo) da diferença dos outros dois lados:
     * | b - c | < a < b + c
     * | a - c | < b < a + c
     * | a - b | < c < a + b
     * Exemplo:
     * Informe o primeiro lado em cm: 5
     * Informe o segundo lado em cm: 10
     * Informe o terceiro lado em cm: 9
     * |10 – 9| < 5 < 10 + 9
     * 1 < 5 <19 (VERDADEIRO)
     * |9 – 5| < 10 < 9 + 5
     * 4 < 10 < 14 (VERDADEIRO)
     * |5 – 10| < 9 < 10 + 5
     * 5 < 9 < 15 (VERDADEIRO)
     * Resposta: os três valores informados podem ser os comprimentos dos lados de
     * um
     * triângulo.
     */

    public static void main(String[] args) {
        int x, y, z;

        Scanner input = new Scanner(System.in);

        System.out.println("Entre com os valores X, Y e Z respectivamente: ");
        x = input.nextInt();
        y = input.nextInt();
        z = input.nextInt();

        if (x < y + z && y < x + z && z < x + y) {
            if (x > y - z && y > x - z && z > x - y) {
                System.out.println("É um triângulo");
            } else {
                System.out.println("Não é um triângulo");
            }
        } else {
            System.out.println("Não é um triângulo");
        }
    }
}
