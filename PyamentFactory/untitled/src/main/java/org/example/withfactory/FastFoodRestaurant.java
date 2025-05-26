package org.example.withfactory;

public class FastFoodRestaurant extends Restaurant{

    @Override
    float calculateDeliveryTime(double distance) {
        return 0;
    }
}
