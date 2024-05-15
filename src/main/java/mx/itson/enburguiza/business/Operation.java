/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.enburguiza.business;

import java.util.List;
import mx.itson.enburguiza.entities.Item;

/**
 *
 * @author alang
 * Includes operation methods needed for prices
 */
public class Operation {
    
   
    /** 
     * Sums up the prices
     * @param items it is the list where the prices and quantities are contained
     * @return the sum of all prices in the Json file
     */

    public static double calculateTotal(List<Item> items) {
        double total = 0;
        for (Item i : items) {
            total += i.getPrice() * i.getQuantity();
        }
        return total;
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