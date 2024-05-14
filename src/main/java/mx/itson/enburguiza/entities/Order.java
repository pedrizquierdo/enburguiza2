/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.enburguiza.entities;

import java.util.Date;

/**
 *
 * @author Uli23
 */
public class Order {

    /**
     * @return the restaurant Address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the restaurant Address to be set
     */
    public void setAddress(String address) {
        this.address = address;
    }

   
    /**
     * @return the estimateTime the delivery person arrives
     */
    public int getEstimateTime() {
        return estimateTime;
    }

    /**
     * @param estimateTime in wich the delirevy person who will be awarded arrives
     */
    public void setEstimateTime(int estimateTime) {
        this.estimateTime = estimateTime;
    }

    /**
     * @return distance from the delivery person
     */
    public double getDistance() {
        return distance;
    }

    /**
     * @param distance from the delivery person to be set
     */
    public void setDistance(double distance) {
        this.distance = distance;
    }

    /**
     * @return the restaurant name 
     */
    public String getRestaurant() {
        return restaurant;
    }

    /**
     * @param restaurant the restaurant name to be set
     */
    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    /**
     * @return price of the taxes
     */
    public double getTaxes() {
        return taxes;
    }

    /**
     * @param taxes price of the taxes previusly assigned to be set
     */
    public void setTaxes(double taxes) {
        this.taxes = taxes;
    }


    /**
     * @return the number of the order
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number of the order to be set
     */
    public void setNumber(int number) {
        this.number = number;
    }
    
    private String address;
    private int estimateTime;
    private double distance;
    private String restaurant;
    private double taxes;
    private int number;
   
}
