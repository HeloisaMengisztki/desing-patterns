package Comportamental.State;

public class OrderApproved implements ShoppingOrderState{

    private String Name = "OrderApproved";
    private Comportamental.State.ShoppingOrder ShoppingOrder;

    public OrderApproved(ShoppingOrder shoppingOrder) {
        ShoppingOrder = shoppingOrder;
    }

    @Override
    public String getName() {
        return this.Name;
    }

    @Override
    public void approvePayment() {
        System.out.println("O Pedido já está no estado pagamento aprovado");
    }

    @Override
    public void rejectPayment() {
        System.out.println("O Pedido está sendo rejeitado");
        this.ShoppingOrder.setState(new OrderRejected(this.ShoppingOrder));
    }

    @Override
    public void waitPayment() {
        System.out.println("O Pedido está sendo atualizado para esperando pagamento");
        this.ShoppingOrder.setState(new OrderPending(this.ShoppingOrder));
    }

    @Override
    public void shipOrder() {
        System.out.println("Enviando pedido Aprovado para o cliente");
    }
}
