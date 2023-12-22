/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.maventestproject;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class KruhTest {
    
    @org.junit.jupiter.api.Test
    public void testGetPrumer() {
        Kruh instance = new Kruh(10);
        int expResult = 10;
        int result = instance.getPrumer();
        assertEquals(expResult, result);
    }

    /**
     * Test of getObvod method, of class Kruh.
     */
    @org.junit.jupiter.api.Test
    public void testGetObvod() {
        Kruh kruh = new Kruh(10);
        
        double result = kruh.getObvod();
        assertEquals(31.41D, result, 0.01);
    }
    
}
