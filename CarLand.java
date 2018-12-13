/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carmodel;

/**
 *
 * @author robert.pl
 */
public class CarLand {
    
    public static void main(String[] args)
    {
        Car deLorean = new Car();
        deLorean.year = 1983;
        deLorean.makeModel = "DeLorean DMC - 12";
        
        displayCarStats(deLorean);
        deLorean.startEngine();
        deLorean.accelerate(88);
        deLorean.decelerate(12);
        displayCarStats(deLorean);
        deLorean.decelerate(76);
        deLorean.stopEngine();
        displayCarStats(deLorean);
        
        Car Truck = new Car();
        Truck.year = 1985;
        Truck.makeModel = "Toyota Hilux 4x4";
        
        displayCarStats(Truck);
        Truck.startEngine();
        Truck.accelerate(25);
        Truck.decelerate(30);
        displayCarStats(Truck);
        Truck.accelerate(5);
        Truck.stopEngine();
        displayCarStats(Truck);
        
        Car Convertible = new Car();
        Convertible.year = 1946;
        Convertible.makeModel = "Ford Super De Luxe";
        
        displayCarStats(Convertible);
        Convertible.startEngine();
        Convertible.lowerRoof();
        Convertible.accelerate(55);
        Convertible.decelerate(55);
        displayCarStats(Convertible);
        Convertible.raiseRoof();
        Convertible.stopEngine();
        displayCarStats(Convertible);
    }
    public static void displayCarStats(Car anyCarObject)
    {
        System.out.println("***** STATS *****");
        System.out.println(anyCarObject.year + " " + anyCarObject.makeModel);
        System.out.println("Engine running? " + anyCarObject.checkEngineStatus());
        System.out.println("Current Speed " + anyCarObject.getCurrentSpeed());
        System.out.println("Current Gear " + anyCarObject.currentGear());
        System.out.println("*****************");
    }
}
