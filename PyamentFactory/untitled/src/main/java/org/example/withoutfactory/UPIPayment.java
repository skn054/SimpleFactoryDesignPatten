package org.example.withoutfactory;

public class UPIPayment implements PaymentProcessor{

    @Override
    public double processPayment(double amount) {
        return  amount;
    }
}
