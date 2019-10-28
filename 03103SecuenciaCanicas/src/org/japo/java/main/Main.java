/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.main;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        
        //Cosntranste
        final String NOMBRE_CANICA= "Ruperta";
        final int INICIAL = 5;
        final int FINAL = 1;
        
        //Variable
        int perdido = INICIAL-FINAL;
      
        //mensaje
        
        System.out.println("Secuencia de Canicas");
        System.out.println("====================");
        System.out.println("Nombre de la canica ........: "+NOMBRE_CANICA);
        System.out.println("---");
        System.out.println("Número de canicas inicial ..: "+INICIAL);
       
        System.out.println("Número de canicas final ....: "+FINAL);
        System.out.println("---");
        System.out.println("Número de canicas perdidas .: "+perdido);
        
    }
}
