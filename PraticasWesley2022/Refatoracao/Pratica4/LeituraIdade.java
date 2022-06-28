package Refatoracao.Pratica4;

import javax.swing.JOptionPane;

public class LeituraIdade implements LeituraInterface {

    private int idade = 0;
    private double nota = 0;
    private boolean idaderepetir = repetir;
    private String idaderesp = resp;

    @Override
    public void leitura() {
        do {
            idaderesp = JOptionPane.showInputDialog("Infome a nota [0, 10]", 0);
            // Verifica se o botão "cancelar foi pressionado."
            if (idaderesp == null) {
                System.err.println("Aviso: o botão \"cancelar\" foi pressionado.");
            
                System.exit(1);
            }
            try {
                nota = Double.parseDouble(resp);

                if (nota >= 0 && nota <= 10) {
                    idaderepetir = false;
                } else {
                    idaderepetir = true;
                }
            } catch (NumberFormatException e) {
                System.err.println("ERRO: número não identificado.");
                idaderepetir = true;
            }
        } while (idaderepetir == true);
    }
}
