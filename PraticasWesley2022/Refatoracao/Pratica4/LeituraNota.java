package Refatoracao.Pratica4;

import javax.swing.JOptionPane;

public class LeituraNota implements LeituraInterface {

    private boolean notarepetir = repetir;
    private String notaresp = resp;
    private double nota = 0;

    @Override
    public void leitura() {
        do {
            notaresp = JOptionPane.showInputDialog("Infome a nota [0, 10]", 0);
            // Verifica se o botão "cancelar foi pressionado."
            if (notaresp == null) {
                System.err.println("Aviso: o botão \"cancelar\" foi pressionado.");
            
                System.exit(1);
            }
            try {
                nota = Double.parseDouble(notaresp);
                if (nota >= 0 && nota <= 10) {
                    notarepetir = false;
                } else {
                    notarepetir = true;
                }
            } catch (NumberFormatException e) {
                System.err.println("ERRO: número não identificado.");
                notarepetir = true;
            }
        } while (notarepetir == true);
        JOptionPane.showMessageDialog(null, "Nota informada: " + nota);
        
    }
    
}
