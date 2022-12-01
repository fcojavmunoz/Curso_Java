/*
Crear una aplicación que nos permite insertar
números hasta que insertemos un -1.
Calcular el numero de números introducidos.
 */

package com.PracticasFueradeCurso;

import java.util.Scanner;

public class Ej27 {
    public static void main(String[] args) {
        int contador = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Número: ");
        int num = entrada.nextInt();

        while(num>=0){
            contador ++;
            num = entrada.nextInt();
        }
        System.out.println("Has introducido " + contador + " números positivos.");
    }
}
