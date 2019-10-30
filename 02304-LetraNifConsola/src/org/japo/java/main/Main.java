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
       //Ejercicio: 02404-LetraNIFConsola
       char letra;
       //variable
       System.out.print("Tu letra");
       letra = SCN.nextLine().charAt(0);
       System.out.print("Letra DNI.......:"+letra);


       
    }
}
