/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package mx.itson.enburguiza.business;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gals0
 */
public class OperationIT {
    
    public OperationIT() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of add method, of class Operation.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        double[] array = {5, 10};
        double expResult = 15;
        double result = Operation.Add(array);
        assertEquals(expResult, result, 0);
       
    }

    /**
     * Test of taxes method, of class Operation.
     */
    @Test
    public void testTaxes() {
        System.out.println("taxes");
        double price = 100;
        Operation instance = new Operation();
        double expResult = 116;
        double result = instance.taxes(price);
        assertEquals(expResult, result, 0);
        
    }
    
}
