package praticaswesley.pratica3;
import javax.swing.*;

public class exercicio7 {
    public static void main(String[] args) {
        double salminimo = 1.212, funcisal = 0, calcminimo = 0;

        JOptionPane.showMessageDialog(null, "Calcule quantos salários mínimos você ganha", "Salário Mínimo",
                JOptionPane.INFORMATION_MESSAGE);
        funcisal = Double.parseDouble(JOptionPane.showInputDialog("Entre com seu salário", ""));

        calcminimo = funcisal / salminimo;

        JTextArea areatexto = new JTextArea(8, 20);
        JScrollPane scroll = new JScrollPane(areatexto);

        areatexto.append("Você possui: " + String.format("%.1f", calcminimo) + " salários mínimos.");

        JOptionPane.showMessageDialog(null, scroll, "Salário Mínimo", JOptionPane.INFORMATION_MESSAGE);
    }
}
