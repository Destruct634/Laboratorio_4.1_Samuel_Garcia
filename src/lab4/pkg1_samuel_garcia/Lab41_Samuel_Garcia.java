/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4.pkg1_samuel_garcia;

import java.util.Scanner;
import procesos.*;

/**
 *
 * @author poten
 */
public class Lab41_Samuel_Garcia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        String MenuPrincipal= """
                                menu principal
                              1) tragamonedas
                              2) batalla naval
                              3) cofre del tesoro
                              0) salida
                              """;
        
        
        loop: 
        while (true){
            System.out.println(MenuPrincipal);
            System.out.println("que quieres");
            int User= leer.nextInt();
            
            
            if (User==0){ break loop;}
                
            else if (User==1) {
                System.out.println("tragamonedas");
                    
                int fichas = 50;
                System.out.println("fichas actuales:" + fichas);
                ejercicio01.jugar();
                }
                
            else if (User==2){
                    System.out.println("batalla naval");
                    ejercicio02.jugar();
                    
                }
                
            else if (User==3){
                System.out.println("battalla naval");
                
                ejercicio033.jugar();
                }
                
            else{
                    System.out.println("error mal valor");
                }
                
        } 
        System.out.println("sali");
    
    }
    
}
