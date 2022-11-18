package com.POO2;
import javax.swing.*;

public class Uso_Tarjeta {
    public static void main(String[] args) {

        Tarjeta Revolut = new Tarjeta();


        System.out.println(Revolut.dime_medidas());
        Revolut.set_material(JOptionPane.showInputDialog("¿De qué material es la tarjeta?"));
        System.out.println(Revolut.dime_material());
        System.out.println("");
        Revolut.set_numero_tarjeta(JOptionPane.showInputDialog("Indica el número de la tarjeta"));
        System.out.println(Revolut.dime_numero_tarjeta());

    }
}
