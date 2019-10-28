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
 */public final class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");
    public static void main(String[] args) {
        //Constantes
        final String DUEÑO = "Sócrates";
        final String DUEÑO_LORO ="Ave Cesar";
        final String DESCONOCIDO = "¡Sócrates socorro!";
        //Variable
        final String llegada;
        final String Grita;
        System.out.println("Alternativa Loro");
        System.out.println("================");
        System.out.println("Persona que se acerca...:");
        llegada=SCN.nextLine();
       if(llegada.equals(DUEÑO)){
           Grita=DUEÑO_LORO;
       }else{
           Grita=DESCONOCIDO;
       }
       System.out.println("---");
        System.out.println("Dueño del loro.....:"+DUEÑO);
        System.out.println("---");
        System.out.print("Mensaje loro........:"+Grita);
              
        
        
    }
}