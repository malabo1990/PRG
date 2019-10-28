/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.main;

import java.util.Locale;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        //Cosntante
        final String CHICA = "Marta";
        final String PULSERA = "Pulsera Hippy";
        final double PRCIO_HIPPY = 0.7;
        final int PRECIO_DOMINGO = 1;
        
        //variabel
        double comprado = PRECIO_DOMINGO-PRCIO_HIPPY;
        
        
        //mensaje
        System.out.println("Secuencia de Pulsera");
        System.out.println("====================");
        
        System.out.println("Nombre de la niña ...:"+CHICA);
        System.out.printf(Locale.ENGLISH,"Dinero inicial ......: %d€%n",PRECIO_DOMINGO);
        System.out.printf("---%n");
        System.out.println("Precio artículo .....: "+PULSERA);
        System.out.printf(Locale.ENGLISH,"Precio de articulo; %.1f€%n", PRCIO_HIPPY);
        System.out.printf("---%n");
        System.out.printf(Locale.ENGLISH,"Dinero restante..: %.1f€", comprado);
        
        
     
    }
    
    
    
    
}
