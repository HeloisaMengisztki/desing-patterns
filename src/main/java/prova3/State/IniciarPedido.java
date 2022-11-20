package prova3.State;

public class IniciarPedido implements EstadoPedido{
    private String Name = "pedido iniciado";
    private Pedido pedido;

    public IniciarPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public boolean escolhendoItens() {
        return false;
    }

    @Override
    public boolean pedidoEncerrado() {
        return false;
    }

    @Override
    public boolean pedidoConcluido() {
        return false;
    }

    @Override
    public boolean verCarrinho() {
        return false;
    }
}
