package Refatoracao.Pratica2;

public class Produto {
    private String nome;
    private double quantidade;
    private double preco;

    public Produto(String nome, double quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNome () {
        return nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public double getQuantidade () {
        return quantidade;
    }

    public void setQuantidade (double quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco () {
        return preco;
    }

    public void setPreco (double preco) {
        this.preco = preco;
    }
}
