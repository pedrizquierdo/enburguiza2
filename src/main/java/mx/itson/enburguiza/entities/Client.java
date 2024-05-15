/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.enburguiza.entities;

/**
 *
 * @author pedrizquierdo
 */
public class Client {

    /**
     * @return the client address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the client address to be set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the name of the client
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name of the client to be set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the Phone Number of the client
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phone Number to be set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the client Coordinates
     */
    public String getCoordinates() {
        return coordinates;
    }

    /**
     * @param coordinates the client Coordinates to be set
     */
    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    /**
     * @return the client Email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the client Email to be set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    private String address;
    private String name;
    private String phoneNumber;
    private String coordinates;
    private String email;
    
     
}

