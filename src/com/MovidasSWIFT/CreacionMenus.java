package com.MovidasSWIFT;

import javax.swing.*;
import java.awt.*;

public class CreacionMenus {
    public static void main(String[] args) {
        MarcoMenu mimarco = new MarcoMenu();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
class MarcoMenu extends JFrame {
    public MarcoMenu(){
        setBounds(300,100,550,450);
        setTitle("Creación de menús I (100)");
        LaminaMenu milamina = new LaminaMenu();
        add(milamina);
        setVisible(true);
    }
}

class LaminaMenu extends JPanel{
    public LaminaMenu() {
        setLayout(new BorderLayout());

        // Creamos la barra de menú
        JMenuBar mibarra = new JMenuBar();

        // Creamos los elementos de la barra de menú
        JMenu archivo = new JMenu("Archivo");
        JMenu edicion = new JMenu("Edición");
        JMenu vista = new JMenu("Vista");
        JMenu herramientas = new JMenu("Herramientas");

        // Creamos las opciones que van en cada elemento

        JMenuItem nuevo = new JMenuItem("Nuevo");
        JMenuItem abrir = new JMenuItem("Abrir");
        JMenuItem abrir_reciente = new JMenuItem("Abrir reciente");
        JMenuItem cerrar = new JMenuItem("Cerrar proyecto");
        JMenuItem copiar = new JMenuItem("Copiar");
        JMenuItem cortar = new JMenuItem("Cortar");
        JMenuItem pegar = new JMenuItem("Pegar");
        JMenuItem deshacer = new JMenuItem("Deshacer");
        JMenuItem herramientasWindow = new JMenuItem("Herramientas de ventana");
        JMenuItem apariencia = new JMenuItem("Apariencia");
        JMenuItem refactor = new JMenuItem("Refactorizar");

        // Agregar submenús (¡funcionan como nuevos menús!)

        JMenu opciones = new JMenu("Opciones");
        JMenuItem opcion1 = new JMenuItem("Opción 1");
        JMenuItem opcion2 = new JMenuItem("Opción 2");

        // Agregamos este nuevo submenú a opciones:

        opciones.add(opcion1);
        opciones.add(opcion2);

        // Añadimos las opciones a su elemento
        archivo.add(nuevo);
        archivo.add(abrir);
        archivo.add(abrir_reciente);
        archivo.add(cerrar);
        edicion.add(copiar);
        edicion.add(cortar);
        edicion.add(pegar);
        // Añadimos un separador
        edicion.addSeparator();
        edicion.add(deshacer);

        // Agregamos opciones al menú edición
        edicion.add(opciones);

        vista.add(apariencia);
        herramientas.add(herramientasWindow);
        herramientas.add(refactor);


        // Agregamos los elementos de menú a la barra
        mibarra.add(archivo);
        mibarra.add(edicion);
        mibarra.add(vista);
        mibarra.add(herramientas);

        // Agregamos la barra
        add(mibarra, BorderLayout.NORTH);

    }
}
