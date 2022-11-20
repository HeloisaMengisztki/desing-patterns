package prova3.Domains;

public class Produto {
    public double valor;
    public String nome;
    public int qtdComprada;

    Produto(String nome, double preco) {
        this.nome = nome;
        this.valor = preco;
    }

    public double getValorTotal() {
        return qtdComprada*valor;
    }
}
