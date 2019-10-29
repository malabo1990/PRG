/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.main;

import java.util.Calendar;

/**
 *
 * @author Casimiro Ondo Obiang casimiro.ondo.alum@iescamp.es
 */
public class Main {
    public static final Calendar CAL = Calendar.getInstance();
    public static void Main(String[] args) {
        // TODO code application logic here
        // Ejercicio 02503FechaSistema
        int d;
        int m;
        int a;
        //Valores
        d = CAL.get(Calendar.DAY_OF_MONTH);
        m = CAL.get(Calendar.MONTH) + 1;
        a = CAL.get(Calendar.YEAR);
        System.out.println("Fecha del sistema...: "+d+"/"+m+"/"+a);
    }
}
