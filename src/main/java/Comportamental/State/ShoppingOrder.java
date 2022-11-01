package Comportamental.State;

public class ShoppingOrder {
    private ShoppingOrderState state = new OrderPending(this);

    ShoppingOrderState getState(){
        System.out.println("Obtendo estado do pedido " + this.state.getName());
        return this.state;
    }

    ShoppingOrderState setState(ShoppingOrderState state){
        System.out.println("Mudando estado para " + state.getName());
        return this.state = state;
    }

    String getStateName(){
        return this.state.getName();
    }

    void approvePayment(){
        this.state.approvePayment();
    }

    void rejectPayment(){
        this.state.rejectPayment();
    }

    void waitPayment(){
        this.state.waitPayment();
    }

    void shipOrder(){
        this.state.shipOrder();
    }
}
