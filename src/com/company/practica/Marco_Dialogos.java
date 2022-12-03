package com.company.practica;

import javax.swing.*;
import java.awt.*;

public class Marco_Dialogos extends JFrame {
    public Marco_Dialogos(){
        setTitle("Prueba de diálogos");
        setBounds(200,200,600,450);
        JPanel lamina_cuadricula = new JPanel();
        lamina_cuadricula.setLayout(new GridLayout(2,3));
        String primero [] = {"Mensaje", "Confirmar", "Opción", "Entrada"};
        String segundo [] = {"Error Message", "Information Message", "Warning Message", "Question Message","Plain Message"};
        String tercero [] = {"Cadena", "Icono", "Componente", "Otros", "Object[]"};
        String cuarto [] = {"Default option", "Yes-No option", "Yes-No-Cancel option", "OK-Cancel option"};
        String quinto [] = {"String[]", "Icon[]", "Object[]"};
        String sexto [] = {"Campo de texto", "Combo"};
        lamina_tipo = new Lamina_Dialogos("Tipo", primero);
        lamina_tipo_mensaje = new Lamina_Dialogos("Tipo de Mensaje", segundo);
        lamina_mensaje = new Lamina_Dialogos("Mensaje", tercero);
        lamina_confirmar = new Lamina_Dialogos("Confirmar", cuarto);
        lamina_opcion = new Lamina_Dialogos("Opción", quinto);
        lamina_entrada = new Lamina_Dialogos("Entrada", sexto);
        lamina_cuadricula.add(lamina_tipo);
        lamina_cuadricula.add(lamina_tipo_mensaje);
        lamina_cuadricula.add(lamina_mensaje);
        lamina_cuadricula.add(lamina_confirmar);
        lamina_cuadricula.add(lamina_opcion);
        lamina_cuadricula.add(lamina_entrada);
        add(lamina_cuadricula);

        JPanel lamina_boton = new JPanel();
        JButton mostrar = new JButton("Mostrar");
        lamina_boton.add(mostrar);
        add(lamina_boton, BorderLayout.SOUTH);


    }

    private Lamina_Dialogos lamina_tipo, lamina_tipo_mensaje, lamina_mensaje, lamina_confirmar, lamina_opcion, lamina_entrada;
}
