package Refatoracao.Pratica5;

import javax.swing.JOptionPane;

public class TriangulosInstancia {
    
    private static TriangulosInstancia instancia;
    public String valor;
    private String resp;
    private boolean repetir;
    private double lado01, lado02, lado03;

    public TriangulosInstancia(String valor) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException iex) {
            iex.printStackTrace();
        }
        this.valor = valor;
    }

    public static TriangulosInstancia getInstancia(String valor) {
        if (instancia == null) {
            synchronized (TriangulosInstancia.class) {
                if (instancia == null) {
                    instancia = new TriangulosInstancia(valor);
                }
            }
        }
        return instancia;
    }

    public TriangulosInstancia() {
        resp = null;
        repetir = true;
        lado01 = 0;
        lado02 = 0;
        lado03 = 0;
    }

    public void primeiroLado() {
        // Lendo o primeiro lado:
        do {
            resp = JOptionPane.showInputDialog("Informe o primeiro lado: ", 0);
                    
            // Verifica se o botão "cancelar" foi pressionado:
            if (resp == null) {
                System.err.println("Aviso: o botão \"cancelar\" foi pressionado para sair do programa.");
                    
                System.exit(0);
            }
            // Verifica se um número válido foi informado:
            try {
                lado01 = Double.parseDouble(resp);
                repetir = false;
            } catch (NumberFormatException e) {
                System.err.println("ERRO: número não identificado.");
                repetir = true;
            }
        } while (repetir);
        segundoLado();
    }

    public void segundoLado() {
        // Lendo o primeiro lado:
        do {
            resp = JOptionPane.showInputDialog("Informe o segundo lado: ", 0);
                    
            // Verifica se o botão "cancelar" foi pressionado:
            if (resp == null) {
                System.err.println("Aviso: o botão \"cancelar\" foi pressionado para sair do programa.");
                    
                System.exit(0);
            }
            // Verifica se um número válido foi informado:
            try {
                lado02 = Double.parseDouble(resp);
                repetir = false;
            } catch (NumberFormatException e) {
                System.err.println("ERRO: número não identificado.");
                repetir = true;
            }
        } while (repetir);
        terceiroLado();
    }

    public void terceiroLado() {
        // Lendo o primeiro lado:
        do {
            resp = JOptionPane.showInputDialog("Informe o terceiro lado: ", 0);
                    
            // Verifica se o botão "cancelar" foi pressionado:
            if (resp == null) {
                System.err.println("Aviso: o botão \"cancelar\" foi pressionado para sair do programa.");
                    
                System.exit(0);
            }
            // Verifica se um número válido foi informado:
            try {
                lado03 = Double.parseDouble(resp);
                repetir = false;
            } catch (NumberFormatException e) {
                System.err.println("ERRO: número não identificado.");
                repetir = true;
            }
        } while (repetir);
        calculo();
    }

    public void calculo() {
        if (lado01 == lado02 && lado02 == lado03)
            JOptionPane.showMessageDialog(null, "Triangulo equilátero.");
        else if (lado01 == lado02 || lado01 == lado03 || lado02 == lado03)
            JOptionPane.showMessageDialog(null, "Triangulo isósceles");
        else
            JOptionPane.showMessageDialog(null, "Triangulo escaleno.");
    }

}
