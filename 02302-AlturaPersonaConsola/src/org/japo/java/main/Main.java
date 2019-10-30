/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Random;
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
       //Ejercicio: 02302-AlturaPersonaConsola
        final double ALTURA;
        //Cuarentena
        try {
            //Leer dato
            System.out.print("Introduzca su altura ......: ");
            ALTURA= SCN.nextDouble();
            
            //Mensaje
            System.out.printf("Su altura es ..............: %.2f metros %n", ALTURA);
        } catch (Exception e) {
            System.out.println("ERROR: Entrada incorrecta");
       
    }
}
}