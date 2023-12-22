/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.gopas.vlak;

import cz.gopas.vlak.enums.TypVozu;

/**
 *
 * @author Student
 */
public class Lokomotiva extends Vuz{
    int vykonWatt;
    
    private final KontrolaMotoru kontrolaMotoru;
    
    private class KontrolaMotoru {
        public boolean jeMotorOk() {
            return true;
        }
    }
    
    public Lokomotiva(int vykonWatt) {
        super(TypVozu.Lokomotiva);
        this.vykonWatt = vykonWatt;
        this.kontrolaMotoru = new KontrolaMotoru();
    }
    
    public boolean jeMotorOk() {
        return kontrolaMotoru.jeMotorOk();
    }
    
    public int getVykonWatt() {
        return vykonWatt;
    }
}
