package com.graficos;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class BarraHerramientas {
    public static void main(String[] args) {
        MarcoBarra mimarco = new MarcoBarra();
        mimarco.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}

class MarcoBarra extends JFrame {
    public MarcoBarra(){
        setTitle("Barra de herramientas");
        setBounds(200,100,450,550);
        //LaminaHerramientas milamina = new LaminaHerramientas();
        lamina = new JPanel();
        add(lamina);
        Action accionAzul = new AccionColor("Azul",Color.BLUE);
        Action accionRojo = new AccionColor("Rojo",Color.RED);
        Action accionAmarillo = new AccionColor("Amarillo",Color.YELLOW);
        Action accionSalir = new AbstractAction("Salir") {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        };

        // Construcción de la barra de menú
        JMenu menu = new JMenu("Color");
        menu.add(accionAzul);
        menu.add(accionRojo);
        menu.add(accionAmarillo);
        JMenuBar barraMenus = new JMenuBar();
        barraMenus.add(menu);
        setJMenuBar(barraMenus);

        // Construcción de la barra de herramientas

        JToolBar herramientas = new JToolBar();
        herramientas.add(accionAzul);
        herramientas.add(accionRojo);
        herramientas.add(accionAmarillo);
        herramientas.addSeparator();
        herramientas.add(accionSalir);
        add(herramientas, BorderLayout.NORTH);



        setVisible(true);

    }
    private class AccionColor extends AbstractAction {
        public AccionColor(String nombre, Color c) {
            putValue(Action.NAME, nombre);
            putValue(Action.SHORT_DESCRIPTION, "Color de fondo: "+ nombre);
            putValue("Color", c);

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Color c = (Color) getValue("Color");
            lamina.setBackground(c);
        }

    }
    JPanel lamina;
}

