/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.gopas.vlak;

import cz.gopas.vlak.enums.TypVozu;
import cz.gopas.vlak.interfaces.KlimatizovanyVagon;

/**
 *
 * @author Student
 */
public class OsobniVagon extends Vuz implements KlimatizovanyVagon{
    private final int pocetMist;

    
    public OsobniVagon(TypVozu typVozu, int pocetMist) {
        super(typVozu);
        this.pocetMist = pocetMist;
    }
    
    public int getPocetMist() {
        return pocetMist;
    }    

    public String climaName() {
        return "ClimaName";
    }
}
