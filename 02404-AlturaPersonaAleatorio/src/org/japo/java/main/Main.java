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
       //Ejercicio: 02404-AlturaPersonaAleatorio
       final double VMIN= 0.50;
       final double VMAX= 2.50;
       //Variable
       double altura = RDM.nextDouble()*(VMAX-VMIN)+VMIN;
       //mensaje
       System.out.printf("Altura aleatoria.......:%.2f%n", altura);
     
       
       
    }
}
