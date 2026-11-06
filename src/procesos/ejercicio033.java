/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package procesos;

/**
 *
 * @author poten
 */
import java.util.Scanner;

public class ejercicio033 {
    public static void jugar() {
        Scanner leer = new Scanner(System.in);
        
        int intentos = 0;
        int maxIntentos = 10;
        
        int codigo1 = (int) (Math.random() * 10);
        int codigo2 = (int) (Math.random() * 10);
        int codigo3 = (int) (Math.random() * 10);

        do {
            if (intentos >= maxIntentos) {
                System.out.println("¡Te has quedado sin intentos! El código era: " + codigo1 + codigo2 + codigo3);
                break;
            }

            System.out.println("\nIngrese su codigo de 3 digitos (Intentos restantes: " + (maxIntentos - intentos) + "): ");
            String imput = leer.nextLine();


            if (imput.isBlank()) {
                System.out.println("Error: La entrada no puede estar vacía.");
                continue; // mira si vacio
            }


            if (imput.length() != 3) {
                System.out.println("Error: La entrada tiene que ser de exactamente 3 números.");
                continue; 
            }//son 3 caracteres


            if (!Character.isDigit(imput.charAt(0)) || !Character.isDigit(imput.charAt(1)) || !Character.isDigit(imput.charAt(2))) {
                System.out.println("Error: Todos los caracteres deben ser números positivos.");
                continue;
            } //mira que son digitos

            int u1 = Character.getNumericValue(imput.charAt(0));
            int u2 = Character.getNumericValue(imput.charAt(1));
            int u3 = Character.getNumericValue(imput.charAt(2));

            
            if (u1 == codigo1 && u2 == codigo2 && u3 == codigo3) {
                System.out.println("¡Felicidades! Abriste la caja fuerte.");
                break; 
            } 
            
            intentos++;
            System.out.println("Pistas");

            int pista = 0;
            if (u1 == codigo1) {pista++;}
            if (u2 == codigo2) {pista++;}
            if (u3 == codigo3) {pista++;}
            System.out.println("Números en la posición correcta: " + pista);


            int sumaUsuario = u1 + u2 + u3;
            int sumaAleatoria = codigo1 + codigo2 + codigo3;

            if (sumaAleatoria > sumaUsuario) {
                System.out.println("a suma de tus números es MENOR ");
            } else if (sumaAleatoria < sumaUsuario) {
                System.out.println("La suma de tus números es MAYOR ");
            } else {
                System.out.println("La suma de tus números es IGUAL (eso puede suceder supongo)");
            }

        } while (true);

        leer.close();
    }
}   
