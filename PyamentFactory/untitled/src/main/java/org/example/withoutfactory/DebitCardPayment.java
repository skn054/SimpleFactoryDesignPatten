package org.example.withoutfactory;

public class DebitCardPayment implements PaymentProcessor{
    @Override
    public double processPayment(double amount) {
        amount = amount + amount * 0.01;
        return  amount;
    }
}
