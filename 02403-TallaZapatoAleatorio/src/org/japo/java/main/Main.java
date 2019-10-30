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
       //Ejercicio: 02403-TallaZapatoAleatorio
       final int MIN=20;
       final int  MAX=60;
       //Variable
       int zapato=RDM.nextInt(MAX-MIN+1)+MIN;
       System.out.printf("Talla de zapato.......:%d%n", zapato);
     
       
       
    }
}
