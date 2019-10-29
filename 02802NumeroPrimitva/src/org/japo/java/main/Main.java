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
//Ejercicio 02802NumeroPrimitva
public class Main {
     public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");
     public static void main(String[] args) {
        System.out.println("debe estar entre 1 y 49");
        int np = SCN.nextInt();
        System.out.printf("Número Primitiva ..: %d%n", np);
     }
}
