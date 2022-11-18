
package com.company;
import java.util.*;

public class Condicionales {
    public static void main(String[] args) {

        /*

        En Java hay dos estructuras para controlar y modificar el flujo de ejecución:

        1) Condicional: Saltar código.
            If (condición){
                Código a ejecutar si la condición es true
                }
            Se puede acompañar de else.

            Switch (valor a evaluar){
                Case valor I:
                    Código a ejecutar
                    break
                Case valor II:
                    Código a ejecutar
                    break

                }
                Se puede acompañar de default.

        2) Bucles: Repetir código (Para otro tema)

         */

     Scanner entrada = new Scanner(System.in);
     System.out.println("Introduce tu edad: ");
     int edad = entrada.nextInt();

     /* if (edad >= 18){
         System.out.println("Eres mayor de edad.");
        } else{
         System.out.println("Eres menor de edad");
     }
    */

    if (edad < 18){
        System.out.println("Eres un adolescente");
    }else if (edad < 40){
        System.out.println("Eres joven");

        }else if (edad < 65){
        System.out.println("Tienes que empezar a cuidarte");

        } else{
        System.out.println("¡Vaya viejales!");
    }

    }
}
