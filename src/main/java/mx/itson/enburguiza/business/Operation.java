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
     * Calculates the sum of two numbers
     * @param num1 the first number to add
     * @param num2 the second number to add
     * @return the sum of the two numbers
     */
    
    public static double add(double num1, double num2){
        return num1 + num2;
    }
    
    /**
     * Calculates taxes on a given price
     * @param price the price to which taxes will be applied
     * @return the total price after taxes (original price plus taxes)
     */
    
    public double taxes(double price){
        double taxes = (price * 0.16) + price;
        return taxes;
    }

}