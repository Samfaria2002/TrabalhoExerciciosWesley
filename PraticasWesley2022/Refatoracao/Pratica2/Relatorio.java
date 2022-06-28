package Refatoracao.Pratica2;

public class Relatorio implements InterfaceRelatorio {
    
    @Override
    public void imprimir(Produto produto) {
        System.out.println("--------------------------------------------------");
        System.out.format("Nome: %s Quantidade (kg): %.2f Preço: R$ %.2f\n",
        produto.getNome(), produto.getQuantidade(), produto.getPreco());
        System.out.println("--------------------------------------------------");
    }
}
