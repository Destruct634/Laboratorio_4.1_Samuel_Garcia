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
public class ejercicio01 {
    public static void jugar(){
        int fichas = 50;
        Scanner leer = new Scanner(System.in);
        
        iner:do{
                    System.out.println("deseas girar Y o N");
                    String user = leer.nextLine();
                    

                    if ("Y".equals(user) || "y".equals(user) ) {
                        fichas -=10;
                        
                        int numero1 = (int) (Math.random() * 9);
                        int numero2 = (int) (Math.random() * 9);
                        int numero3 = (int) (Math.random() * 9);
                        
                        System.out.println("["+ numero1+"] ===="+"["+ numero2+"] ===="+"["+ numero3+"] ====");
                        
                        if (numero1== numero2&&numero1==numero3) {
                            System.out.println("yackpot");
                            fichas+=100;
                            
                        } else if (numero1== numero2||numero2==numero3){
                            System.out.println("match");
                            fichas+=50;
                        }
                        else{
                            System.out.println("fail");
                        }
                        
                        
                         
                    }
                    else if ("N".equals(user)|| "n".equals(user) || fichas==0) {
                        System.out.println("salir");
                        break iner;
                    
                    }
                    
                    else{
                        System.out.println("error");
                    }
                    
                }while(true);
    }
    
}
