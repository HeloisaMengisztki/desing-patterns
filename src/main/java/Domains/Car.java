package Domains;

public class Car implements Domains.Vehicle {
    private final String name;

    public Car(String name){
        this.name = name;
    }

    @Override
    public void pickUp(String customerName) {
        System.out.println(this.name + " está buscando o "+ customerName);
    }

    @Override
    public void stop() {
        System.out.println(this.name + " parou");
    }
}