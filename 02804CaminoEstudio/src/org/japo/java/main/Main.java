/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Casimiro Ondo Obian casimiro.ondo.alum@iescamp.es
 */
public class Main {
     public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");
    public static void main(String[] args) {
        //Constante
        final double Total_Distancia = 980;
        //Mensje
        try {
             System.out.println("km_diario");
        double dias = SCN.nextDouble();
        double Km_diario = Total_Distancia/dias;
        System.out.printf("Dias de Clases/Camino....:%d%n",
        (int) Km_diario < Km_diario ? (int) Km_diario + 1 : (int) Km_diario);         
        } catch (Exception e) {
        System.out.println("ERROR: Entrada incorrecta");
        }
        finally{
            SCN.nextInt();
        }
    }
}
