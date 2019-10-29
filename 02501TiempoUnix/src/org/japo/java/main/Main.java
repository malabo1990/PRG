/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.main;

import java.util.Date;

/**
 *
 * @author Casimiro Ondo Obiang casimiro.ondo.alum@iescamp.es
 * 
 */
public class Main {
    
    public static final Date d = new Date();
    public static void main(String[] args) {
        //02501TiempoUnix
        //constante y variable
        long tiempo;
        tiempo = d.getTime();

        System.out.printf("Tiempo UNIX .........:%d%n", tiempo);
    }
}
