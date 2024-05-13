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
    
    /**
     * Assigns numbers to each element in the given array and returns the result as a new array
     * @param array the array to be numbered
     * @return the array as a list
     */
     public static String[] assignNumber(String[] array) {
        String[] result = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = (i + 1) + ". " + array[i];
        }
        return result;
    }
}