package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import static javax.swing.text.StyleConstants.setBackground;

/*
Vamos a hacer el mismo ejemplo que en el archivo PruebaBotones.java
PERO lo que va a cambiar de color no es el fondo de la lámina, sino otro objeto.
El planteamiento será crear un objeto "Color de fondo" y que sea ese objeto el
que se vaya modificando.
 */

public class PruebaEventos2 {
    public static void main(String[] args) {
        MarcoBotones2 mimarco2 = new MarcoBotones2();
        mimarco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}

class MarcoBotones2 extends JFrame {
    public MarcoBotones2(){
        setVisible(true);
        setBounds(100,100,600,600);
        setTitle("Eventos y botones");
        LaminaBotones2 milamina2 = new LaminaBotones2();
        add(milamina2);

    }

}
// ELiminamos el implements ActionListener
class LaminaBotones2 extends JPanel  {
    // Creamos el botón
    JButton botonAzul = new JButton("Azul");
    JButton botonAmarillo = new JButton("Amarillo");
    JButton botonRojo = new JButton("Rojo");
    JButton botonVerde = new JButton("Verde");
    JButton botonRosa = new JButton("Rosa");

    public LaminaBotones2(){
        // Añadimos el botón a la lámina
        add(botonAzul);
        add(botonAmarillo);
        add(botonRojo);
        add(botonVerde);
        add(botonRosa);

        ColorFondo Amarillo = new ColorFondo(Color.YELLOW);
        ColorFondo Azul = new ColorFondo(Color.BLUE);
        ColorFondo Rojo = new ColorFondo(Color.RED);
        ColorFondo Verde = new ColorFondo(Color.GREEN);
        ColorFondo Rosa = new ColorFondo(Color.PINK);

        // Eliminamos los this
        botonAzul.addActionListener(Azul);
        botonAmarillo.addActionListener(Amarillo);
        botonRojo.addActionListener(Rojo);
        botonVerde.addActionListener(Verde);
        botonRosa.addActionListener(Rosa);

    }

    private class ColorFondo implements ActionListener{
        public ColorFondo(Color c){
            colordeFondo = c;
        }
        private Color colordeFondo;


        public void actionPerformed(ActionEvent e) {
            setBackground(colordeFondo);

        }
    }

    // Eliminamos también el método ActionEvent
}

