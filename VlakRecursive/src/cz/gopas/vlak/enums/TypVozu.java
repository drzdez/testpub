/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package cz.gopas.vlak.enums;

/**
 *
 * @author Student
 */
public enum TypVozu {
    OsobniVagon (10233),
    JidelniVuz (54633),
    Lokomotiva (123) ;
    
    public final int idTypuVagonu;
    
    private TypVozu(int idTypuVagonu) {
        this.idTypuVagonu = idTypuVagonu;
    }
    
    public static TypVozu getIdTypuVagonu (int idTypu) {
        var values = TypVozu.values();
        for(int i = 0; i< values.length; i++) {
            if(values[i].idTypuVagonu == idTypu) {
                return values[i];
            }
        }
        return null;
    }
}
