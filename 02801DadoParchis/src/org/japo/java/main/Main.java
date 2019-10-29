/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.main;

import java.util.Random;

/**
 *
 * @author CicloM
 */
public class Main {
    
    public static final Random RND = new Random();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int NUM_MIN = 1;
        final int NUM_MAX = 6;
        
        int numero = RND.nextInt(NUM_MAX - NUM_MIN + 1) + NUM_MIN;
        
        System.out.printf("Tirada dado .......: %d%n", numero);

    }
    
}
