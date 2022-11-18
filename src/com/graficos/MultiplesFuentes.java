package com.graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

import static javax.swing.text.StyleConstants.setBackground;

public class MultiplesFuentes {
    public static void main(String[] args) {
        MarcoAccion mimarco = new MarcoAccion();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoAccion extends JFrame {
    public MarcoAccion(){
        setVisible(true);
        setTitle("Ejemplo de eventos con múltiples fuentes");
        setBounds(250,50,800,600);
        PanelAccion lamina = new PanelAccion();
        add(lamina);

    }
}

class PanelAccion extends JPanel {
    public PanelAccion(){

        AccionColor accionAmarillo = new AccionColor("Amarillo",Color.YELLOW);
        AccionColor accionRojo = new AccionColor("Rojo",Color.RED);
        AccionColor accionAzul = new AccionColor("Azul",Color.BLUE);

        add(new JButton(accionAmarillo));
        add(new JButton(accionAzul));
        add(new JButton(accionRojo));

        //JButton botonAmarillo = new JButton(accionAmarillo);
        //add(botonAmarillo);

        //JButton botonAmarillo= new JButton("Amarillo");
        //JButton botonRojo= new JButton("Rojo");
        //JButton botonAzul= new JButton("Azul");
        //add(botonAmarillo);
        //add(botonRojo);
        //add(botonAzul);

        InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);

        KeyStroke teclaAmarillo = KeyStroke.getKeyStroke("ctrl A");
        mapaEntrada.put(teclaAmarillo,"fondo_amarillo");
        ActionMap mapaAccion = getActionMap();
        mapaAccion.put("fondo_amarillo", accionAmarillo);

        KeyStroke teclaRojo = KeyStroke.getKeyStroke("ctrl R");
        mapaEntrada.put(teclaRojo, "fondo_rojo");

        mapaAccion.put("fondo_rojo", accionRojo);

        KeyStroke teclaAzul = KeyStroke.getKeyStroke("ctrl B");
        mapaEntrada.put(teclaAzul,"fondo_azul");

        mapaAccion.put("fondo_azul", accionAzul);




    }
    private class AccionColor extends AbstractAction{
        public AccionColor(String nombre, Color color_boton){
            putValue(Action.NAME, nombre);
            //putValue(Action.SMALL_ICON, icono);
            putValue(Action.SHORT_DESCRIPTION, "Poner la lámina de color " + nombre);
            putValue("color_de_fondo", color_boton);

        }

        public void actionPerformed(ActionEvent e) {
            Color c = (Color) getValue("color_de_fondo");
            setBackground(c);
            System.out.println("Nombre: " + getValue(Action.NAME));

        }
    }

}

