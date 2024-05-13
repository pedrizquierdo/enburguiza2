/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.enburguiza.business;

/**
 *
 * @author alang
 */
public class Operation {
    
    /**
     * Calculates the sum of two numbers.
     * @param num1 The first number to plus.
     * @param num2 The second number to plus.
     * @return The sum of the two numbers.
     */
    
    public static double add(double num1, double num2){
        return num1 + num2;
    }
    
    /**
     * Calculates taxes on a given price.
     * @param price The price to which taxes will be applied.
     * @return The total price after taxes (original price plus taxes).
     */
    
    public double taxes(double price){
        double taxes = (price * 0.16) + price;
        return taxes;
    }
    
}
