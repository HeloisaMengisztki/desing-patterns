package Factories;

import Domains.Bicycle;

public class BicycleFactory extends Factories.VehicleFactory {
    @Override
    public Bicycle getVehicle(String vehicleName) {
        return new Bicycle(vehicleName);
    }
}
