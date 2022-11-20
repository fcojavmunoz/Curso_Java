package com.MovidasSWIFT;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AreaTexto {
    public static void main(String[] args) {

            MarcoText mimarco = new MarcoText();
            mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
    class MarcoText extends JFrame {
        public MarcoText(){
            
            setBounds(500,300,450,450);
            setTitle("Áreas de Texto I (90)");
            LaminaText milamina = new LaminaText();
            add(milamina);
            setVisible(true);
        }
    }

    class LaminaText extends JPanel{
        public LaminaText(){
            miarea = new JTextArea(8,20);
            JScrollPane laminaBarras = new JScrollPane(miarea);
            miarea.setLineWrap(true);
            add(laminaBarras);
            JButton miboton = new JButton("PULSA");
            miboton.addActionListener(new GestionaArea());
            add(miboton);
        }
        private class GestionaArea implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(miarea.getText());
            }
        }
        private JTextArea miarea;
    }



    /*
    ESTRUCTURA DE CREACIÓN:

    Crear método main.

    Crear la clase marco con su constructor.

    Instanciar en el main la clase marco.

    Crear la clase lámina con su constructor.

    Instanciar y añadir la lámina en la clase marco.

    En el constructor de la lámina instanciamos la clase JTextArea.

    Añadir a la lámina el área de texto.

    Como no nos gusta el comportamiento que tiene por defecto, indicamos
    opciones sobre la escritura: método setLineWrap().

    Para impedir que el cuadro crezca hacia abajo cuando llegamos al final del mismo
    (y para añadirle barras de scroll) hemos de crear una lámina exclusiva para este elemento:
    JScrollPane laminaBarras = new JScrollPane(miarea);

    Se elimina del constructor el área anterior y se añade el area con scroll.

    Instanciamos el método JButton para crear un botón y lo añadimos a la lámina.

    Lo añadimos estando "a la escucha" del evento, con actionListener:

    miboton.addActionListener(new GestionaArea); (instanciamos una clase que hemos de construir).
    add(miboton);
    Creamos la clase interna dentro de la clase lámina, implementando ActionListener.
    Hemos de crear los métodos de la interfaz (podemos indicar para que se creen automáticamente
    vacíos).

    Al método actionPerformed hemos de decirle que rescate el texto del área de texto y lo
    imprima en consola. Hemos de acceder a nuestro objeto área de texto, por lo que creamos
    la variable JTextArea miarea fuera del constructor (aunque la iniciamos dentro del mismo):

    System.out.println(miarea.getText());







     */