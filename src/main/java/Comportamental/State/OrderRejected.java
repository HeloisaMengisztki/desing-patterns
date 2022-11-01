package Comportamental.State;

public class OrderRejected implements ShoppingOrderState{

    private String Name = "OrderRejected";
    private ShoppingOrder ShoppingOrder;

    public OrderRejected(ShoppingOrder shoppingOrder) {
        this.ShoppingOrder = shoppingOrder;
    }

    @Override
    public String getName() {
        return this.Name;
    }

    @Override
    public void approvePayment() {
        System.out.println("O Pedido não pode ser aprovado pois foi recusado");
    }

    @Override
    public void rejectPayment() {
        System.out.println("O Pedido já está recusado");
    }

    @Override
    public void waitPayment() {
        System.out.println("O Pedido não pode ser pendente pois foi recusado");
    }

    @Override
    public void shipOrder() {
        System.out.println("O Pedido não pode ser entregue pois foi recusado");
    }
}

