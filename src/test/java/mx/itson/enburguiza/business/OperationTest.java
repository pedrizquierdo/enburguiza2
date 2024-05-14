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
 * @author alang
 */
public class OperationTest {
    
    public OperationTest() {
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
        double num1 = 12;
        double num2 = 11.4;
        double expResult = 23.4;
        double result = Operation.add(num1, num2);
        assertEquals(expResult, result, 1);
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
        assertEquals(expResult, result, 1);

    }
    
}
