package DesignPatterns.factoryMethod;

public class ErrorType implements Vehicle{
    public void createVehicle(){
        System.out.println("Error: Vehicle type is not valid!!!");
    }
}
