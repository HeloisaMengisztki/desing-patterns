package Comportamental.State;

public class OrderPending implements ShoppingOrderState{

    private String Name = "OrderPending";
    private ShoppingOrder ShoppingOrder;

    public OrderPending(ShoppingOrder shoppingOrder) {
        this.ShoppingOrder = shoppingOrder;
    }

    @Override
    public String getName() {
        return this.Name;
    }

    @Override
    public void approvePayment() {
        System.out.println("O Pedido está sendo aprovado");
        this.ShoppingOrder.setState(new OrderApproved(this.ShoppingOrder));
    }

    @Override
    public void rejectPayment() {
        System.out.println("O Pedido está sendo rejeitado");
        this.ShoppingOrder.setState(new OrderRejected(this.ShoppingOrder));
    }

    @Override
    public void waitPayment() {
        System.out.println("O Pedido já está no estado pagamento pendente");
    }

    @Override
    public void shipOrder() {
        System.out.println("O Pedido não pode ser enviado pois pagamento pendente");
    }
}
