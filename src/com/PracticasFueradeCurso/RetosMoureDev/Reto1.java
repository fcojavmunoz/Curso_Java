/*
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */

package com.PracticasFueradeCurso.RetosMoureDev;

import java.util.*;

public class Reto1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce una palabra: ");
        String s1 = entrada.nextLine();
        System.out.println("Introduce otra palabra: ");
        String s2 = entrada.nextLine();
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();


        System.out.println(s1);
        System.out.println(s2);
        System.out.println("<----------->");
        if(s1.length() != s2.length()){
            System.out.println("No son anagramas");
        }else{
            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            if(Arrays.equals(c1, c2)){
                System.out.println("ANAGRAMA");
            }else{
                System.out.println("No es anagrama");
            }
        }


    }
}
