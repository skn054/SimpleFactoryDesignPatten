package org.example;

import org.example.withfactory.Client;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//            Client client = new Client();
//            client.processPayment("WALLET",100);

        Client client = new Client();
        client.processPayment("WALLET",100);
        }
    }
