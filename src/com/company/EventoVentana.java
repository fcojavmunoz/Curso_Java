package com.company;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class EventoVentana {
    public static void main(String[] args) {
        MarcoVentana4 eventoventana1 = new MarcoVentana4();
        eventoventana1.setTitle("Ventana 1");
        eventoventana1.setBounds(100,200,400,400);
        eventoventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MarcoVentana4 eventoventana2 = new MarcoVentana4();
        eventoventana2.setTitle("Ventana 2");
        eventoventana2.setBounds(700,300,200,200);
        eventoventana2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }
}
class MarcoVentana extends JFrame {
    public MarcoVentana(){
        setVisible(true);
        // setTitle("Evento Ventana");
        // setBounds(100,200,400,400);
        M_Ventana4 oyenteVentana= new M_Ventana4();
        addWindowListener(oyenteVentana);


    }

}

class M_Ventana implements WindowListener{

    @Override
    public void windowOpened(WindowEvent e) {}

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("La ventana se está cerrando");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Ventana cerrada");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Ventana minimizada");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Ventana en pantalla");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Ventana activada");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {}
}

