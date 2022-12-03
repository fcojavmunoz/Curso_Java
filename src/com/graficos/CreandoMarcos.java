package com.graficos;

import javax.swing.*;
import java.awt.*;

public class CreandoMarcos {
    public static void main(String[] args) {
        miMarco marco1 = new miMarco();
        // Hacer visible la ventana

        // También hay que indicar qué hace el programa al cerrarse.
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco1.setVisible(true);

    }
}

class miMarco extends JFrame{
    public miMarco(){
        // Establecemos el tamaño de la ventana.
        //setSize(500,500);
        //setLocation(400,200);
        setBounds(400,200,550,250);
        // setResizable(false);
        // setExtendedState(Frame.MAXIMIZED_BOTH);
        setTitle("Curso JAVA");

    }

}
