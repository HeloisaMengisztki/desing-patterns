package prova3.Domains;

import java.util.ArrayList;

public class PortifolioProdutos {
    public ArrayList<Produto> produtos =new ArrayList<>();

    public PortifolioProdutos(){
        produtos.add(new Produto("Hamburguer 200g (R$ 15,00)", 15.00));
        produtos.add(new Produto("Batata frita 300g (R$ 10,00)", 10.00));
        produtos.add(new Produto("Refrigerante em Lata (5,00)", 5.00));
        produtos.add(new Produto("Refrigerante 1,5L (R$ 10,00)", 10.00));
        produtos.add(new Produto("Pote Sorvete (R$ 25,00)", 25.00));
    }

    public int tamanhoPortifolio(){
        return produtos.size();
    }

    public Produto obterProduto(int index){
        return produtos.get(index-1);
    }
}
