package com.MovidasSWIFT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.BorderLayout.CENTER;

public class PruebaTexto {
    public static void main(String[] args) {
        MarcoTexto mimarco = new MarcoTexto();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class MarcoTexto extends JFrame {
    public MarcoTexto(){
        setVisible(true);
        setBounds(200,100,500,450);
        setTitle("Cuadros de Texto");
        LaminaTexto milamina = new LaminaTexto();
        add(milamina);
    }
}

class LaminaTexto extends JPanel{
    public LaminaTexto() {
        setLayout(new BorderLayout());
        JPanel milamina2 = new JPanel();
        milamina2.setLayout(new FlowLayout());
        resultado = new JLabel("",JLabel.CENTER);
        JLabel texto1 = new JLabel("Correo electrónico: ");
        milamina2.add(texto1);
        // invocamos a los constructores que aparecen en la API Java
        // JTextField campo1 = new JTextField("          Texto por defecto");
        // JTextField campo2 = new JTextField(20);
        campo3 = new JTextField(25);
        // añadimos el campo de texto a la lámina.
        // add(campo1);
        // add(campo2);
        milamina2.add(campo3);
        // System.out.println(campo1.getText().trim()); // el método trim alimina los espacios adicionales

        /* Creamos un botón para que haga lo que indiquemos en el método DameTexto,
        lo ponemos a la escucha co addActionListener,
        lo añadimos a la lámina.
         */
        add(resultado, CENTER);
        JButton miboton = new JButton("Comprobar");
        DameTexto mievento = new DameTexto();
        miboton.addActionListener(mievento);
        milamina2.add(miboton);
        add(milamina2,BorderLayout.NORTH);

    }
    private class DameTexto implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            int correcto = 0;
            String email = campo3.getText().trim();
            for(int i = 0; i < email.length();i++){
                if (email.charAt(i) == '@'){
                    correcto ++;
                }
            }
            if (correcto != 1){
                resultado.setText("INCORRECTO");
            }else{
                resultado.setText("CORRECTO");
            }

        }
    }

    /*
    Para poder usar la variable campo3, la creamos dentro de la clase Lamina.
     */
    private JTextField campo3;
    private JLabel resultado;
}



