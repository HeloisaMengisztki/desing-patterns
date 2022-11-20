package prova3.State;

public class PedidoEncerrado implements EstadoPedido {

    private String Name = "pedido encerrado";
    private Pedido pedido;

    public PedidoEncerrado(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public boolean escolhendoItens() {
        return false;
    }

    @Override
    public boolean pedidoEncerrado() {
        return true;
    }

    @Override
    public boolean pedidoConcluido() {
        return false;
    }

    @Override
    public boolean verCarrinho() { return false; }
}
