/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package cz.gopas.vlak;

import cz.gopas.vlak.enums.TypVozu;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Student
 */
public class OsobniVagonTest {
    
    public OsobniVagonTest() {
    }

    @Test
    public void testGetPocetMist() {
        OsobniVagon osobniVagon = new OsobniVagon(TypVozu.OsobniVagon, 10);
        assertEquals(osobniVagon.getPocetMist(), 10);

    }

    @Test
    public void testClimaName() {
    }
    
}
