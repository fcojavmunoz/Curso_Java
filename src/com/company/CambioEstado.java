package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

public class CambioEstado {
    public static void main(String[] args) {
        MarcoEstado mimarco = new MarcoEstado();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class MarcoEstado extends JFrame {
    public MarcoEstado(){
        setVisible(true);
        setBounds(300,300,500,350);
        setTitle("Cambio de Estado del marco");
        CambiaEstado nuevoEstado = new CambiaEstado();
        addWindowStateListener(nuevoEstado);
    }
}

class CambiaEstado implements WindowStateListener {

   public void windowStateChanged(WindowEvent e) {
       System.out.println("La ventana ha cambiado de estado");
       // System.out.println(e.getNewState());
       if (e.getNewState()==1){
           System.out.println("La ventana se ha minimizado");
       }
       else if (e.getNewState()==Frame.MAXIMIZED_BOTH){
           System.out.println("Pantalla completa");
       }
       else if (e.getNewState()== Frame.NORMAL){
           System.out.println("La ventana se está mostrando");
       }

    }
}