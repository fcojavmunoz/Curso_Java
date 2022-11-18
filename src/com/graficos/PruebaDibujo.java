package com.graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class PruebaDibujo {
    public static void main(String[] args) {
        MarcoConDibujos mimarco = new MarcoConDibujos();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class MarcoConDibujos extends JFrame{
    public MarcoConDibujos(){
        setTitle("Prueba de dibujo");
        setSize(600, 600);
        setLocation(200, 100);
        setVisible(true);
        LaminaFiguras milamina = new LaminaFiguras();
        add(milamina);
        // Añadimos color al fondo de la lámina:
        // milamina.setBackground(Color.PINK);
        // para que el color de fondo cuadre con el del sistema operativo que quieras.
        milamina.setBackground(SystemColor.window);


    }
}

class LaminaFiguras extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawRect(50,50,200,200);
        g.drawString("¡Ese Swing bueno!", 100, 100);
        g.drawLine(120,120,320,220);
        g.drawArc(50,100,100,200,120,150);

        // Clase Java 2D:
        // Crear objeto del tipo Graphics 2D:

        Graphics2D g2 = (Graphics2D) g;
        // Instanciamos Rectangle2D:

        Rectangle2D rectangulo = new Rectangle2D.Double(200,275,200,150);
        g2.setPaint(Color.RED);
        g2.fill(rectangulo);
        g2.draw(rectangulo);

        // Creando una elipse
        Ellipse2D elipse = new Ellipse2D.Double();
        elipse.setFrame(rectangulo);
        //¿Pinta la elipse?
        // instanciamos el método Color para añadir un color complejo.
        // También podemos usar los métodos brighter() y darker()
        g2.setPaint(new Color(109,172,59).brighter());
        g2.fill(elipse);
        g2.draw(elipse);
        //Pinta la línea?!
        g2.setPaint(Color.PINK);
        //Dibujando una línea directamente denro del método draw.
        g2.draw(new Line2D.Double(200,275, 300, 150));

        double centroX = rectangulo.getCenterX();
        double centroY = rectangulo.getCenterY();
        double radio = 150;
        Ellipse2D circulo = new Ellipse2D.Double();





    }

}
