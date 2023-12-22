/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package cz.gopas.jprog1.appcollections;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Student
 */
public class AppCollectionsList2Test {
    

    @Test
    public void filterList_returns_valueslargetThanLimit() {       
        var inputList = List.of(1,2,3,4,5,6,7,8,9,10);
        var expectedOutList = List.of(6,7,8,9,10,11);
        
        assertThat(AppCollectionsList2.filterList(inputList)).containsAll(expectedOutList);
    }
    
}
