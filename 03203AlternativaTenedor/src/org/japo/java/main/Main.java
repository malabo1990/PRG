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
        //Ejercicio: 03204-AlternativaTenedor
        //Constantes
        final int PUAS3 = 3;
        final int PUAS4 = 4;
        final int PUAS0 = 0;
        final String COMIDA1 = "carne";
        final String COMIDA2 = "pescado";
        final String COMIDA3 = "sopa";
       
        int tenedor;
        System.out.println("Alternativa Tenedor");
        System.out.println("================");
        System.out.println("Tipo de comida...:");
        String comida=SCN.nextLine().toLowerCase();
        
        if(comida.equals(COMIDA1)){
            tenedor = PUAS3;
        }else if(comida.equals(COMIDA2)){
            tenedor = PUAS4;}
        else{
            tenedor = PUAS0;}
        //Mensaje
       
       System.out.println("---");
       System.out.println("Tenedor con ....:"+tenedor);
    }
}
