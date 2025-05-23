package org.example.withfactory;

import org.example.withfactory.PaymentProcessor;
import org.example.withfactory.CreditCardPayment;
import org.example.withfactory.DebitCardPayment;
import org.example.withfactory.UPIPayment;
import org.example.withfactory.WalletPayment;

public class PaymentFactory {

    public static PaymentProcessor getPaymentType(String method) throws Exception {
        PaymentProcessor processor;
        switch (method){
            case "CREDIT_CARD":
                processor = new CreditCardPayment();
                break;
            case "DEBIT_CARD":
                processor = new DebitCardPayment();
                break;
            case "UPI":
                processor = new UPIPayment();
                break;
            case "WALLET":
                processor = new WalletPayment();
                break;
            default:
                throw new Exception("Invaid payment method");
        }

        return  processor;

    }
}
