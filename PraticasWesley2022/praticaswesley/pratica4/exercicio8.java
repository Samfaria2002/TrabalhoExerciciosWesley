package praticaswesley.pratica4;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int codigo;

        System.out.println("Bem-vindo a loja!");
        System.out.println("Escolha um produto para ver o preço: ");
        System.out.println("1 - Sapato\n2 - Bolsa\n3 - Camisa\n4 - Calça\n5 - Blusa");

        System.out.print("Código do produto: ");
        codigo = input.nextInt();

        switch (codigo) {
            case 1:
                System.out.println("Código: " + codigo + "\nProduto: Sapato\nPreço: R$ 99,99");
                break;
            case 2:
                System.out.println("Código: " + codigo + "\nProduto: Bolsa\nPreço: R$ 103,89");
                break;
            case 3:
                System.out.println("Código: " + codigo + "\nProduto: Camisa\nPreço: R$ 49,98");
                break;
            case 4:
                System.out.println("Código: " + codigo + "\nProduto: Calça\nPreço: R$ 89,72");
                break;
            case 5:
                System.out.println("Código: " + codigo + "\nProduto: Blusa\nPreço: R$ 97,35");
                break;
            default:
                break;
        }
    }
}
