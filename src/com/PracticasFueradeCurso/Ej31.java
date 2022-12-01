/*
Mostrar la longitud de una cadena.
 */

package com.PracticasFueradeCurso;

import java.util.Scanner;

public class Ej31 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe un texto");
        String texto = entrada.nextLine();

        System.out.println("El texto tiene "+ texto.length() + " caracteres.");
    }

}
