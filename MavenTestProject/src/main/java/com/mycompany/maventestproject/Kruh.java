/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maventestproject;

/**
 * Tato třída reprezentuje kruh s výpočty jeho parametrů
 * 
 * @author Student
 */
public class Kruh {
    
    private static final double PI = 3.1415927;
    
    private final int prumer;
   
    /**
     * Výpočet průměru kruhu
     * 
     * @param prumer 
     * průmer kruhu
     */
    public Kruh(int prumer){
        this.prumer = prumer;
    }
    
    public int getPrumer() {
        return prumer;
    }
    
    public double getObvod() {
        return prumer * PI;
    }
}
