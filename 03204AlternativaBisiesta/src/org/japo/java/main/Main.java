/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Casimiro Ondo Obiang casimiro.ondo.alum@iescamp.es
 */
public class Main {
   public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");
   public static void main(String[] args) {
        //Ejeercicio: 03204 AlternativaBisiesta
        //Constante
       String SI = "SI";
       String NO = "NO";
        //Variable
        String elegir;
        //Rotulo
        System.out.println("Alternativa Bisiesta");
        System.out.println("====================");
        try{
        //Scanner
        System.out.print("Análisis año ...: ");
        int año = SCN.nextInt();
        if (año % 400 == 0){
            elegir = SI;   
        } else if(año %100 == 0 ){
            elegir = NO;
        } else if (año %4 == 0){
            elegir = SI;
        }else {
            elegir = NO;
        }
        //Separador
        System.out.println("---");                
        //Mensaje
        System.out.printf("El año "+año+"....:"+elegir+" es bisiesto");
        }
        catch(Exception e){
            System.out.println("ERROR: Entrada incorrecta");
        }
    }
}

