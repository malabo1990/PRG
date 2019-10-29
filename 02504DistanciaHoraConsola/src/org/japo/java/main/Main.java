/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.main;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Main {
     public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");
    public static final Calendar cal = Calendar.getInstance();
    public static void main(String[] args) {
        //02504DistanciaHoraConsola
        int Ihora;
        int Iminuto;
        int Isegundo;

        try {
        System.out.println("Hora inicio ......: ");
        Ihora= SCN.nextInt();
        System.out.println("Minuto inicio ....: ");
        Iminuto= SCN.nextInt();
        System.out.println("Segundo inicio ...: ");
        Isegundo= SCN.nextInt();
        
        //Hora actual
            int Ahora = cal.get(Calendar.HOUR_OF_DAY);
            int Aminuto = cal.get(Calendar.MINUTE);
            int Asegundo = cal.get(Calendar.SECOND);
            
             //tiempos
            int Itiempo = Ihora * 3600 + Iminuto * 60 + Isegundo;
            int Atiempo = Ahora * 3600 + Aminuto * 60 + Asegundo;
            
            //Segundos
             int Segundos = Atiempo - Itiempo;
            //Minutos
             int Minutos = Segundos / 60;
            Segundos = Segundos % 60;
            //Horas
             int Horas = Minutos / 60;
            Minutos = Minutos % 60;
            
            // Salidas
            System.out.printf("Hora actual ......:  %02d/%02d/%02d%n", Ahora, Aminuto, Asegundo);
            System.out.printf("Hora inicio ......: %02d/%02d/%02d%n", Ihora, Iminuto, Isegundo);
            System.out.printf("Tiempo de clase ..: %01d/%02d/%02d%n", Horas, Minutos, Segundos);
            
        
        
        
        
        
        } catch (Exception e) {
            System.out.println("Error....:");
        }
    }
}
