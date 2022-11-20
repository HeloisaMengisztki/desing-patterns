package prova3.Domains;

import java.util.*;

public class Carrinho {
    private ArrayList<Produto> itens = new ArrayList<>();

    public double calculaTotal() {
        double total = 0;
        for (Produto produto: itens) {
            total = total + (produto.qtdComprada * produto.valor);
        }

        return total;
    }

    public void adicionarItem(Produto produto) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a quantidade do item?");
        var qtd = sc.nextInt();

        if(itens.contains(produto))
            produto.qtdComprada =  produto.qtdComprada + qtd;
        else{
            produto.qtdComprada = qtd;
            itens.add(produto);
        }

        calculaTotal();
    }

    public ArrayList<Produto> getItems(){
        return this.itens;
    }

    public void removerProduto() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual item deseja excluir?");
        var index = sc.nextInt();

        if (index > itens.size() || index < 1){
            System.out.println("produto não existente");
            return;
        }

        var produto = itens.get(index-1);

        itens.remove(produto);

        System.out.println("Item " + produto.nome + " retirado do carrinho");

        calculaTotal();
    }
}
