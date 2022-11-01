package Comportamental.State;


public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("pedido 1\n");
            ShoppingOrder order1 = new ShoppingOrder();
            order1.getState();
            order1.waitPayment();
            order1.approvePayment();
            order1.shipOrder();

            System.out.println("\npedido 2\n");
            ShoppingOrder order2 = new ShoppingOrder();
            order2.approvePayment();
            order2.waitPayment();
            order2.shipOrder();
            order2.rejectPayment();
            order2.approvePayment();
            order2.waitPayment();
            order2.shipOrder();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
