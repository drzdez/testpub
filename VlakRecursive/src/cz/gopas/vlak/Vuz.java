/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.gopas.vlak;

import cz.gopas.vlak.enums.TypVozu;
import cz.gopas.vlak.interfaces.BarevnyVagon;

/**
 *
 * @author Student
 */
public abstract class Vuz implements BarevnyVagon{
    
    private Vuz nextVuz;
    private TypVozu typVozu;

    public Vuz(TypVozu typVozu) {
        this.typVozu = typVozu;
    }
    
    public TypVozu getTypVozu() {
        return typVozu;
    }
    
    public int getColor() {
        return 10;
    }
    
    public Vuz getNextVuz() {
        return nextVuz;
    }
    
    public void setNextVuz(Vuz nextVuz) {
        this.nextVuz = nextVuz;
    }
    
   private int barvaPodleTypu(TypVozu typVozu) {
       
       TypVozu typ = TypVozu.values()[typVozu.idTypuVagonu];
       switch (typ) {
           case JidelniVuz:
                   return 10;
           case OsobniVagon:
                   return 20;
           default:
               return 0;
       }
   }
    
}
