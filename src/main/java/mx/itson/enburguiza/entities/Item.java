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
     * @return the price of each item the client ordered
     */
    public Double getPrice() {
        return price;
    }

    /**
     * @param price the price of each item the client ordered to be set
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * @return the name of each item the client ordered
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name of each item the client ordered to be set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the quantity of each item the client ordered
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity of each item the client ordered to be set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    
    private String name;
    private int quantity;
    private Double price;
    
}
