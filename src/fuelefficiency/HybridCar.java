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
public class HybridCar extends Vehicle{
    private double litres;
    public HybridCar(){
        super();
    }
    

     public double getDistance(double lit){
         litres = lit;
         double calc = 100/3.8;
         double finals = calc*litres;
         return finals;
}
}