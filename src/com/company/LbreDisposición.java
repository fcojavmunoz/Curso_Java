package com.company;

import javax.swing.*;
import java.awt.*;

public class LbreDisposición {
    public static void main(String[] args) {
        MarcoLibre mimarco = new MarcoLibre();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
class MarcoLibre extends JFrame {
    public MarcoLibre(){
        setBounds(300,100,600,400);
        setTitle("Disposición LIBRE");
        LaminaLibre milamina = new LaminaLibre();
        add(milamina);
        setVisible(true);
    }
}

class LaminaLibre extends JPanel{
    public LaminaLibre() {
        setLayout(new EnColumnas()); // estamos indicando que tendrá un layout libre.
        // creamos el elemento que queramos colocar
        //JButton boton1 = new JButton("Botón 1");
        //JButton boton2 = new JButton("Botón 2");
        // indicamos dónde queremos colocar el componente (ejes cartesianos).
        // el punto 0,0 está en la esquina superior izquierda de la pantalla.
        //boton1.setBounds(300,160,120,25);
        //boton2.setBounds(300,200,120,25);
        //add(boton1);
        //add(boton2);
        JLabel nombre = new JLabel("Nombre: ");
        JLabel apellido = new JLabel("Apellido: ");
        JLabel edad = new JLabel("Edad: ");
        JLabel telefono = new JLabel("Teléfono: ");
        JTextField c_nombre = new JTextField();
        JTextField c_apellido = new JTextField();
        JTextField c_edad = new JTextField();
        JTextField c_telefono = new JTextField();
        //nombre.setBounds(20,20,80,20);
        //c_nombre.setBounds(100,20,80,20);
        //apellido.setBounds(20,50,80,20);
        //c_apellido.setBounds(100,50,80,20);


        add(nombre);
        add(c_nombre);
        add(apellido);
        add(c_apellido);
        add(edad);
        add(c_edad);
        add(telefono);
        add(c_telefono);

    }
}

class EnColumnas implements LayoutManager {

    @Override
    public void addLayoutComponent(String name, Component comp) {

    }

    @Override
    public void removeLayoutComponent(Component comp) {

    }

    @Override
    public Dimension preferredLayoutSize(Container parent) {
        return null;
    }

    @Override
    public Dimension minimumLayoutSize(Container parent) {
        return null;
    }

    @Override
    public void layoutContainer(Container micontenedor) {
        int contador = 0;
        int d = micontenedor.getWidth();
        x = d/2;
        int n = micontenedor.getComponentCount();

        for (int i = 0; i < n; i++){
            contador++;
            Component c = micontenedor.getComponent(i);
            c.setBounds(x-100,y,100,20);
            x+=100;
            if(contador%2==0){
                x = d/2;
                y += 40;
            }


        }

    }
    private int x;
    private int y = 20;
}
