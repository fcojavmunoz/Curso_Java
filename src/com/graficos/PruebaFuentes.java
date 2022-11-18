package com.graficos;
// Para ver todos los tipos de fuentes instalados en mi ordenador

import java.awt.*;
import javax.swing.*;

public class PruebaFuentes {

    public static void main(String[] args) {
        String fuente = JOptionPane.showInputDialog("Introduce Fuente: ");
        boolean estalaFuente = false;
        String[] nombresFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for (String nombrefuente: nombresFuentes){
            if (nombrefuente.equalsIgnoreCase(fuente)){
                estalaFuente = true;
            }
        }
        if (estalaFuente){
            System.out.println(fuente + " está instalada.");
        }else{
            System.out.println(fuente + " NO ESTÁ INSTALADA");
        }

    }

}
