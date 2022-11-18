package com.graficos;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class EventoRaton {
    public static void main(String[] args) {
        MarcoRaton mimarco = new MarcoRaton();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class MarcoRaton extends JFrame {
    public MarcoRaton() {
        setVisible(true);
        setBounds(200,200,500,350);
        setTitle("Evento ratón");
        EventosRaton escucha = new EventosRaton();
        addMouseListener(escucha);
        addMouseMotionListener(escucha);

    }
}

class EventosRaton extends MouseAdapter implements MouseMotionListener{

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Coordenada X: " + e.getX() + " Coordenada Y: " + e.getY());
        // System.out.println(e.getClickCount());

    }
    public void mousePressed(MouseEvent e) {
        if (e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK){
            System.out.println("Botón izquierdo");
        }
        else if (e.getModifiersEx()==MouseEvent.BUTTON2_DOWN_MASK){
            System.out.println("Botón central");
        }
        else if (e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK){
            System.out.println("Botón derecho");
        }
    }

    public void mouseDragged(MouseEvent e){
        System.out.println("Estás arrastrando algo");

    }
    public void mouseMoved(MouseEvent e){
        System.out.println("Estás moviendo el ratón");

    }

}