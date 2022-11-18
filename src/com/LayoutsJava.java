package com;

import javax.swing.*;
import java.awt.*;

public class LayoutsJava {
    public static void main(String[] args) {
        Marco_Layout mimarco = new Marco_Layout();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class Marco_Layout extends JFrame {
    public Marco_Layout(){
        setVisible(true);
        setTitle("Pruebas con el Layout");
        setBounds(600,350,600,300);
        Lamina_Layout milamina = new Lamina_Layout();
        // Indicamos aquí la disposición que van a tener los elementos en la lámina.
        // FlowLayout disposicion = new FlowLayout(FlowLayout.CENTER, 75,100); // CENTER es el método por defecto
        // milamina.setLayout(disposicion);

        // También podríamos haberlo instanciado y creado con una sóla línea de código:

        // milamina.setLayout(new FlowLayout(FlowLayout.LEFT));

        add(milamina, BorderLayout.NORTH);
        Lamina_Layout2 milamina2 = new Lamina_Layout2();
        add(milamina2, BorderLayout.SOUTH);

        // ¡Para que aparezcan las dos láminas hay que decirle al marco qué disposición va a tener!
    }

}

class Lamina_Layout extends JPanel {
    public Lamina_Layout(){
        setLayout(new FlowLayout(FlowLayout.LEFT));//, 75, 150));
        // setLayout(new BorderLayout(10,10));
        add(new JButton("Amarillo"));//,BorderLayout.NORTH);
        add(new JButton("Rojo")); //,BorderLayout.SOUTH);
        // add(new JButton("Azul"), BorderLayout.WEST);
        // add(new JButton("Verde"), BorderLayout.EAST);
        // add(new JButton("Negro"), BorderLayout.CENTER);

    }
}

class Lamina_Layout2 extends JPanel{
    public Lamina_Layout2(){
        setLayout(new BorderLayout());
        add(new JButton("Azul"), BorderLayout.WEST);
        add(new JButton("Verde"), BorderLayout.EAST);
        add(new JButton("Negro"), BorderLayout.CENTER);

    }
}