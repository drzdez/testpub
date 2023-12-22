/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.gopas.jprog1.appcollections;

import cz.gopas.jprog1.appcollections.obrazce.Usecka;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Student
 */
public class AppCollectionsList2 {
    
    private static int NO_OF_VALUES = 1000;
    private static int LIMIT_VALUE = 5;
    
    public static void main(String[] args) {
      var random = new Random();
      var myList = new ArrayList<Integer>(1000);
      
      for(int i=0; i < NO_OF_VALUES; i++){
          myList.add(random.nextInt(10)+1);
      }
      System.out.printf("Před filtrem obsahuje %d hodnot %n", myList.size());     
      var resList = filterList(myList);
      System.out.printf("Po filtru obsahuje %d hodnot %n", resList.size());
      var listUsecek = getListOfUsecka(resList);
      System.out.printf("List usecek má %d hodnot %n", listUsecek.size());

    }
    
    public static List<Integer> filterList(List<Integer> listIn) {
      var listOut = new ArrayList<Integer>(500);
      for(int i=0; i < listIn.size(); i++){
          if( listIn.get(i) > LIMIT_VALUE) {
              listOut.add(listIn.get(i));
          }
      }      
      return listOut;  
    }

    public static List<Usecka> getListOfUsecka(List<Integer> listIn) {
      var listOut = new ArrayList<Usecka>(listIn.size());
      for(int i=0; i < listIn.size(); i++){
          var useckaToAdd = new Usecka(listIn.get(i));
          listOut.add(useckaToAdd);
          System.out.print(useckaToAdd);
          System.out.print(".");
      }      
      System.out.println();

      return listOut;  
    }
}
