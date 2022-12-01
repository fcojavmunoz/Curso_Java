/*
Del siguiente String «La lluvia en Sevilla es una maravilla» cuenta
cuántas vocales hay en total (recorre el String con charAt).
 */
package com.PracticasFueradeCurso;


public class Ej22 {
    public static void main(String[] args) {

        String cadena="La lluvia en Sevilla es una maravilla";

        int contador=0;
        String cadena_Minus = cadena.toLowerCase();
        for (int i=0;i<cadena.length();i++){
            //Comprobamos si el carácter es una vocal
            if(cadena_Minus.charAt(i)=='a' ||
                    cadena_Minus.charAt(i)=='e' ||
                    cadena_Minus.charAt(i)=='i' ||
                    cadena_Minus.charAt(i)=='o' ||
                    cadena_Minus.charAt(i)=='u'){
                contador++;
            }
        }

        System.out.println("Hay "+contador+" vocales");
    }
}


