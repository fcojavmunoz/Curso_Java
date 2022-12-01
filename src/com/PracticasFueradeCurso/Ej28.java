/*
Eliminar los espacios de una frase pasada por consola por el usuario.
 */

package com.PracticasFueradeCurso;

import java.util.Scanner;

public class Ej28 {
    public static void main(String[] args) {
        String noEspacios = "";
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String cadena = entrada.nextLine();

        System.out.println(cadena.replace(" ",""));

        //for(int  i = 0; i<=cadena.length(); i++){
          // noEspacios = cadena.replace(" ","");

        //}
        //System.out.println(noEspacios);
    }
}
