/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.main;


/**
 *
 * @author Casimiro Ondo Obiang Email:malabo1990@gmail.com
 */
import java.util.Locale;
import java.util.Scanner;

public class Main {
        public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");
        public static void main(String[] args) {
        //Constante       
        try {
        System.out.println("Feo");
        System.out.printf("Base de Trangulo es:");
        double base = SCN.nextFloat();
        System.out.printf("Altura de Trangulo es:");
        double altura = SCN.nextFloat();
        double T_area = (base*altura)/2;
        System.out.printf("Area de Trangulo es:"+ T_area);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
