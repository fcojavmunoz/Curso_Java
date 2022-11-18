package com.graficos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Multiples_Oyentes {
    public static void main(String[] args) {
        Marco_Multiples marco = new Marco_Multiples();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class Marco_Multiples extends JFrame {
    public Marco_Multiples(){
        setVisible(true);
        setTitle("Ejemplo con múltiples oyentes");
        setBounds(200,100,500,300);
        Lamina_Multiples lamina = new Lamina_Multiples();
        add(lamina);

    }
}

class Lamina_Multiples extends JPanel{
    public Lamina_Multiples(){
        JButton nuevo = new JButton("Nueva ventana");
        add(nuevo);
        cerrar = new JButton("Cerrar todo");
        add(cerrar);
        OyenteNuevo miOyente = new OyenteNuevo();
        nuevo.addActionListener(miOyente);
    }
    private class OyenteNuevo implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Marco_Emergente ventana = new Marco_Emergente(cerrar);

        }
    }
    JButton cerrar;
}

class Marco_Emergente extends JFrame{
    public Marco_Emergente(JButton boton_principal){
        contador++;
        setTitle("Ventana emergente " + contador);
        setBounds(40*contador,40*contador, 300,150);
        setVisible(true);
        CierraTodos oyenteCerrar = new CierraTodos();
        boton_principal.addActionListener(oyenteCerrar);

    }

    private class CierraTodos implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            dispose();

        }
    }
    private static int contador=0;
}