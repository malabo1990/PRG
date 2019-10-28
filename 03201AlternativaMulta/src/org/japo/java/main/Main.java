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
 * @author Casimiro Ondo Obiang casimiro.ondo.alum@iescamp.es
 */
public class Main {
    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");
    public static void main(String[] args) {
        //Ejeercicio: 03201 AlternativaMulta
        //Constante
        final double INICIAL_MULTA = 60;
        final int DIAS_DCENTO = 30;
        final double DESCUENTO = 20;
        //Variable
        double testDescuento = 0;
        boolean testOk;
        double ImporteFinal;
        //Importe final
        try {
            //multa 1
            System.out.println("Alternativa de Multa");
            System.out.println("====================");
            System.out.println("Días de demora ...........:");
            int DiasSCN= SCN.nextInt();
            
            testOk = DiasSCN <= DIAS_DCENTO;
            if (testOk){
                    testDescuento = INICIAL_MULTA*DESCUENTO/100;
                            }
            ImporteFinal= INICIAL_MULTA-testDescuento;
           
            System.out.println("---");
            System.out.printf(Locale.ENGLISH,"Importe inicial multa ....: %.2f€%n", INICIAL_MULTA);
            System.out.println("---");
            System.out.printf(Locale.ENGLISH,"Plazo con descuento ......: %d%n ", DIAS_DCENTO);
            System.out.printf(Locale.ENGLISH,"Tanto descuento ..........: %.2f%n", DESCUENTO);
            System.out.printf(Locale.ENGLISH,"Importe descuento ........: %.2f€%n", testDescuento);
            System.out.println("---");
            System.out.printf(Locale.ENGLISH,"Importe final multa ......: %.€%n", ImporteFinal);
            System.out.println("--------------------------------------------------------");
        
        }catch (Exception e) {
            System.out.println("ERROR: Entrada incorrecta");
            
        }finally{
             SCN.nextLine();
        }
    }
}