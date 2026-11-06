/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package procesos;

import java.util.Scanner;

/**
 *
 * @author poten
 */
public class ejercicio02 {
    public static void jugar(){
        Scanner leer = new Scanner(System.in);
        int posicionBarco = (int) (Math.random() * 10);
        System.out.println(posicionBarco);
        int intento=0;
        
        while(intento<5){
            System.out.println("adivina donde esta el barco (1-10)");
            System.out.println("agua: ----------------");
            int input = leer.nextInt();
            
            if (input>10 || input<1) {
                System.out.println("error mal numero");
            } else {
                if (input==posicionBarco) {
                    System.out.println("barco undido");
                    break;
                } else {
                    System.out.println("impacto al agua");
                    intento++;
                }
            }
            
            
            
            
            
        
        
        }
        
        
    
    }
}
