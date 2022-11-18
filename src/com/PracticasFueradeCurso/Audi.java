package com.PracticasFueradeCurso;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Audi {
    public static void main(String[] args) {
        Marco mimarco = new Marco();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}


class Marco extends JFrame {
    public Marco(){
        setVisible(true);
        setBounds(100,100,600,600);
        Lamina milamina = new Lamina();
        add(milamina);


    }

}

class Lamina extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        Font mifuente = new Font("Arial",Font.ITALIC, 50);
        g2.setFont(mifuente);
        g2.setColor(Color.DARK_GRAY);
        g.drawString("Audi", 200,100);
        g2.setFont(mifuente);
        g2.setColor(Color.BLACK);
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        Ellipse2D.Double hole = new Ellipse2D.Double();
        hole.width = 100;
        hole.height = 100;
        hole.x = 150;
        hole.y = 200;
        g2.draw(hole);
        Ellipse2D.Double hole2 = new Ellipse2D.Double();
        hole2.width = 100;
        hole2.height = 100;
        hole2.x = 220;
        hole2.y = 200;
        g2.draw(hole2);
        Ellipse2D.Double hole3 = new Ellipse2D.Double();
        hole3.width = 100;
        hole3.height = 100;
        hole3.x = 300;
        hole3.y = 200;
        g2.draw(hole3);
        Ellipse2D.Double hole4 = new Ellipse2D.Double();
        hole4.width = 100;
        hole4.height = 100;
        hole4.x = 370;
        hole4.y = 200;
        g2.draw(hole4);


    }
}