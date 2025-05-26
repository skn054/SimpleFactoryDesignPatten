package org.example.withfactory;

abstract class Restaurant {
    public String name;
    public String addresss;
    public float deliveryRadius;
    public float minimumOrderValue;
    public float deliveryFee;


    abstract float calculateDeliveryTime(double distance);


}
