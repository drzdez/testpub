/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package cz.gopas.vlak;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author Student
 */
public class LokomotivaTest {
    

    @Test
    public void getVykonWatt_returns_expectedValueFromConstructor() {
        var lokomotiva = new Lokomotiva(123);
         assertEquals(lokomotiva.getVykonWatt(), 123);
    }
    
}
