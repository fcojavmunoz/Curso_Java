package com.PracticasFueradeCurso;

import java.util.Scanner;

public class Ej05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Indica el radio del círculo: ");
        double radio = Double.parseDouble(entrada.nextLine());
        double area = (Math.PI)*(Math.pow(radio,2));
        System.out.println("El área de un círculo de " + radio + " centímetros de radio es " + area);

    }
}
