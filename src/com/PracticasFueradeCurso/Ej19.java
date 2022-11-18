package com.PracticasFueradeCurso;

import java.util.Scanner;

public class Ej19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número entero");
        int num1 = entrada.nextInt();
        int numDigits = String.valueOf(num1).length();
        System.out.println("El número "+num1 + " tiene " + numDigits + " dígitos");


    }
}
