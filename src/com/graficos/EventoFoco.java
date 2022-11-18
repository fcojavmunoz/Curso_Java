package com.graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class EventoFoco {
    public static void main(String[] args) {
        MarcoFoco mimarco = new MarcoFoco();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class MarcoFoco extends JFrame {
    public MarcoFoco(){
        setVisible(true);
        setName("Evento Foco");
        setBounds(100,100,450,450);
        add(new LaminaFoco());


    }
}

class LaminaFoco extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        setLayout(null);
        cuadro1 = new JTextField();
        cuadro2 = new JTextField();
        cuadro1.setBounds(120,10, 150, 20);
        cuadro2.setBounds(120, 50, 150, 20);
        add(cuadro1);
        add(cuadro2);
        LanzaFocos elfoco = new LanzaFocos();
        cuadro1.addFocusListener(elfoco);
    }

   private class LanzaFocos implements FocusListener{

        @Override
        public void focusGained(FocusEvent e) {

        }

        @Override
        public void focusLost(FocusEvent e) {
            System.out.println("Has perdido el foco");

        }
    }
    JTextField cuadro1;
    JTextField cuadro2;
}

