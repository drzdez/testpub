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

/**
 *
 * @author Student
 */
public class FileProcessApp {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
       FileReader fr = new FileReader("C:\\Users\\Student\\Documents\\NetBeansProjects\\FileReadProcess\\data-cisla.txt");
       BufferedReader br = new BufferedReader(fr); 
       
       FileWriter fw = new FileWriter("C:\\Users\\Student\\Documents\\NetBeansProjects\\FileReadProcess\\data-cisla-suda.txt");
       BufferedWriter bw = new BufferedWriter(fw); 
       
         br.lines()
               .filter(x ->  Integer.decode(x) % 2 == 0 )
               .peek(x -> System.out.println(x))
               .forEach(val -> {
                   try{
                     bw.write(val);
                     bw.newLine();
                   } catch (IOException e) {
                       System.out.println(e.getLocalizedMessage());
                   } 
               });
         bw.close();
    }
}
