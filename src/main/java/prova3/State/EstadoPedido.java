package prova3.State;

public interface EstadoPedido {
    boolean escolhendoItens();
    boolean pedidoEncerrado();
    boolean pedidoConcluido();
    boolean verCarrinho();
}