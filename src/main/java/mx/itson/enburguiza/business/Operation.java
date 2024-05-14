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
     * calculate the sum of the elements of an array
     * @param array the array with which the sums will be made
     * @return the total sum of the elements of the array
     */
     public static int Add(double[] array) {
        int result = 0;
        
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        return result;
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