package com.company;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class EventoTeclado_I {
    public static void main(String[] args) {
        MarcoTeclado eventoTeclado = new MarcoTeclado();
        eventoTeclado.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class MarcoTeclado extends JFrame {
    public MarcoTeclado(){
        setVisible(true);
        setBounds(100,100,400,400);
        setTitle("Eventos con teclado");
        // 3.- Indicamos quién es el oyente
        EventoTeclado tecla = new EventoTeclado();

        // 4.- Ponemos la instancia a la escucha de lo que tiene que pasar
        addKeyListener(tecla);

    }
}

// 1.- Hay que crear un oyente sobreescribiendo los métodos que tenga el KeyListener.


class EventoTeclado implements KeyListener {


    @Override
    public void keyTyped(KeyEvent e) {
        // 2.- Método que queramos implementar
        char codigo = e.getKeyChar();
        System.out.println(codigo);

    }

    @Override
    public void keyPressed(KeyEvent e) {
        // 2.- Método que queramos implementar
       // int codigo = e.getKeyCode();
        //System.out.println(codigo);
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}