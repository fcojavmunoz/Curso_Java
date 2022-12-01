/*
Recorre el String del ejercicio 22 y transforma cada carácter a su código ASCII.
Muéstralos en línea recta, separados por un espacio entre cada carácter.
 */
package com.PracticasFueradeCurso;

public class Ej24 {
    public static void main(String[] args) {
        String cadena="La lluvia en Sevilla es una maravilla";

        for (int i = 0; i < cadena.length(); i++) {
            System.out.print((int)cadena.charAt(i) + " ");
        }


    }

}


