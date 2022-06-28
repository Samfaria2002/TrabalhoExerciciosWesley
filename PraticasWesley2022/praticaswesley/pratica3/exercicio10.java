package praticaswesley.pratica3;
import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int raio;
        int comprimento;
        int area;
        int volume;

        System.out.println("Entre com o raio: ");
        raio = input.nextInt();

        comprimento = (int) (2 * Math.PI * raio);
        area = (int) (Math.PI * Math.pow(raio, 2));
        volume = (int) ((3 * (Math.PI * Math.pow(raio, 3))) / 4);

        System.out.println("Comprimento da esfera: " + comprimento);
        System.out.println("Área da esfera: " + area);
        System.out.println("Volume da esfera: " + volume);
    }
}
