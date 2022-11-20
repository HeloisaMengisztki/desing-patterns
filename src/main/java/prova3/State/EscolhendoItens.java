package prova3.State;

public class EscolhendoItens implements EstadoPedido {

    private String Name = "escolhendo itens";
    private Pedido pedido;

    public EscolhendoItens(Pedido pedido) {this.pedido = pedido;}

    @Override
    public boolean escolhendoItens() { return true; }

    @Override
    public boolean pedidoEncerrado() { return false; }

    @Override
    public boolean pedidoConcluido() {
        return false;
    }

    @Override
    public boolean verCarrinho() { return false;}
}
