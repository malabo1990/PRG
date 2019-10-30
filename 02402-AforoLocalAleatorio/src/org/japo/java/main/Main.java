/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.main;

import java.util.Random;

/**
 *
 * @author Casimiro Ondo Obiang casimiro.ondo.alum@iescamp.es
 */
public class Main {
    public static final Random RDM = new Random();
    public static void main(String[] args) {
       //Ejercicio: 02402-AforoLocalAlteatorio
       final int MIN=0;
       final int MAX=100;
       int aforo = RDM.nextInt(MAX-MIN+1)+MIN;
               
       System.out.printf("Aforo actual del local....: %d%n", aforo);
     
       
       
    }
}
