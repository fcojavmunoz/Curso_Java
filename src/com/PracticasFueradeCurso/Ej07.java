package com.PracticasFueradeCurso;

import javax.swing.*;

public class Ej07 {
    public static void main(String[] args) {
        String texto= JOptionPane.showInputDialog("Introduce un codigo de la tabla ASCII");
        //Pasamos el String a int
        int codigo=Integer.parseInt(texto);

        //Pasamos el codigo a caracter
        char caracter=(char)codigo;

        System.out.println(caracter);
    }
}
