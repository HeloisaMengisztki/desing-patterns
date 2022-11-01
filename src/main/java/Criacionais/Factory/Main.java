package Criacionais.Factory;

import Domains.Bicycle;
import Domains.Car;
import Domains.Vehicle;
import Factories.BicycleFactory;
import Factories.CarFactory;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // chamada sem Factory
//        Domains.Car fusca = new Domains.Car("fusca");
//        fusca.pickUp("Joana");
//        fusca.stop();
//
//        Domains.Car celta = new Domains.Car("celta");
//        fusca.pickUp("Joana");
//        fusca.stop();

        //chamada com Factory
        CarFactory carFactory = new CarFactory();
        Car car1 = carFactory.getVehicle("fusca");
        Car car2 = carFactory.getVehicle("celta");

        BicycleFactory bikeFactory = new BicycleFactory();
        Bicycle bike1 = bikeFactory.getVehicle("bike azul");
        Bicycle bike2 = bikeFactory.getVehicle("bike vermelha");

        ArrayList<Vehicle> list = new ArrayList<>();
        list.add(car1);
        list.add(car2);
        list.add(bike1);
        list.add(bike2);

        Random gerador = new Random();
        ArrayList<String> customers = new ArrayList<>();
        customers.add("Johana");
        customers.add("Pedro");

        for (int i = 0; i <10;i++){
            Vehicle vehicle = list.get(gerador.nextInt(list.size()));
            vehicle.pickUp(customers.get(gerador.nextInt(customers.size())));
            vehicle.stop();
            System.out.println("------------------");
        }
    }
}