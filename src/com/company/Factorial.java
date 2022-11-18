package com.company;

import javax.swing.*;

import static java.lang.Integer.parseInt;

public class Factorial {
    public static void main(String[] args) {

        int factor = 1;
        String entrada = JOptionPane.showInputDialog("¿De qué número quieres calcular el factorial? ");
        int numero = Integer.parseInt(entrada);
        for (int i = numero; i>0; i--){
            factor = factor * i;
        }
        System.out.println(factor);
    }
}
