package com.MovidasSWIFT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PruebaArea {
    public static void main(String[] args) {
        MarcoPruebaArea mimarco = new MarcoPruebaArea();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
class MarcoPruebaArea extends JFrame {
    public MarcoPruebaArea(){
        setVisible(true);
        setBounds(500,300,500,350);
        setTitle("Áreas de texto (91)");
        setLayout(new BorderLayout());
        LaminaBotones = new JPanel();
        botonInsertar = new JButton("INSERTAR");
        botonInsertar.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                areaTexto.append("En un lugar de la Mancha de cuyo nombre no quiero acordarme...");

            }
        });
        LaminaBotones.add(botonInsertar);
        botonSaltoLinea = new JButton("SALTO DE LÍNEA");
        botonSaltoLinea.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                boolean saltar =!areaTexto.getLineWrap();
                areaTexto.setLineWrap(saltar);
                if(saltar == true){
                    botonSaltoLinea.setText("Quitar salto");
                }else{
                    botonSaltoLinea.setText("SALTO DE LÍNEA");
                }


            }
        });

        LaminaBotones.add(botonSaltoLinea);
        add(LaminaBotones,BorderLayout.SOUTH);
        areaTexto=new JTextArea(8,20);
        laminaConBarras = new JScrollPane(areaTexto);
        add(laminaConBarras, BorderLayout.CENTER);




    }

    private JPanel LaminaBotones;
    private JButton botonInsertar;
    private JButton botonSaltoLinea;
    private JTextArea areaTexto;
    private JScrollPane laminaConBarras;
}

/*
ESQUEMA DE CREACIÓN (por probar, vamos a hacer el ejercicio dentro de la clase del marco).

Main
Marco. Vamos a crearlo con una disposición BorderLayout para poder añadir
una lámina en la zona center (ton el campo de texto) y una lámina en la zona
SOUTH (con dos botones).
setLayout(new BorderLayout());

Defininimos e iniciamos los paneles: definimos fuera del constructor e iniciamos dentro del mismo.

Definir botones fuera de constructor.
    private JButton botonInsertar;
    private JButton botonSaltoLinea;

Instanciar el botoninsertar en el constructor y ponerlo a la escucha.
    botonInsertar = new JButton("INSERTAR");
    botonInsertar.addActionListener(new ActionListener(){

Creamos el método de la clase addEventListener.
En dicho método, programamos lo que queremos que haga el botón (añadir texto en el area de texto):
    public void actionPerformed(ActionEvent e) {
                    areaTexto.append("En un lugar de la Mancha de cuyo nombre no quiero acordarme.");

                }

Creamos el area de texto fuera del constructor, como el resto de variables:
    private JTextArea areaTexto;

Agregamos el botonInsertar en la parte baja de la lámina:
    LaminaBotones.add(botonInsertar);

Creamos el siguiente botón:
    botonSaltoLinea = new JButton("SALTO DE LÍNEA");

Lo ponemos a la escucha del evento:
    botonSaltoLinea.addActionListener(new ActionListener(){

Ese botón tiene que hacer varias cosas:
Ver si hay saltos de línea en el texto escrito.
Si los hay, quitarlos al pulsar. Si no los hay, ponerlos.
    boolean saltar =!areaTexto.getLineWrap();
    areaTexto.setLineWrap(saltar);
    if(saltar == true){
                    botonSaltoLinea.setText("Quitar salto");
                }else{
                    botonSaltoLinea.setText("SALTO DE LÍNEA");
                }

Hay que añadir las láminas con los botones al marco. (Se declara fuera del constructor).
    LaminaBotones.add(botonSaltoLinea);
    add(LaminaBotones,BorderLayout.SOUTH);

Añadir el área del texto a la zona con scroll y esto, a su vez, en la zona central de la lámina:
        areaTexto=new JTextArea(8,20);
        laminaConBarras = new JScrollPane(areaTexto);
        add(laminaConBarras, BorderLayout.CENTER);








 */
