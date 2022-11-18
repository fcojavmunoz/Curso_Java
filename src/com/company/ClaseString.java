package com.company;

public class ClaseString {
    public static void main(String[] args) {
        /* Para almacenar una cadena de caracteres:

        TIPO DE DATO + NOMBRE DE LA VARIABLE = VALOR;

        El nombre de la variable ES UN OBJETO DE LA CLASE SCRIPT.

        Más usados:

        .lenght()
        .charAt(n)
        .substring(x,y) x = carácter en el que empieza a extraer. y = carácter en el que acaba de extraer (no incluido).
        .equals(cadena)
        .equalIgnoreCase(Cadena)

         */

        String nombre = "Sebastopol";
        int longitud = nombre.length();
        System.out.println("Mi nombre es "+ nombre + ", tiene " + longitud + " letras y empieza con la letra " + nombre.charAt(0) + ".");
        System.out.println(longitud);
        System.out.println(nombre.charAt(1));
        int ultima_letra;
        ultima_letra = nombre.length();
        System.out.println("Mi nombre acaba con la letra " + nombre.charAt(ultima_letra-1));
        System.out.println("");
        String texto ="Expresión y comprensión escrita - El texto: definición y propiedadesUnidad de Producción de Contenidos Académicos (UPCA)";
        String seleccionado = texto.substring(2,12);
        System.out.println(seleccionado);
        String mayusculas = seleccionado.toUpperCase();
        System.out.println(mayusculas);
        System.out.println(seleccionado.equals(mayusculas));
        System.out.println(seleccionado.equalsIgnoreCase(mayusculas));




    }
}
