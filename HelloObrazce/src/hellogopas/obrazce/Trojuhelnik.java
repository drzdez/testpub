/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hellogopas.obrazce;

/**
 *
 * @author Student
 */
public class Trojuhelnik {
    
    private Usecka[] radky;
    
    public Trojuhelnik(int velikost) {
        radky = new Usecka[velikost];
        
        for(int i=0; i<velikost; i++) {
            radky[i] = new Usecka(i+1);
        }
    }
    
    public void printConsole(){
        for(int i=radky.length-1; i>=0; i--) {
            System.out.println(radky[i]);
        }        
    }
      
}
