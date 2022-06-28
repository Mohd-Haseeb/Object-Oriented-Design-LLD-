package DesignPatterns.factoryMethod;

public class VehicleFactory {
    public static Vehicle getVehicle(String vehicleType){
        Vehicle obj;

        if(vehicleType.equals("car")){
            obj = new Car();
            return obj;
        }else if(vehicleType.equals("bike")){
            obj = new Bike();
            return obj;
        } else{
            System.out.println(vehicleType+" is not a valid vehicle type!!");
            
        }

        // return obj;
        obj = new ErrorType();
        return obj;

    }
}
