package com.PracticasFueradeCurso;

import javax.swing.*;
import java.util.Scanner;

//¡Incluye el ejercicio 4!

public class Ej03 {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
        System.out.println("Hola, "+ nombre);
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String name = sc.nextLine();
        System.out.println("Hola, "+ name);
    }
}
