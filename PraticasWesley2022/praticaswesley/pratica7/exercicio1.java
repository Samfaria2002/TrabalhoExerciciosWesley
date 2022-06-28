package praticaswesley.pratica7;

public class exercicio1 {
    /*Calcule e imprima a soma dos números inteiros entre 7 e 20, inclusive.*/

    public static void main(String[] args) {
        int soma = 0;
        for (int i = 7; i < 20; i++) {
            soma += i;
        }
        System.out.println("A soma dos números entre 7 e 20 é: " + soma);
    }
}
