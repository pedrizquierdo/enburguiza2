/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.enburguiza.entities;

import com.google.gson.Gson;

/**
 *
 * @author pedrizquierdo
 */
public class App {

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
     * @return the item
     */
    public Item getItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    public void setItem(Item item) {
        this.item = item;
    }
    
    private String rating;
    private Client client;
    private Order order;
    private Item item;
    
    
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
