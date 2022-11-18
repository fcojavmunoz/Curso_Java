package com.PracticasFueradeCurso;

import java.util.Scanner;

public class Ej09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        double numero = entrada.nextDouble();
        double iva_rate = 0.21F;
        double iva = numero * iva_rate;
        System.out.println("Precio producto: " + numero);
        System.out.println("IVA: " + iva);
        System.out.println("Precio final: "  + (numero + iva));

    }
}
