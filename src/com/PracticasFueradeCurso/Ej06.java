package com.PracticasFueradeCurso;

import java.util.Scanner;

public class Ej06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        int numero = entrada.nextInt();

        if (numero%2==0){
            System.out.println(numero + " SÍ es divisible entre dos");
        }else{
            System.out.println(numero + " NO es divisible entre dos");
        }


    }
}
