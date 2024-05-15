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
     * @return the phone number of the client
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phone number of the client to be set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the coordinates of the client
     */
    public String getCoordinates() {
        return coordinates;
    }

    /**
     * @param coordinates the coordinates of the client to be set
     */
    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    /**
     * @return the email of the client
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email of the client to be set
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

