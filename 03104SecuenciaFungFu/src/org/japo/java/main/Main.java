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
        //Constante
        final int INICIAL= 2;
        final double PELICULA = 1.3;
        final double PALOMITAS = 0.45;
        
        //Variable
       double gastos = PELICULA+PALOMITAS;
       double sobra =INICIAL-gastos;
        
        
        //Mensaje
        System.out.println("Secuencia de Kung-Fu");
        System.out.println("====================");
        System.out.printf(Locale.ENGLISH,"Dinero inicial .....: %d€%n",INICIAL);
        System.out.println("---");
        System.out.printf(Locale.ENGLISH,"Precio película ....: %.2f€%n",PELICULA);
        System.out.printf(Locale.ENGLISH,"Parte palomitas ....: %.2f€%n",PALOMITAS);
        System.out.println("---");
        System.out.printf(Locale.ENGLISH,"Gastos por persona .: %.2f€%n",gastos);
        System.out.println("---");
        System.out.printf(Locale.ENGLISH,"Dinero restante ....: %.2f€%n",sobra);
        
    }
    
}
