package com.MovidasSWIFT;

import javax.swing.*;

public class Prueba_Botones_Radio {
    public static void main(String[] args) {
        MarcoRadio mimarco = new MarcoRadio();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
class MarcoRadio extends JFrame {
    public MarcoRadio(){

        setBounds(300,100,550,450);
        setTitle("Botones de Radio (I)");
        LaminaRadio milamina = new LaminaRadio();
        add(milamina);
        setVisible(true);
    }
}

class LaminaRadio extends JPanel{
    public LaminaRadio() {
        ButtonGroup migrupo1 = new ButtonGroup();
        ButtonGroup migrupo2 = new ButtonGroup();
        JRadioButton boton1 = new JRadioButton("Azul", false);
        JRadioButton boton2 = new JRadioButton("Rojo", true);
        JRadioButton boton3 = new JRadioButton("Verde", false);
        JRadioButton boton4 = new JRadioButton("Sí", false);
        JRadioButton boton5 = new JRadioButton("No", false);
        migrupo1.add(boton1);
        migrupo1.add(boton2);
        migrupo1.add(boton3);
        migrupo2.add(boton4);
        migrupo2.add(boton5);
        add(boton1);
        add(boton2);
        add(boton3);
        add(boton4);
        add(boton5);


    }
    }

