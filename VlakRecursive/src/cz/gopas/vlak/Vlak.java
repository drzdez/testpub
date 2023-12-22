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
public class Vlak {
    
    private Lokomotiva lokomotiva;
    
    public Vlak(Lokomotiva lokomotiva) {
        this.lokomotiva = lokomotiva;
    }

    private Vuz getLastVagon() {
        Vuz aktVuz = lokomotiva.getNextVuz();
        
        if (aktVuz == null) {
            return null;
        }
        
        while (aktVuz.getNextVuz() != null) {
            aktVuz = aktVuz.getNextVuz();
        }
        
        return aktVuz;
    }    

    public int getDelka() {
        Vuz aktVagon = lokomotiva.getNextVuz();
              
        int delka = 0;
        
        if (aktVagon == null) {
            return 0;
        }
        
        delka++;
        
        while (aktVagon.getNextVuz() != null) {
            aktVagon = aktVagon.getNextVuz();
            delka++;
        } 
        
        return delka;
    }    

    
    public void pridejVagon(OsobniVagon vagon) {        
        if (getLastVagon() == null ) {
            lokomotiva.setNextVuz(vagon); 
            return;
        }
        getLastVagon().setNextVuz(vagon);
    }
    
    public int pocetJidelnichVozu() {
        Vuz aktVagon = lokomotiva.getNextVuz();
        int delka = 0;
        
        if (aktVagon == null) {
            return 0;
        } 
        if (aktVagon.getTypVozu() == TypVozu.JidelniVuz ) {
          delka++;
        }       
        while (aktVagon.getNextVuz() != null) {
            aktVagon = aktVagon.getNextVuz();
          if (aktVagon.getTypVozu() == TypVozu.JidelniVuz) {
            delka++;
          }
        }         
        return delka;
    }

    public int getCountRecursive() {
        return countRecursive(lokomotiva);
    }
    
    private int countRecursive( Vuz aktVuz) {
        if(aktVuz == null) {
            return 0;
        }        
        return countRecursive(aktVuz.getNextVuz()) + 1;
    }

    
}
