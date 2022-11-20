package com.MovidasSWIFT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotonesRadioII {
    public static void main(String[] args) {
        MarcoBotonRadioII mimarco = new MarcoBotonRadioII();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
class MarcoBotonRadioII extends JFrame {
    public MarcoBotonRadioII(){
        setVisible(true);
        setBounds(300,100,550,450);
        setTitle("Botones de Radio (II)");
        LaminaBotonRadioII milamina = new LaminaBotonRadioII();
        add(milamina);
    }
}

class LaminaBotonRadioII extends JPanel{
    public LaminaBotonRadioII() {

        setLayout(new BorderLayout());
        texto = new JLabel("En un lugar de la Mancha, de cuyo nombre...");
        texto.setFont(new Font("Serif", Font.PLAIN, 12));
        add(texto,BorderLayout.CENTER);
        laminaBotones = new JPanel();
        migrupo = new ButtonGroup();
        colocarBotones("Pequeño", false, 10);
        colocarBotones("Mediano", true, 14);
        colocarBotones("Grande", false, 18);
        colocarBotones("Muy grande", false, 24);
        add(laminaBotones, BorderLayout.SOUTH);




    }

    public void colocarBotones(String nombre, boolean seleccionado, final int tamano){
        JRadioButton boton = new JRadioButton(nombre, seleccionado);
        migrupo.add(boton);
        laminaBotones.add(boton);
        ActionListener mievento = new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                texto.setFont(new Font("Serif", Font.PLAIN, tamano));
            }
        };

        boton.addActionListener(mievento);
    }



    private JLabel texto;
    private JRadioButton boton1,boton2,boton3,boton4;
    private ButtonGroup migrupo;
    private JPanel laminaBotones;

}


/*
Este programa tiene las mismas funcionalidades que BotonesRadio.java
PERO con menos código.

ESQUEMA DE CREACIÓN
-------------------
1.- Marco y lámina con disposición BorderLayout.

2.- Añadir el texto con el objeto JLabel y configurar su fuente por defecto:
        texto = new JLabel("En un lugar de la Mancha, de cuyo nombre...");
        texto.setFont(new Font("Serif", Font.PLAIN, 12));
        add(texto,BorderLayout.CENTER);

3.- En las variables de método creo la variable ButtonGroup y la segunda lámina.

4.- Crear un método para que nos ahorre tanto código como en el ejemplo anterior:
    Crea el botón de radio.
    Lo añade al grupo.
    Lo añade a la lámina.
    Lo pone a la escucha.

    public void colocarBotones(String nombre, boolean seleccionado, final int tamano){
        JRadioButton boton = new JRadioButton(nombre, seleccionado);
        migrupo.add(boton);
        laminaBotones.add(boton);
        ActionListener mievento = new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                texto.setFont(new Font("Serif", Font.PLAIN, tamano));
            }
        };

        boton.addActionListener(mievento);


    }


5.- Desde el constructor llamamos al método colocarBotones pasándole los valores que queramos:

        colocarBotones("Pequeño", false, 10);
        colocarBotones("Mediano", true, 14);
        colocarBotones("Grande", false, 18);
        colocarBotones("Muy grande", false, 24);


6.- Agregar la laminaBotones en la zona baja de la lámina principal:
    add(laminaBotones, BorderLayout.SOUTH);

 */


