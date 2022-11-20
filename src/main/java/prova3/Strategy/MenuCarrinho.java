package prova3.Strategy;

import prova3.Domains.Produto;
import prova3.State.Pedido;

import java.util.Scanner;

public class MenuCarrinho implements Strategy {
    public int escolha;

    private Pedido pedido;
    private int voltarMenu;
    private int fecharCompra;
    private int excluirProduto;

    public MenuCarrinho(Pedido pedido) {

        this.pedido = pedido;
    }

    @Override
    public void mostraMenu() {
        System.out.println(" -- MENU CARRINHO -- ");

        var i = 1;

        for (Produto produto: pedido.getCarrinho().getItems()) {
            System.out.println(i + " - " + produto.nome + " - (" + produto.qtdComprada + ") - (" + produto.getValorTotal() + ")");
            i ++;
        }
        System.out.println("TOTAL: " + pedido.getCarrinho().calculaTotal());

        this.voltarMenu = i;
        System.out.println(voltarMenu + " - Voltar ao menu");

        this.excluirProduto = i + 1;
        System.out.println(excluirProduto + " - Excluir item");

        this.fecharCompra = i + 2;
        System.out.println(fecharCompra + " - Fechar compra");
    }

    @Override
    public void leEscolha() {
        System.out.println("Informe a opção escolhida: ");

        Scanner sc = new Scanner(System.in);
        this.escolha = sc.nextInt();
    }

    @Override
    public void executa() {
        if(escolha == voltarMenu)  {
            pedido.realizarPedido();
        }
        else if(escolha == fecharCompra) {
            pedido.concluir();
        }
        else if (escolha == excluirProduto){
            pedido.getCarrinho().removerProduto();
        }
        else {
            System.out.println("opção não existente");
        }
    }
}
