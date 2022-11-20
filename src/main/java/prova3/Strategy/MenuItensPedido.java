package prova3.Strategy;

import prova3.State.Pedido;
import prova3.Domains.PortifolioProdutos;
import prova3.Domains.Produto;

import java.util.Scanner;

public class MenuItensPedido implements Strategy {

    public int escolha;

    private PortifolioProdutos portifolioProdutos;
    private Pedido pedido;

    private int numeroCarrinho = 0;
    private int numeroSaida = 0;


    public MenuItensPedido(Pedido pedido, PortifolioProdutos portifolioProdutos){
        this.pedido = pedido;
        this.portifolioProdutos = portifolioProdutos;
    }

    @Override
    public void mostraMenu() {

        System.out.println(" MENU ITENS PEDIDO ");
        int i = 1;

        for (Produto produto: portifolioProdutos.produtos) {
            System.out.println(i + " - " + produto.nome);
            i ++;
        }

        this.numeroCarrinho = i;
        System.out.println(numeroCarrinho + " - Ver Carrinho");
        this.numeroSaida = i + 1;
        System.out.println(numeroSaida + " - Sair");
    }

    @Override
    public void leEscolha() {
        System.out.println("Informe a opção escolhida: ");

        Scanner sc = new Scanner(System.in);
        this.escolha = sc.nextInt();
    }

    @Override
    public void executa() {
        if(escolha == numeroCarrinho)  {
            pedido.verCarrinho();
        }
        else if(escolha == numeroSaida) {
            pedido.fechar();
        }
        else {
            if (escolha > portifolioProdutos.tamanhoPortifolio() || escolha < 1){
                System.out.println("produto não existente");
            }
            else{
                pedido.getCarrinho().adicionarItem(portifolioProdutos.obterProduto(escolha));
            }
        }
    }
}
