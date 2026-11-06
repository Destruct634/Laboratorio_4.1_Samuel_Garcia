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
public class ejercicio03 {
    public static void jugar(){
        Scanner leer = new Scanner(System.in);
        
                    int intentos =0;
                    int codigo1 =(int) (Math.random() * 9);
                    int codigo2 =(int) (Math.random() * 9);
                    int codigo3 =(int) (Math.random() * 9);
                    
                    do {
                        if (intentos >10) {
                            break;
                            
                        }//romper loop
                        System.out.println("ingrese su codigo de 3 digitos (Intentos restantes: "+intentos+"): ");
                        String Imput = leer.nextLine();
                    
                        if (Imput.isBlank()) {
                            System.out.println("error: la entrada no puede estar vacia");
                            System.out.println("ingrese su codigo de 3 digitos (Intentos restantes: "+intentos+"): ");
                            Imput = leer.nextLine();
                        } //verifica si es vacio
                        else if(Imput.length()>3 ||Imput.length()<3) {
                            System.out.println("error: la entrada tienen que ser 3 numeros");
                            System.out.println("ingrese su codigo de 3 digitos (Intentos restantes: "+intentos+"): ");
                            Imput = leer.nextLine();
                        } //verifica que sean 3 numeros
                        
                        else {
                            if (Character.isDigit((int)Imput.charAt(0))||Character.isDigit((int)Imput.charAt(1))||Character.isDigit((int)Imput.charAt(2))) {
                                
                                if((int)Imput.charAt(0)==codigo1&&(int)Imput.charAt(1)==codigo2&&(int)Imput.charAt(2)==codigo3){
                                System.out.println("abriste");
                                } // caso lo abre
                                else if ((int)Imput.charAt(0)<0 ||(int)Imput.charAt(1)<0||(int)Imput.charAt(2)<0  ) {
                                    System.out.println("error numro no puede ser negativo");
                                } // si es negativo
                                
                                else{
                                    System.out.println("Pista");
                                    int pista =0;

                                    if ((int)Imput.charAt(0)==codigo1) {
                                        pista ++;
                                    }
                                    if ((int)Imput.charAt(1)==codigo2) {
                                        pista ++;
                                    } // verificar posisciones para pista
                                    if ((int)Imput.charAt(2)==codigo3) {
                                        pista ++;
                                    }

                                    System.out.println("numeros en la posicion correcta = "+pista);

                                    int sumaUsuario= (int)Imput.charAt(0)+(int)Imput.charAt(1)+(int)Imput.charAt(2);
                                    int sumarando = codigo1+codigo2+codigo3;
                                    
                                    if (sumarando> sumaUsuario) {
                                        System.out.println("la suma es menor que el codigo");
                                    }
                                    else if (sumarando<sumaUsuario) {
                                        System.out.println("la suma es mayor que el codigo");    
                                    }
                                    else{
                                        System.out.println("aqui pasa algo ");
                                    }
                                    intentos++;
                                } // normal
                            }
                            else{
                                System.out.println("error");
                           
                            }//error de guardia
                        }        
                    } while (true);
                    
    
    }
}
