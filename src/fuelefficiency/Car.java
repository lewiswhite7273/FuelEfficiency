/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fuelefficiency;

/**
 *
 * @author lewhi7273
 */
public class Car extends Vehicle{
    public Car(){
   super();
    }
    private double litres;
    
     public double getDistance(double lit){
         litres = lit;
         double calc = 100/9.4;
         double finals = calc*litres;
         return finals;
    }
}
