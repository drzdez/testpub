/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.gopas.jprog1.appcollections;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Student
 */
public class AppCollections {
    public static void main(String[] args) {       
        Random rand = new Random();
        List<Integer> listRand = new ArrayList();
        
        for(int i=0; i<10; i++) {
            int numToAdd = rand.nextInt(10);
            listRand.add(numToAdd);
            System.out.printf("%d,",numToAdd);
        }
        System.out.println();
    }
}
