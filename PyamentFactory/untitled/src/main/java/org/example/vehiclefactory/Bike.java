package org.example.vehiclefactory;

public class Bike implements Vehicle{
    @Override
    public void startDelivery() {
        System.out.println("Bike delivery started");
    }
}
