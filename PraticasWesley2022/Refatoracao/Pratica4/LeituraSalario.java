package Refatoracao.Pratica4;

import javax.swing.JOptionPane;

public class LeituraSalario implements LeituraInterface {

    private boolean salariorepetir = repetir;
    private String salarioresp = resp;
    private double salario = 0;


    @Override
    public void leitura() {
        do {
            salarioresp = JOptionPane.showInputDialog("Infome o salário", 0);// TODO Auto-generated method stub
            // Verifica se o botão "cancelar foi pressionado."
            if (salarioresp == null) {
            System.err.println("Aviso: o botão \"cancelar\" foi pressionado.");
            
            System.exit(1);
            }
            try {
                salario = Double.parseDouble(salarioresp);
                if (salario > 0)
                salariorepetir = false;
                else
                salariorepetir = true;
            } catch (NumberFormatException e) {
            System.err.println("ERRO: número não identificado.");
            salariorepetir = true;
            }
        } while (salariorepetir == true);
        JOptionPane.showMessageDialog(null, "Salário informado: " + salario);
        
    }
}
