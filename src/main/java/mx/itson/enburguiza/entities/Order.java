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
     * @return the distance
     */
    public double getDistance() {
        return distance;
    }

    /**
     * @param distance the distance to set
     */
    public void setDistance(double distance) {
        this.distance = distance;
    }

    /**
     * @return the restaurant
     */
    public String getRestaurant() {
        return restaurant;
    }

    /**
     * @param restaurant the restaurant to set
     */
    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    /**
     * @return the taxes
     */
    public double getTaxes() {
        return taxes;
    }

    /**
     * @param taxes the taxes to set
     */
    public void setTaxes(double taxes) {
        this.taxes = taxes;
    }


    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }
    
    private int estimateTime;
    private double distance;
    private String restaurant;
    private double taxes;
    private int number;
   
}
