/*
 * Crea un programa que invierta el orden de una cadena de texto
 * sin usar funciones propias del lenguaje que lo hagan de forma automática.
 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
 */

package com.PracticasFueradeCurso.RetosMoureDev;

import java.util.Scanner;

public class Reto6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce texto: ");
        String textoEntrada = entrada.nextLine();
        System.out.println(invertirCadena(textoEntrada));
    }

    private static String invertirCadena(String cadena) {
        char[] charArray = new char[cadena.length()];
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = cadena.charAt(charArray.length - 1 - i);
        }
        return String.valueOf(charArray);
    }
}
