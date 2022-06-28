package praticaswesley.pratica6;

import javax.swing.JOptionPane;

public class exercicio2 {

    /*
     * Em linguagem de programação Java, escreva um algoritmo que leia e valide os
     * seguintes
     * dados:
     * a. Nota: entre 0 e 10.
     * b. Salário: maior que zero.
     * c. Sexo: m ou f.
     * d. Idade: entre 0 e 150.
     */
    public static void main(String args[]) {
        String entrada = "";
        int nota = 0, salario = 0, idade = 0;
        char sexo = 's';
        do {
            entrada = JOptionPane.showInputDialog("Informe a nota: ");

            // Converte a entrada para inteiro e armazena nota, salário; converte para char
            // e armazena sexo:
            if (Integer.parseInt(entrada) >= 0 && Integer.parseInt(entrada) <= 10) {
                nota = Integer.parseInt(entrada);
            } else {
                JOptionPane.showMessageDialog(null, "Nota inválida");
                break;
            }

            entrada = JOptionPane.showInputDialog("Informe o salario:  ");
            if (Integer.parseInt(entrada) > 0 && Integer.parseInt(entrada) < 10) {
                salario = Integer.parseInt(entrada);
            } else {
                JOptionPane.showMessageDialog(null, "Salario inválido");
                break;
            }

            entrada = JOptionPane.showInputDialog("Informe o sexo (M ou F):  ").toLowerCase();
            if (entrada.charAt(0) == 'm' || entrada.charAt(0) == 'f') {
                sexo = entrada.charAt(0);
            } else {
                JOptionPane.showMessageDialog(null, "Sexo inválido");
                break;
            }

            entrada = JOptionPane.showInputDialog("Informe a idade:  ");
            if (Integer.parseInt(entrada) > 0 && Integer.parseInt(entrada) < 150) {
                idade = Integer.parseInt(entrada);
            } else {
                JOptionPane.showMessageDialog(null, "Idade inválida");
                break;
            }

            // Retorna valores pra tela
            JOptionPane.showMessageDialog(null, "A nota é: " + nota + "\nO salario é: " + salario + "\nO sexo é: "
                    + sexo + "\n A idade é: " + idade);
            int resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
            if (resp == JOptionPane.YES_OPTION) {
                entrada = "sim";
            } else if (resp == JOptionPane.NO_OPTION) {
                entrada = "não";
            }

        } while (entrada.equalsIgnoreCase("s") || entrada.equalsIgnoreCase("sim"));
        System.exit(0);
    }
}