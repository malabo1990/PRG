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
       //Ejercicio: 02406-LetraInicioAleatorio
       final char LETRA_INICIO = 'A';
       final char LETRA_FINAL = 'Z';
       
        //Variable
        char letra;
        letra = (char)(RDM.nextInt(LETRA_INICIO-LETRA_FINAL+1)+LETRA_FINAL);

        //Mensaje
        System.out.printf("Letra de inicio de examen.....: %c&n", letra);
    }
}
