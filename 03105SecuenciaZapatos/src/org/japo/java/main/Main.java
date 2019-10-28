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
        //Constante
        final String ANIMAL_VACA = "Vaca";
        final int CANTIDAD_VACA = 3;
        final int pata_vaca = 4;
        final int PATAS_VACA = CANTIDAD_VACA*pata_vaca;
        
        final String  ANIMAL_OVEJA = "Oveja";
        final int CANTIDAD_OVEJA = 14;
        final int pata_oveja = 4;
        final int PATAOVEJA_TOTAL = CANTIDAD_OVEJA*pata_oveja;
        
        final String  ANIMAL_BURRO = "Burro";
        final int CANTIDAD_BURRO = 2;
        final int pata_burro = 4;
        final int PATAS_BURRO = CANTIDAD_BURRO*pata_burro;
        
        final String  ANIMAL_GALLINA = "GALLINA";
        final int CANTIDAD_GALLINA = 18;
        final int pata_gallina = 2;
        final int PATAS_Gallina = CANTIDAD_GALLINA*pata_gallina;
        
        
        //Variabel
        int total_patas=PATAS_BURRO+PATAS_VACA;
         
                
                ;
        double total_pares = total_patas /2;
        
        //Mensaje
        System.out.println("Secuencia de Patas");
        System.out.println("==================");
        
        System.out.println("Animal ........: "+ANIMAL_VACA);
        System.out.println("Cantidad .......: "+CANTIDAD_VACA);
        System.out.println("Patas ..........: "+PATAS_VACA);
        System.out.println("---");
        
        System.out.println("Animal .........: "+ANIMAL_OVEJA);
        System.out.println("Cantidad .......: "+CANTIDAD_OVEJA);
        System.out.println("Patas ..........: "+PATAOVEJA_TOTAL);
        System.out.println("---");
        System.out.println("Animal .........: "+ANIMAL_BURRO);
        System.out.println("Cantidad .......: 2"+CANTIDAD_BURRO);
        System.out.println("Patas ..........: 8"+PATAS_BURRO);
        System.out.println("---");
        System.out.println("Animal .........: "+ANIMAL_GALLINA);
        System.out.println("Cantidad .......: "+CANTIDAD_GALLINA);
        System.out.println("Patas ..........: "+PATAS_Gallina);
        System.out.println("---");
        System.out.println("Total de Patas...: "+total_patas);
        System.out.println("Total de Pares...: "+total_pares);
    
    }
  
        
    
    
}
