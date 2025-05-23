package org.example.withfactory;

import org.example.withfactory.CreditCardPayment;
import org.example.withfactory.DebitCardPayment;
import org.example.withfactory.PaymentProcessor;
import org.example.withfactory.UPIPayment;
import org.example.withfactory.WalletPayment;

public class Client {

    /** client can be swiggy, zomato etc...**/
    /**
     * Exercise 1: Payment Method Factory (Beginner Level)
     * Scenario: You're building a payment system for a food delivery app like Swiggy/Zomato.
     * Customers can pay using different methods, and each payment method has different processing logic.
     *
     * Implement concrete payment classes:
     *
     * CreditCardPayment - adds 2% processing fee
     * DebitCardPayment - adds 1% processing fee
     * UPIPayment - no additional fee
     * WalletPayment - gives 1% cashback (subtract from amount)
     *
     *
     *
     *
     *
     * **/
    public boolean processPayment(String method,float amount) throws Exception {
        PaymentProcessor processor ;


        processor = PaymentFactory.getPaymentType(method);
        System.out.println(processor.processPayment(amount));

        return false;


    }
}

