package prova3.Strategy;

import prova3.Domains.Produto;
import prova3.State.Pedido;

public class MenuConclusao implements Strategy{
    private final Pedido pedido;

    public MenuConclusao(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void mostraMenu() {
        System.out.println(" ----------- OBRIGADO " + pedido.nome + ". Aqui esta sua compra ----------- ");
        int i = 1;

        for (Produto produto: pedido.getCarrinho().getItems()) {
            System.out.println(i + " - " + produto.nome + " - (" + produto.qtdComprada + ") - (" + produto.getValorTotal() + ")");
            i ++;
        }
        System.out.println("TOTAL: " + pedido.getCarrinho().calculaTotal());
        System.out.println("Endereco de entrega: " + pedido.endereco);

        System.out.println(" --------------------------------- ");

        pedido.fechar();
    }

    @Override
    public void leEscolha() {
    }

    @Override
    public void executa() {
    }
}
