package org.example.withfactory;

import org.example.withfactory.PaymentProcessor;

public class CreditCardPayment implements PaymentProcessor {
    @Override
    public double processPayment(double amount) {
        amount = amount + amount * 0.02;

        return amount;

    }
}
