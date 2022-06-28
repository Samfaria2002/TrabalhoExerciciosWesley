package Refatoracao.Pratica7.Exercicio1;

import javax.swing.JOptionPane;

public class Nomes {
    private String primeiroNome, segundoNome, terceiroNome;

    public Nomes() {
        primeiroNome = "";
        segundoNome = "";
        terceiroNome = "";
    }

    public void leNomes() {
        primeiroNome = JOptionPane.showInputDialog("Informe o primeiro nome: ", 0);
        segundoNome = JOptionPane.showInputDialog("Informe o segundo nome: ", 0);
        terceiroNome = JOptionPane.showInputDialog("Informe o terceiro nome: ", 0);    
    }

    public void imprime() {
        JOptionPane.showMessageDialog(null, "O nome completo é "+ primeiroNome + " " + segundoNome + " " + terceiroNome);
    }
}
