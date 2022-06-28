package praticaswesley.pratica4;

import java.util.Scanner;
import static java.lang.Integer.*;

public class exercicio9 {

    private String planeta;
    private double velocidadeInicial;
    private double velocidadeTotal;
    private double tempoInstante;
    private double alturaTotal;
    private double gravidade;

    Scanner input = new Scanner(System.in);

    public exercicio9() {
        declaracaoPlaneta();
    }

    private void declaracaoPlaneta() {
        System.out.println("Escolha um planeta para jogar bola: ");
        planeta = input.next();

        System.out.println("Qual a velocidade inicial (em metros)?");
        velocidadeInicial = input.nextDouble();

        System.out.println("Qual o tempo (em segundos)?");
        tempoInstante = input.nextDouble();

        if (planeta == "mercurio") {
            gravidade = 3.7;
        } else if (planeta == "venus") {
            gravidade = 8.8;
        } else if (planeta == "terra") {
            gravidade = 9.8;
        } else if (planeta == "marte") {
            gravidade = 3.8;
        } else if (planeta == "jupiter") {
            gravidade = 26.4;
        } else if (planeta == "saturno") {
            gravidade = 11.5;
        } else if (planeta == "urano") {
            gravidade = 9.3;
        } else if (planeta == "netuno") {
            gravidade = 12.2;
        } else if (planeta == "plutao") {
            gravidade = 0.6;
        }

        System.out.println(gravidade);

        formula1();
    }

    private void formula1() {
        velocidadeTotal = (velocidadeInicial - (gravidade * tempoInstante));

        alturaTotal = (velocidadeInicial * tempoInstante) - (gravidade * (tempoInstante * tempoInstante)) / 2;
        System.out.println("A velocidade da bola nesse planeta é de: "+ velocidadeTotal +"\nA altura dessa bola nesse planeta é de: "+ alturaTotal);
    }

    public static void main(String[] args) {
        new exercicio9();
    }
}
