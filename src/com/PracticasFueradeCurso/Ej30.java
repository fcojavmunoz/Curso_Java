/*
Convertir una frase a mayúsculas o minúsculas,
que daremos opción a que el usuario lo pida y
mostraremos el resultado por pantalla.
 */
package com.PracticasFueradeCurso;

import javax.swing.*;
import java.util.Scanner;

public class Ej30 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe una frase");
        String cadena = entrada.nextLine();

        System.out.println("Indica si quieres pasarla a mayúsculas (M) o a minúsculas (m)");
        String opcion = entrada.nextLine();

        if(opcion.equals("M")){
            System.out.println(cadena.toUpperCase());
        } else if (opcion.equals("m")){
            System.out.println(cadena.toLowerCase());
        } else{
            System.out.println("Esa opción no es correcta.");
        }

    }

}
