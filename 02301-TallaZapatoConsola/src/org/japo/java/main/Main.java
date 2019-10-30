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
    
        //Ejercicio: 02301-TallaZapatoConsola
       int TALLA;
       
        //Cuarentena
        try {
            //Leer dato
            System.out.print("tU talla de su zapato: ");
            TALLA = SCN.nextInt();
            
            //Mensaje
            System.out.printf("Talla de zapato .......: %d%n", TALLA);
        } catch (Exception e) {
            //Mensaje si hay error
            System.out.println("ERROR: Entrada incorrecta");
    }
}
}
