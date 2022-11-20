package prova3;

import prova3.State.Pedido;
import prova3.Domains.PortifolioProdutos;
import prova3.Strategy.*;

public class Main {
    static PortifolioProdutos portifolio = new PortifolioProdutos();
    static Pedido pedido = new Pedido();
    static Strategy strategy;

    public static void main(String[] args) {

        while (!pedido.fechado()) {
            if (strategy == null)
                strategy = new MenuPedido(pedido);

            else if(pedido.escolherItens())
                strategy = new MenuItensPedido(pedido, portifolio);

            else if(pedido.visualizarCarrinho())
                strategy = new MenuCarrinho(pedido);

            else if(pedido.concluido()){
                strategy = new MenuConclusao(pedido);
            }

            pedido.processar(strategy);
        }

        System.out.println("Obrigado por escolher o IFSC Lanches\n");
    }
}
