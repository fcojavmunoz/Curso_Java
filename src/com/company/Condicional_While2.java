package com.company;

import java.util.*;

import static java.lang.Integer.parseInt;

public class Condicional_While2 {
    public static void main(String[] args) {

    int aleatorio = (int)(Math.random()*100);

    Scanner entrada = new Scanner(System.in);
    int numero = 0;
    int intentos = 0;

    while (numero != aleatorio){
        intentos ++;
            System.out.println("Introduce un número: ");
            numero = entrada.nextInt();
            if (aleatorio < numero){
                System.out.println("Más bajo");
            } else if (aleatorio > numero){
                System.out.println("Más alto");
            }
        }
        System.out.println("Correcto. Has necesitado " + intentos + " intentos.");


    }
}
