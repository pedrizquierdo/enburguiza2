/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.enburguiza.entities;


/**
 *
 * @author Uli23
 */
public class Order {

    /**
     * @return the restaurant address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the restaurant address to be set
     */
    public void setAddress(String address) {
        this.address = address;
    }

   
    /**
     * @return the estimate time of the delivery
     */
    public int getEstimateTime() {
        return estimateTime;
    }

    /**
     * @param estimateTime the estimate time of the delivery to be set
     */
    public void setEstimateTime(int estimateTime) {
        this.estimateTime = estimateTime;
    }

    /**
     * @return the distance between the delivery guy and the client address
     */
    public double getDistance() {
        return distance;
    }

    /**
     * @param distance the distance between the delivery guy and the client address to be set
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
     * @return the taxes of the client order
     */
    public double getTaxes() {
        return taxes;
    }

    /**
     * @param taxes the taxes of the client order to be set
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
     * @param number the number of the order to be set
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
