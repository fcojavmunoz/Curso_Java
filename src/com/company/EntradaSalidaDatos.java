package com.company;

import java.util.Scanner;
import javax.swing.*;

public class EntradaSalidaDatos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nombre_usuario = entrada.nextLine();
        System.out.println("Introduce tu edad: ");
        int edad_usuario = entrada.nextInt();
        System.out.println("Eres "+nombre_usuario + " y tienes "+ edad_usuario+" años.");
        System.out.println("Gracias por la información.");
        System.out.println("");
        // Capturar datos usando una ventana emergente
        String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
        String edad = JOptionPane.showInputDialog("Introduce tu edad");
        // Para poder operar con la edad hay que pasarlo a int.
        // Se hace usando el método parseInt
        int edad_int = Integer.parseInt(edad);
        System.out.println("Eres "+ nombre + " y tienes "+ edad +" años.");
        System.out.println("El año que viene tendrás " + (edad_int+1) + " años.");
        System.out.println("Gracias por la información.");
        System.out.println("");

        String num1 = JOptionPane.showInputDialog("Intrduce un número");
        double num2 = Double.parseDouble(num1);
        System.out.print("La raiz cuadrada de " + num2 + " es ");
        System.out.printf("%1.2f",Math.sqrt(num2));


    }
}
