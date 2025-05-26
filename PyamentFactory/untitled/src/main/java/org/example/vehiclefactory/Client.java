package org.example.vehiclefactory;

public class Client {
    public void processOrder(float weight){
//        Vehicle vehicle = VehicleFactory.getVehicle(type);
        Vehicle vehicle = VehicleFactory.getAppropriateVehicle(weight);
        vehicle.startDelivery();
    }
}
