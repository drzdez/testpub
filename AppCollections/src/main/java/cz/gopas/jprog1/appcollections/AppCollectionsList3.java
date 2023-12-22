/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.gopas.jprog1.appcollections;

import static cz.gopas.jprog1.appcollections.AppCollectionsList2.filterList;
import static cz.gopas.jprog1.appcollections.AppCollectionsList2.getListOfUsecka;
import cz.gopas.jprog1.appcollections.obrazce.Usecka;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

/**
 *
 * @author Student
 */
public class AppCollectionsList3 {
    private static int NO_OF_VALUES = 1000;
    private static int LIMIT_VALUE = 5;

    public static void main(String[] args) {
      var random = new Random();
      List<Integer> myList = new ArrayList<>(1000);
      
      for(int i=0; i < NO_OF_VALUES; i++){
          myList.add(random.nextInt(10)+1);
      }
      System.out.printf("Před filtrem obsahuje %d hodnot %n", myList.size());     

      var mandatoryValsList = List.of(6, 8, 10);
      
      var myUseckaMap = myList.stream()
              .filter( AppCollectionsList3::mojeFn)
              .map(uu -> new Usecka(uu))
              .peek(value -> System.out.printf("%s.",value))
              .filter(val -> mandatoryValsList.contains(val.getDelka()))
              .collect(Collectors.toMap(val -> val.getDelka(), val -> val, (oldVal, newVal) -> oldVal ));
 
      System.out.println();
      System.out.printf("Map usecek má %d hodnot \n", myUseckaMap.size());
    }
    
    public static boolean mojeFn(int value) { 
        return value > LIMIT_VALUE; 
    }
}
