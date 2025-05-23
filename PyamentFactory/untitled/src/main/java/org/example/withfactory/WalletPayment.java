package org.example.withfactory;

import org.example.withfactory.PaymentProcessor;

public class WalletPayment implements PaymentProcessor {
    @Override
    public double processPayment(double amount) {
        amount = amount - amount * 0.01;
        return  amount;
    }
}
