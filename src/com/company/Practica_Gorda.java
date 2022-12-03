package com.company;

import javax.swing.*;
import java.awt.*;

public class Practica_Gorda {
    public static void main(String[] args) {
        MarcoDialogos mimarco = new MarcoDialogos();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
class MarcoDialogos extends JFrame {
    public MarcoDialogos(){
        setTitle("Práctica cuadros de diálogo");
        setBounds(100,100,1000,1000);
        LaminaPractica milamina = new LaminaPractica();
        add(milamina);
        setVisible(true);

    }

}

class LaminaPractica extends JPanel {

    public LaminaPractica(){
       setLayout(new BorderLayout());

       // Creamos la lámina para el botón, añadimos el botón
        // y añadimos la lámina del botón a la principal (zona SOUTH).

       LaminaBoton = new JPanel();
       button = new JButton("Mostrar");
       LaminaBoton.add(button);
       add(LaminaBoton,BorderLayout.SOUTH);

        // Creamos la lámina GRID
        LaminaGrid = new JPanel();
        LaminaGrid.setLayout(new GridLayout(2,3));
        // Creamos los botones radio de la primera caja
        ButtonGroup botonesTipo = new ButtonGroup();
        mensaje = new JRadioButton("Pequeño", true);
        confirmar = new JRadioButton("Mediano", false);
        opcion = new JRadioButton("Grande", false);
        entrada = new JRadioButton("Muy grande", false);
        // Hay que ponerlos a la escucha

        // Añadimos botones radio al grupo Tipo de botones.
        botonesTipo.add(mensaje);
        botonesTipo.add(confirmar);
        botonesTipo.add(opcion);
        botonesTipo.add(entrada);

        // Crear botones para grupo Tipo de Mensaje:
        ButtonGroup botonesTipodeMensaje = new ButtonGroup();
        error = new JRadioButton("Mensaje de error", true);
        information = new JRadioButton("Mensaje de información", false);
        warning = new JRadioButton("Mensaje de aviso", false);
        question = new JRadioButton("Mensaje de pregunta", false);
        plain = new JRadioButton("Mensaje plano", false);

        // Creamos la caja Tipo
        Box cajaTipo = Box.createVerticalBox();
        Box cajaTipoMensaje = Box.createVerticalBox();
        Box cajaMensaje = Box.createVerticalBox();
        Box cajaConfirmar = Box.createVerticalBox();
        Box cajaOpcion = Box.createVerticalBox();
        Box cajaEntrada = Box.createVerticalBox();


        // Añadimos los botones a las cajas (Tipo y TipoMensaje).

        cajaTipo.add(mensaje);
        cajaTipo.add(confirmar);
        cajaTipo.add(opcion);
        cajaTipo.add(entrada);
        cajaTipoMensaje.add(error);
        cajaTipoMensaje.add(information);
        cajaTipoMensaje.add(warning);
        cajaTipoMensaje.add(question);
        cajaTipoMensaje.add(plain);

        LaminaGrid.add(cajaTipo, "Tipo");
        LaminaGrid.add(cajaTipoMensaje, "Tipo de Mensaje");
        add(LaminaGrid,BorderLayout.CENTER);

    }
    private JPanel LaminaBoton;
    private JPanel LaminaGrid;
    private JButton button;
    private JRadioButton mensaje, confirmar, opcion, entrada;
    private JRadioButton error, information, warning, question, plain;

}