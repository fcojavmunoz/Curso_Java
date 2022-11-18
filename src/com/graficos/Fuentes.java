package com.graficos;

import java.awt.*;
import javax.swing.*;

public class Fuentes {
    public static void main(String[] args) {
        MarcoconFuentes mimarco = new MarcoconFuentes();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}


class MarcoconFuentes extends JFrame{
    public MarcoconFuentes(){
        setTitle("Marco con fuentes");
        setSize(400,400);
        setVisible(true);
        LaminaconFuentes milamina = new LaminaconFuentes();
        add(milamina);

        //Si queremos que todos los elementos de la lámina estén en un mismo color,
        // deberíamos usar aquí el método setForeground

    }
}

class LaminaconFuentes extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        Font mifuente = new Font("Arial",Font.ITALIC, 36);
        Font mifuente2 = new Font("Courier", Font.BOLD, 36);
        g2.setFont(mifuente);
        g2.setColor(Color.RED);
        g2.drawString("Javier", 100, 100);
        g2.setFont(mifuente2);
        g2.setColor(Color.BLUE);
        g2.drawString("Javier", 100,200);
        g2.setFont(new Font("Arial", Font.BOLD, 36));
        g2.setColor(new Color (128,90,50).darker());
        g2.drawString("Curso de Java", 100, 300);


    }
}