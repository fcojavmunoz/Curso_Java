package com.MovidasSWIFT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotonesRadio {
    public static void main(String[] args) {
        MarcoBotonRadioII mimarco = new MarcoBotonRadioII();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
class MarcoBotonRadio extends JFrame {
    public MarcoBotonRadio(){
        setVisible(true);
        setBounds(300,100,550,450);
        setTitle("Botones de Radio (II)");
        LaminaBotonRadioII milamina = new LaminaBotonRadioII();
        add(milamina);
    }
}

class LaminaBotonRadio extends JPanel{
    public LaminaBotonRadio() {

        setLayout(new BorderLayout());
        texto = new JLabel("En un lugar de la Mancha, de cuyo nombre...");
        add(texto,BorderLayout.CENTER);
        ButtonGroup migrupo = new ButtonGroup();
        boton1 = new JRadioButton("Pequeño", false);
        boton2 = new JRadioButton("Mediano", true);
        boton3 = new JRadioButton("Grande", false);
        boton4 = new JRadioButton("Muy grande", false);
        JPanel laminaRadio = new JPanel();
        EventoRadio mievento = new EventoRadio();
        boton1.addActionListener(mievento);
        boton2.addActionListener(mievento);
        boton3.addActionListener(mievento);
        boton4.addActionListener(mievento);
        migrupo.add(boton1);
        migrupo.add(boton2);
        migrupo.add(boton3);
        migrupo.add(boton4);
        laminaRadio.add(boton1);
        laminaRadio.add(boton2);
        laminaRadio.add(boton3);
        laminaRadio.add(boton4);
        add(laminaRadio, BorderLayout.SOUTH);



    }

    private class EventoRadio implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            if(e.getSource()==boton1){
                texto.setFont(new Font("Serif", Font.PLAIN, 10));
            }else if(e.getSource()==boton2){
                texto.setFont(new Font("Serif", Font.PLAIN, 13));
            }else if(e.getSource()==boton3){
                texto.setFont(new Font("Serif", Font.PLAIN, 16));
            }else if(e.getSource()==boton4){
                texto.setFont(new Font("Serif", Font.PLAIN, 25));
            }

        }
    }

    private JLabel texto;
    private JRadioButton boton1,boton2,boton3,boton4;

}


/*
ESQUEMA DE CREACIÓN
-------------------
1.- Marco y lámina

2.- Creamos variables en la clase lámina, fuera del constructor.

3.- setLayout Border Layout.

4.- Creamos el objeto JLabel para almacenar el texto y lo agragamos a la zona
central:
        texto = new JLabel("En un lugar de la Mancha, de cuyo nombre...");
        add(texto,BorderLayout.CENTER);

5.- Creamos los botones de radio (como una unidad):
        ButtonGroup migrupo = new ButtonGroup();
        boton1 = new JRadioButton("Pequeño", false);
        boton2 = new JRadioButton("Mediano", true);
        boton3 = new JRadioButton("Grande", false);
        boton4 = new JRadioButton("Muy grande", false);

6.- Agregamos los botones a una segunda lámina que estará incluida en la primera.
        JPanel laminaRadio = new JPanel();
        migrupo.add(boton1);
        migrupo.add(boton2);
        migrupo.add(boton3);
        migrupo.add(boton4);
        laminaRadio.add(boton1);
        laminaRadio.add(boton2);
        laminaRadio.add(boton3);
        laminaRadio.add(boton4);
        add(laminaRadio, BorderLayout.SOUTH);

AGREGAMOS LA FUNCIONALIDAD A LOS BOTONES:
----------------------------------------
7.- Creamos la clase que implementa ActionListener y esta, a su vez, implementa el método
ActionPerformed.

private class EventoRadio implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            if(e.getSource()==boton1){
                System.out.println("Pequeño");
            }

        }
    }
8.- Ponemos el botón a la escucha del evento. PAra ello, instanciamos la clase que hemos creado antes
dándole un nombre y añadimos esta instancia en el método addActionListener(nombre):
        EventoRadio mievento = new EventoRadio();
        boton1.addActionListener(mievento);

9.- En el método ActionPerformed incluimos el código de lo que queremos que haga cada botón:

        if(e.getSource()==boton1){
                    texto.setFont(new Font("Serif", Font.PLAIN, 10));
                }
 */