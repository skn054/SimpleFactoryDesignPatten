package org.example.vehiclefactory;

public class VehicleFactory {
    public static Vehicle getVehicle(String type){
        switch (type){
            case "BIKE":
                    return new Bike();
            case "SCOOTER":
                    return new Scooter();
            case "CAR":
                    return new Car();
            default:
                    return null;
        }

    }
    public static Vehicle getAppropriateVehicle(float weight){
        if(weight >100 && weight < 200){
            return new Scooter();
        }else if(weight > 200 && weight < 400){
            return new Bike();

        }else{
            return new Car();
        }
    }
}
