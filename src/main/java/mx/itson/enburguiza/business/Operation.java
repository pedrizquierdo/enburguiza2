/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.enburguiza.business;

/**
 *
 * @author alang
 */
public class Operation {
    
    public static double add(double num1, double num2){
        return num1 + num2;
    }
    
    public double taxes(double price){
        double taxes = (price * 0.16) + price;
        return taxes;
    }
    
}
