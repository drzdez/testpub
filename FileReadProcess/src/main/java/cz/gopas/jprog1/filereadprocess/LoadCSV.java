/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.gopas.jprog1.filereadprocess;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Student
 */
public class LoadCSV {
    
    private static String CSV_DIVIDER = ",";
    private static int HEADER_ROWS = 1;
    
    public static void main(String[] args) throws FileNotFoundException {
       FileReader fr = new FileReader("C:\\Users\\Student\\Documents\\NetBeansProjects\\FileReadProcess\\data-csv-graf-objekty.txt");
       BufferedReader br = new BufferedReader(fr); 
             
         br.lines()
                 .skip(HEADER_ROWS)
                 .forEach(lineIn -> {
             var listVals = List.of(lineIn.split(CSV_DIVIDER));
             System.out.println(listVals.get(0));
                 });
         
    }    
}
