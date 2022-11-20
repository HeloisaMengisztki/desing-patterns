package prova3.State;

public class PedidoConcluido implements EstadoPedido {

    private String Name = "pedido concluido";
    private Pedido pedido;

    public PedidoConcluido(Pedido pedido) {
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
        return true;
    }

    @Override
    public boolean verCarrinho() { return false; }
}
