package com.graficos;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.*;

public class PruebaImagenes {
    public static void main(String[] args) {
        MarcoImagenes marcoconimagenes = new MarcoImagenes();
        marcoconimagenes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class MarcoImagenes extends JFrame{
    public MarcoImagenes(){
        setTitle("Marco con imágenes");
        setBounds(750,300,300,200);
        LaminaImagenes laminaconimagenes = new LaminaImagenes();
        add(laminaconimagenes);
        setVisible(true);
    }
}

class LaminaImagenes extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        File miimagen = new File("Mac/Users/Javier/Desktop/Arnold.png");
        // Capturar una excepción (try catch)
        try {
            imagen = ImageIO.read(miimagen);
        }
        catch(IOException e){
            // System.out.println("La imagen no ha podido encontrarse.");
            super.paintComponent(g);
            g.setColor(Color.RED);
            g.drawString("¡NO SE VE NADA!", 100,100);
        }
        g.drawImage(imagen, 5,5,null);

    }

    private Image imagen;

}