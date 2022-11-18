package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class PruebaEventos {
    public static void main(String[] args) {
        MarcoBotones2 mimarco = new MarcoBotones2();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}

class MarcoBotones extends JFrame {
    public MarcoBotones(){
        setVisible(true);
        setBounds(100,100,600,600);
        setTitle("Eventos y botones");
        LaminaBotones2 milamina = new LaminaBotones2();
        add(milamina);

    }

}

class LaminaBotones extends JPanel implements ActionListener {
   // Creamos el botón
    JButton botonAzul = new JButton("Azul");
    JButton botonAmarillo = new JButton("Amarillo");
    JButton botonRojo = new JButton("Rojo");
    JButton botonVerde = new JButton("Verde");
    JButton botonRosa = new JButton("Rosa");

    public LaminaBotones(){
        // Añadimos el botón a la lámina
        add(botonAzul);
        add(botonAmarillo);
        add(botonRojo);
        add(botonVerde);
        add(botonRosa);

        //Decimos que el evento es pulsar el botón.
        botonAzul.addActionListener(this); // Vamos a realizar un evento con el botón azul que afectará a this
                                            // (a la clase en la que estamos)
        botonAmarillo.addActionListener(this);
        botonRojo.addActionListener(this);
        botonVerde.addActionListener(this);
        botonRosa.addActionListener(this);

    }

    // Aquí se programa lo que vaya a ocurrir en el evento

    public void actionPerformed(ActionEvent e) {
        // Este método sería sólo para cuando tengamos un evento
        //setBackground(Color.BLUE);
        // Para cuando tenemos varios eventos hemos de decirle al programa que
        // compruebe qué acción ha de desencadenar.
        // Se hace con el método getSource.

        Object botonPulsado = e.getSource(); // Este método nos dice qué elemento se ha pulsado y se almacena en
                                            // la variable botonPulsado (objeto).
        if (botonPulsado == botonAzul){
            setBackground(Color.BLUE);
        }
        else if (botonPulsado == botonAmarillo){
            setBackground(Color.YELLOW);
        }
        else if(botonPulsado == botonRojo){
            setBackground(Color.RED);
        }
        else if (botonPulsado== botonVerde){
            setBackground(Color.GREEN);
        }
        else if(botonPulsado== botonRosa){
            setBackground(Color.PINK.darker());
        }

    }
}