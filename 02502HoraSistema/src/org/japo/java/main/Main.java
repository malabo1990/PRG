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
    public static void main(String[] args) {
        // TODO code application logic here
        // Ejercicio 02502HoraSistema
        //Constante
        int h;
        int m;
        int s;
        //Variable
        h = CAL.get(Calendar.HOUR_OF_DAY);
        m = CAL.get(Calendar.MINUTE);
        s = CAL.get(Calendar.SECOND);
        //mensaje
        System.out.printf("Hora del sistema ....:%02d:%02d:%02d%n", h, m, s);
    }
}
