/*
Pedir al usuario que nos escriba frases de forma
infinita hasta que insertemos una cadena vacía.
Mostrar la cadena resultante.
 */
package com.PracticasFueradeCurso;

import java.util.Scanner;



public class Ej29 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe una cadena de texto");
        String texto = entrada.nextLine();
        String cadenaResultante = "";

        //Mientras no este vacío la cadena escrita continúa
        while(!texto.isEmpty()) {

            //Concatenamos el texto
            cadenaResultante += texto + " ";
            // Volvemos a pedir el texto
            System.out.println("Escribe una cadena de texto");
            texto = entrada.nextLine();
        }
        System.out.println(cadenaResultante);

    }


}
