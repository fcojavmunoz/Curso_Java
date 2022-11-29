/*
LA SUCESIÓN DE FIBONACCI
 Escribe un programa que imprima los 50 primeros números de la serie de Fibonacci
 empezando en 0.
 0,1,1,2,3,5,8,13...
 */


package com.PracticasFueradeCurso.RetosMoureDev;

public class Reto2 {
    public static void main(String[] args) {
        long a = 0;
        long b = 1;
        long c = a + b;
        System.out.println(a);
        System.out.println(b);
        for (int i = 0;i<=50; i++){
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}
