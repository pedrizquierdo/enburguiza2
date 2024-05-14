/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.enburguiza.entities;

/**
 *
 * @author gals0
 */
public class Item {

    /**
     * @return the price of each item that was previously assigned to it
     */
    public Double getPrice() {
        return price;
    }

    /**
     * @param price of each item that was previously assigned to it to be set
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * @return the name of each item previously assigned
     */
    public String getName() {
        return name;
    }

    /**
     * @param name of each item previously assigned to be set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return Quantity of previously purchased items assigned
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity of previously purchased items assigned to be set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    
    private String name;
    private int quantity;
    private Double price;
    
}
