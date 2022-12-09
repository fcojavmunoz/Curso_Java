package com.Excepciones;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada_Datos {
    public static void main(String[] args) {
        System.out.println("¿Qué deseas hacer?");
        System.out.println("1.- Introducir datos");
        System.out.println("2.- Salir del programa");

        Scanner entrada = new Scanner(System.in);
        int decision = entrada.nextInt();

        if (decision == 1){
            pedirDatos();
        } else{
            System.out.println("Adiós");
            System.exit(0);
        }
        entrada.close();
    }


    static void pedirDatos() throws InputMismatchException{
        try{
            Scanner entrada = new Scanner(System.in);
            System.out.println("Introduce tu nombre: ");
            String nombre = entrada.nextLine();
            System.out.println("Introduce tu edad: ");
            int edad = entrada.nextInt();
            System.out.println("Hola " + nombre + ". El año que viene tendrás " + (edad+1) + " años");
            entrada.close();
        } catch (Exception e){
            System.out.println("¿Qué dato has introducido en la edad?");
        }
        System.out.println("Hemos terminado");
    }

}
