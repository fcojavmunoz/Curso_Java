/*
Pedir dos palabras por teclado, indicar si son iguales.
 */
package com.PracticasFueradeCurso;

import java.util.Scanner;

public class Ej32 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe una palabra");
        String palabra1 = entrada.nextLine();
        System.out.println("Escribe otra palabra");
        String palabra2 = entrada.nextLine();
        if(palabra1.equalsIgnoreCase(palabra2)){
            System.out.println(palabra1 + " y " + palabra2 + " son iguales");
        }else{
            System.out.println(palabra1 + " y " + palabra2 + " NO son iguales");
        }
    }
}
