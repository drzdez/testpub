/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maventestproject;

import static com.mycompany.maventestproject.AppMode.Automatic;
import static com.mycompany.maventestproject.AppMode.Manual;


import java.util.Scanner;


/**
 *
 * @author Student
 */
public class AppKruh {   
    
    private static final String ERR_MSG = "Zadany prumetr kruhu nelze zpracovat";
    private static final String ERR_MSG_PRINTF = ERR_MSG + ", zadano: %s %n";
    
    public static void main(String[] args) {
      
      AppMode appMode;
      String inputPrumerArg;
        
      if(args.length > 0) {
        inputPrumerArg = args[0];
        appMode = Automatic;
      } else {
        inputPrumerArg = readUserInput();
        appMode = Manual;
      }

      int prumer = 0 ;
      boolean inputOk;
      do{
        try {
          prumer = Integer.decode(inputPrumerArg);
          inputOk = true;
        }catch (NumberFormatException exc){
          
          if(appMode == Automatic) {
              throw new RuntimeException(ERR_MSG);
          }else{
              System.out.printf(ERR_MSG_PRINTF, inputPrumerArg);
          }
          inputOk = false;
        }
        if(!inputOk && appMode == Manual) {
            inputPrumerArg = readUserInput();
        }
      }while(!inputOk);
      
      if (inputOk) {
        Kruh kruh = new Kruh(prumer);
        System.out.printf("Obvod kruhu o prumeru: %dmm je %.2fmm \n", kruh.getPrumer(), kruh.getObvod());
      }
    }
    
    
    private static String readUserInput() {
      System.out.println("Zadej prumer kruhu");
      System.out.flush();
      var scanner = new Scanner(System.in);
      return scanner.next();
    }
    
}
