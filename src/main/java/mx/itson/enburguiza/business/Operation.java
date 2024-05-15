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
 */
public class Operation {
    
   

    public static double calculateTotal(List<Item> items) {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice() * item.getQuantity();
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