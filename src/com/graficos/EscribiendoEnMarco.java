package com.graficos;

import javax.swing.*;
import java.awt.*;

public class EscribiendoEnMarco {
    public static void main(String[] args) {
        MarcoTexto mimarco = new MarcoTexto();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MarcoTexto extends JFrame{
    public MarcoTexto(){
        setVisible(true);
        setSize(600,450);
        setLocation(400, 200);
        setTitle("Ventana con texto");
        // Agregamos la lámina que hemos creado
        Lamina milamina = new Lamina();
        add(milamina);
    }
}

// Vamos a crear una lámina transparente por encima para poner incluir el texto:

class Lamina extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        Font mifuente = new Font("Arial",Font.ITALIC, 36);
        g.drawString("Audi", 100,100);

    }
}