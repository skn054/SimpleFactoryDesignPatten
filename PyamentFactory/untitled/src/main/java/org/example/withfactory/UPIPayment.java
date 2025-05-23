package org.example.withfactory;

import org.example.withfactory.PaymentProcessor;

public class UPIPayment implements PaymentProcessor {

    @Override
    public double processPayment(double amount) {
        return  amount;
    }
}
