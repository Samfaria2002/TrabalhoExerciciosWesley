package Refatoracao.Pratica4;

import javax.swing.JOptionPane;

public class LeituraSexo implements LeituraInterface {

    private boolean sexorepetir = repetir;
    private String sexoresp = resp;
    private String sexo = "";


    @Override
    public void leitura() {
        do {
            sexo = JOptionPane.showInputDialog("Infome o sexo");
            // Verifica se o botão "cancelar foi pressionado."
            if (sexo == null) {
                System.err.println("Aviso: o botão \"cancelar\" foi pressionado.");
                
                System.exit(1);
            }
            if (sexo.equalsIgnoreCase("f") == true || sexo.equalsIgnoreCase("m") == true) {
                sexorepetir = false;
            } else {
                sexorepetir = true;
            }
        } while (sexorepetir == true);
        JOptionPane.showMessageDialog(null, "Sexo informado: " + sexo);// TODO Auto-generated method stub
        
    }

    
}
