/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Random;

/**
 *
 * @author Casimiro Ondo Obiang
 */
public class Main {
    public static void main(String[] args) {
        //nombre constante
        final String P_encargada  = "Jaimito";
        final String A_encargada  = "Patatas";
        final String O_encargada = "Piruleta";
        //kilo
        final int kilo_total = 3;
        //Precio
        final double precio_patata = 0.3 ;
        final double precio_Piruleta = 0.2;
        final int PRECIO_INICIAL = 1;
        //Pregunta
        double vuelta= PRECIO_INICIAL-precio_Piruleta;
        int Kilo_comprado = (int) (vuelta / precio_patata);
        System.out.println("Ecuencia de patatas");
        System.out.printf("====================%n");
        System.out.println("Persona encargada .....: "+P_encargada);
        System.out.println("Artículo encargado ....: "+A_encargada);
        System.out.printf("Cantidad encargada ....:%d%n", kilo_total);
        System.out.println("---");
        System.out.printf(Locale.ENGLISH,"Precio encargo ........: %.2f€/kg%n",precio_patata);
        System.out.printf(Locale.ENGLISH,"Dinero suministrado ...: %d%n€", PRECIO_INICIAL);
        System.out.println("---");
        System.out.println("Artículo imprevisto ...: "+O_encargada);
        System.out.printf(Locale.ENGLISH,"Precio imprevisto .....: %.2f€%n", precio_Piruleta);
        System.out.println("---");
        System.out.printf("Cantidad comprada .....: %dkg%n",Kilo_comprado);
        System.out.printf(Locale.ENGLISH,"Dinero devuelto .......: %.2f€", vuelta);
    }
    
    
   
    
}
