/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.enburguiza.entities;

import com.google.gson.Gson;
import java.util.Date;
import java.util.List;

/**
 *
 * @author pedrizquierdo
 */
public class App {

    /**
     * @return the rating
     */
    public Double getRating() {
        return rating;
    }

    /**
     * @param rating the rating to set
     */
    public void setRating(Double rating) {
        this.rating = rating;
    }


    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the items
     */
    public List<Item> getItems() {
        return item;
    }

    /**
     * @param items the items to set
     */
    public void setItems(List<Item> items) {
        this.item = item;
    }

    /**
     * @return the client
     */
    public Client getClient() {
        return client;
    }

    /**
     * @param client the client to set
     */
    public void setClient(Client client) {
        this.client = client;
    }

    /**
     * @return the order
     */
    public Order getOrder() {
        return order;
    }

    /**
     * @param order the order to set
     */
    public void setOrder(Order order) {
        this.order = order;
    }
    /**
     * return delivery person rating
     */
    
    
    
  
    private Date date;
    private Double rating;
    private Client client;
    private Order order;
    private List<Item> item;
    
    
    /**
     * 
     * @param json is the method to deseialize
     * @return the deserialized json
     */
    public App deserialize (String json) {
        App app = new App ();
        try {
            app= new Gson().fromJson(json, App.class);
            
    } catch(Exception ex) {
            System.err.println("An error occurred while deserializing" + ex.getMessage()); 
    }
     return app;
    }
}
