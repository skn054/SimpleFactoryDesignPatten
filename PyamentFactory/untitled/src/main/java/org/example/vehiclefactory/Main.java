package org.example.vehiclefactory;

public class Main {
    public static void main(String args[]){

        Client client = new Client();
//        client.processOrder("BIKE");
//        now assign vehicle based on weight(in gms) on the order.
//          if weight is between 100 - 200 gms => scooter
//           weight is between 200 - 400 gms => BIKE
//        weight is 400gm and above => car
        client.processOrder(400);
    }
}
