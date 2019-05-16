/*
 * Lewis White
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fuelefficiency;

import java.util.Scanner;

/**
 *
 * @author lewhi7273
 */
public class FuelEfficiency {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double gas;
        Scanner input = new Scanner(System.in);
        System.out.println("How many litres of gas do you have?: ");
        gas = input.nextDouble();
        
        System.out.println("On "+gas+ " litres of gas the vehicles can drive:");
        
        //create one of each vehicle
        Truck t1 = new Truck();
        Car c1 = new Car();
        HybridCar h1 = new HybridCar();
        Motorcycle m1 = new Motorcycle();
        
         System.out.println("The Truck travels: " + t1.getDistance(gas) + " KM");
         System.out.println("The Car travels: "+ c1.getDistance(gas)+" KM");
         System.out.println("The Hybrid Car travels: "+h1.getDistance(gas)+" KM");
         System.out.println("The Motorcycle travels: "+m1.getDistance(gas)+" KM");
       }
    }
    

