/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hellogopas.obrazce;

/**
 *
 * @author Student
 */
public class Usecka {
    private static final String STR_OUT = "*";
    private int delka;
    
    int getDelka() {
        return delka;
    }
    
    void setDelka(int delka) {
        this.delka = delka;
    }
    
    public Usecka(int delka) {
        this.delka = delka;
    }
    
    public String toString() {
        String resultStars = "";
        for(int i=0; i<delka; i++) {
            resultStars += STR_OUT;
        }
        return resultStars;
    }
}
