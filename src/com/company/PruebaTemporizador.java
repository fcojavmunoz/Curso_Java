package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;

public class PruebaTemporizador {
    public static void main(String[] args) {

        DameLaHora oyente = new DameLaHora();
        Timer mitemporizador = new Timer(5000, oyente);
        mitemporizador.start();
        JOptionPane.showMessageDialog(null, "Pulsa OK para detener.");
        System.exit(0);
    }
}

class DameLaHora implements ActionListener{
    public void actionPerformed(ActionEvent e){
        Date ahora = new Date();
        System.out.println("La hora cada diez segundos: " + ahora);
        Toolkit.getDefaultToolkit().beep();
    }

}
