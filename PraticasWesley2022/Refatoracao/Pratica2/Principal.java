package Refatoracao.Pratica2;

public class Principal {
    public static void main (String[] args) {
        Relatorio relatorio = new Relatorio();
        relatorio.imprimir(new Produto ("Arroz", 5, 18.75));
    }
}
