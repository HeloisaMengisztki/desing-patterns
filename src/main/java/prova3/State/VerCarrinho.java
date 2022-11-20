package prova3.State;

public class VerCarrinho implements EstadoPedido {
    private String Name = "vendo carrinho";
    private Pedido pedido;

    public VerCarrinho(Pedido pedido) {
        this.pedido = pedido;
    }


    @Override
    public boolean escolhendoItens() {
        return false;
    }

    @Override
    public boolean pedidoEncerrado() {return false;}

    @Override
    public boolean pedidoConcluido() {
        return false;
    }

    @Override
    public boolean verCarrinho() {
        return true;
    }
}
