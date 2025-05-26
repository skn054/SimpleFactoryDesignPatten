package org.example.vehiclefactory;

public class Car implements Vehicle{
    @Override
    public void startDelivery() {
        System.out.println("Car delivery started");
    }
}
