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
     * @return the rating of the delivery guy
     */
    public Double getRating() {
        return rating;
    }

    /**
     * @param rating the rating of the delivery guy to be set
     */
    public void setRating(Double rating) {
        this.rating = rating;
    }


    /**
     * @return the date on which the order was placed
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date on which the order was placed to be set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the items that the client ordered 
     */
    public List<Item> getItems() {
        return item;
    }

    /**
     * @param items the items that the client ordered to be set
     */
    public void setItems(List<Item> items) {
        this.item = item;
    }

    /**
     * @return the client class to invoke
     */
    public Client getClient() {
        return client;
    }

    /**
     * @param client the client class to invoke to be set
     */
    public void setClient(Client client) {
        this.client = client;
    }

    /**
     * @return the order class to invoke
     */
    public Order getOrder() {
        return order;
    }

    /**
     * @param order the order class to invoke to be set
     */
    public void setOrder(Order order) {
        this.order = order;
    }
      
  
    private Date date;
    private Double rating;
    private Client client;
    private Order order;
    private List<Item> item;
    
    
    /**
     * 
     * @param json is the method to deserialize
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
