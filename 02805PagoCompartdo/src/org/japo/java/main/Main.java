
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author User Casimiro Ondo Obiang
 */
public class Main {
     public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");
    public static void main(String[] args) {
        
        double persona;
        double cena = 123.4;
        System.out.println("Improte cena (€): "+cena);
        System.out.println("Numero comensales: ");
        persona = SCN.nextDouble();
        double pago = cena/persona;
        System.out.println("Pago por comensal: "+pago+"€");
               
    }

}
