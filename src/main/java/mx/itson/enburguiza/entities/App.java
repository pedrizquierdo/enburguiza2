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
        return items;
    }

    /**
     * @param items the items to set
     */
    public void setItems(List<Item> items) {
        this.items = items;
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
    public String getRating() {
        return rating;
    }
    /**
     * @param delivery person rating to be set
     */
    public void setRating(String Rating){
        this.rating = rating;
    }

    private Date date;
    private String rating;
    private Client client;
    private Order order;
    private List<Item> items;
    
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
