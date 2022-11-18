package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    public static void main(String[] args) {
        MarcoCalculadora marco = new MarcoCalculadora();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class MarcoCalculadora extends JFrame {
    public MarcoCalculadora(){
        setVisible(true);
        setTitle("Calculadora –Grid Layout–");
        setBounds(200,100, 450,450);
        LaminaCalculadora lamina = new LaminaCalculadora();
        add(lamina);
        // El marco se adapta al contenido
        // pack();

    }
}

class LaminaCalculadora extends JPanel{
    public LaminaCalculadora(){
        // BorderLayout
        principio = true;
        setLayout(new BorderLayout());
        pantalla = new JButton("0");
        pantalla.setEnabled(false);
        add(pantalla, BorderLayout.NORTH);
        milamina2 = new JPanel();
        milamina2.setLayout(new GridLayout(4,4));
        add(milamina2, BorderLayout.CENTER);
        ultimaOperacion = "=";


        /*
        JButton boton1 = new JButton("1");
        JButton boton2 = new JButton("2");
        JButton boton3 = new JButton("3");
        JButton boton4 = new JButton("4");
        JButton boton5 = new JButton("5");
        JButton boton6 = new JButton("6");
        milamina2.add(boton1);
        milamina2.add(boton2);
        milamina2.add(boton3);
        milamina2.add(boton4);
        milamina2.add(boton5);
        milamina2.add(boton6);
        */

        ActionListener insertar = new InsertaNumero();
        ActionListener order = new AccionOrden();

        ponerBoton("7", insertar);
        ponerBoton("8", insertar);
        ponerBoton("9", insertar);
        ponerBoton("/", order);
        ponerBoton("4", insertar);
        ponerBoton("5", insertar);
        ponerBoton("6", insertar);
        ponerBoton("*", order);
        ponerBoton("1", insertar);
        ponerBoton("2", insertar);
        ponerBoton("3", insertar);
        ponerBoton("-", order);
        ponerBoton("0", insertar);
        ponerBoton(",", insertar);
        ponerBoton("=", order);
        ponerBoton("+", order);

    }
    private void ponerBoton(String rotulo, ActionListener oyente){
        JButton boton = new JButton(rotulo);
        boton.addActionListener(oyente);
        milamina2.add(boton);


    }

    private class InsertaNumero implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String entrada = e.getActionCommand();
            if (principio){
                pantalla.setText("");
                principio = false;
            }
            pantalla.setText(pantalla.getText() + entrada);

        }
    }

    private class AccionOrden implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String operacion = e.getActionCommand();
            calcular(Double.parseDouble(pantalla.getText()));
            ultimaOperacion = operacion;
            principio = true;


        }
        public void calcular(double x){
            if(ultimaOperacion.equals("+")){
                resultado +=x;

            }else if(ultimaOperacion.equals("-")){
                resultado -=x;

            } else if(ultimaOperacion.equals("*")){
                resultado *=x;

            } else if(ultimaOperacion.equals("/")){
                resultado /=x;

            }



        }
    }
    private JPanel milamina2;
    private JButton pantalla;
    private boolean principio;
    private double resultado;
    private String ultimaOperacion;
}

