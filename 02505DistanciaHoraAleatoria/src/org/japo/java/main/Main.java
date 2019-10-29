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
    public static final Random RND = new Random();
    public static void main(String[] args) {
        // TODO code application logic here
        //Ejercicio 02505DistanciaHoraAleatoria
            
        Calendar cal =  Calendar.getInstance();

        // Rótulo
        System.out.println("Distancia ente horas");
        System.out.println("=====================");
        
        // Hora Actual
        int  AHora = cal.get(Calendar.HOUR_OF_DAY);
        int  AMinuto = cal.get(Calendar.MINUTE);
        int  ASegundo = cal.get(Calendar.SECOND);
        
        int Ihora = RND.nextInt(AHora -  0  +  1 ) + 0;
        int Iminuto = RND.nextInt(AMinuto  -  0  +  1 ) +  0;
        int Isegundo = RND.nextInt(ASegundo  -  0  +  1 ) +  0;

        // Tiempos
        int Itiempo = Ihora *  3600  + Iminuto *  60  + Isegundo;
        int Atiempo =  AHora  *  3600  +  AMinuto  *  60  +  ASegundo ;

        // Segundos
        int  SegundosRes  = Atiempo - Itiempo;
        // Minutos
        int  MinutosRes  =  SegundosRes  /  60 ;
        SegundosRes  =  SegundosRes  %  60 ;
        // Horas
        int  HorasRes  =  MinutosRes  /  60 ;
        MinutosRes  =  MinutosRes  %  60 ;

        //Salidas
        System.out.printf("Hora actual ......: %02d/%02d/%02d%n", AHora, AMinuto, ASegundo);
        System.out.printf("Hora inicio ......: %02d/%02d/%02d%n", Ihora, Iminuto, Isegundo);
        System.out.printf("Tiempo de clase ..: %01d/%02d/%02d%n", HorasRes, MinutosRes, SegundosRes);  
    }
    
}
