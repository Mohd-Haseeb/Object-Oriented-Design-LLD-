package DesignPatterns.factoryMethod;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello WOrld!!!");


        // Problem with this approach is , in the future if the client asks to add more vehicle types (say bus, train etc),
        // then we have to change the client code by adding more if-else blocks.
        // This is a tightly coupled code, client shouldn't be concerned with the changes made to the application.

        /* 

        ----------------------------- NOT SO OPTIMIZED APPROACH -----------------------------

        try (Scanner obj = new Scanner(System.in)) {
            System.out.println("enter vehicle type: Car or Bike");

            String vehicleName = obj.nextLine();

            if(vehicleName.equals("car")){
                Vehicle nissan = new Car();
                nissan.createVehicle();

            }else if(vehicleName.equals("bike")){
                Vehicle activa = new Bike();
                activa.createVehicle();

            }else{
                System.out.println("Enter valid Vehicle name");
            }
        }

        ---------------------------- NOT SO OPTIMIZED APPROACH (END) -----------------------------

        */

        //  This is where Factory Pattern comes to the rescue, In the we can change the creation logic without exposing it to the client.
        // The client will only engage with the vehicle class, unbothered about the specifics of the implementation.
        // CLIENT and CREATION login are now loosely coupled.
        /* 
         
        Usage of Factory Desgin Pattern:
            -> When a class doesn't know what sub-classes will be required
            -> When a class wants that it's sub-classes specify the objects to be created
            -> When the parent classes choose the creation of objects to its sub-classes

        */

        System.out.println("enter vehicle type for Factory Pattern : Car or Bike");

        try (Scanner scannerObj = new Scanner(System.in)) {
            String vehicleName = scannerObj.nextLine();


            Vehicle vehicleFactory;

            vehicleFactory = VehicleFactory.getVehicle(vehicleName.toLowerCase());

            vehicleFactory.createVehicle();
        }




    }
}
