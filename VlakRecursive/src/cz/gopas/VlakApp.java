/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cz.gopas;

import static cz.gopas.vlak.enums.TypVozu.JidelniVuz;
import static cz.gopas.vlak.enums.TypVozu.OsobniVagon;

import cz.gopas.vlak.JidelniVuz;
import cz.gopas.vlak.Lokomotiva;
import cz.gopas.vlak.OsobniVagon;
import cz.gopas.vlak.Vlak;


/**
 *
 * @author Student
 */
public class VlakApp {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
        
        var vlak = new Vlak(new Lokomotiva(1000000));
        
        vlak.pridejVagon(new OsobniVagon(OsobniVagon, 100));
        vlak.pridejVagon(new OsobniVagon(OsobniVagon, 100));
        vlak.pridejVagon(new OsobniVagon(OsobniVagon, 100));
        vlak.pridejVagon(new JidelniVuz(JidelniVuz, 10));
        vlak.pridejVagon(new OsobniVagon(OsobniVagon, 100));
        
        System.out.printf("Delka vlaku: %d \n", vlak.getDelka());
        System.out.printf("Pocet jidelnich vozu: %d \n", vlak.pocetJidelnichVozu());
        System.out.printf("Delka vlaku: %d \n", vlak.getCountRecursive());
        
    }    
}
