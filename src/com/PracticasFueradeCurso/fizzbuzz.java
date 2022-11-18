package com.PracticasFueradeCurso;

import java.util.Scanner;

public class fizzbuzz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el comienzo de la serie: ");
        int numero_inicial = entrada.nextInt();
        System.out.println("Ahora indica el número final de la serie: ");
        int numero_final = entrada.nextInt();

        for (int i = numero_inicial; i <= numero_final; i++){

            if (i==0) {
                System.out.println(i + ": " + i);
            }
            else if(i %3 == 0 && i %5 == 0){
                System.out.println(i + ": fizzbuzz");
            }
            else if (i %3 == 0){
                System.out.println(i + ": fizz");
            }
            else if (i %5 == 0){
                System.out.println(i + ": buzz");
            }
            else{
                System.out.println(i + ": " + i);
            }


        }


    }
}
