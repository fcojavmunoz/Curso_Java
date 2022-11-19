package com.company;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class EventosTexto {
    public static void main(String[] args) {
        MarcoTexto mimarco = new MarcoTexto();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
class MarcoTexto extends JFrame {
    public MarcoTexto(){
        setVisible(true);
        setBounds(500,300,500,450);
        setTitle("Eventos en cuadro de texto");
        LaminaTexto milamina = new LaminaTexto();
        add(milamina);
    }
}

class LaminaTexto extends JPanel{
    public LaminaTexto() {
        JTextField micampo = new JTextField(20);
        EscuchaTexto el_evento = new EscuchaTexto();
        Document midoc = micampo.getDocument();
        midoc.addDocumentListener(el_evento);
        add(micampo);


    }
    private class EscuchaTexto implements DocumentListener{

        @Override
        public void changedUpdate(DocumentEvent e) {

        }

        @Override
        public void insertUpdate(DocumentEvent e) {
            System.out.println("Has insertado texto.");

        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            System.out.println("Has borrado texto.");

        }


    }
}
