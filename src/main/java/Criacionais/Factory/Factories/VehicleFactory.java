package Factories;

import Domains.Car;
import Domains.Vehicle;

public abstract class VehicleFactory {
    abstract Vehicle getVehicle(String vehicleName);

    Vehicle pickUp(String customerName, String vehicleName){
        Car car = (Car) this.getVehicle(vehicleName);
        car.pickUp(customerName);

        return car;
    }
}