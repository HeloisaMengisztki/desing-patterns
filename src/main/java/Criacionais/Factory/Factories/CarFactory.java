package Factories;

import Domains.Car;

public class CarFactory extends VehicleFactory {
    @Override
    public Car getVehicle(String vehicleName) {
        return new Car(vehicleName);
    }
}

