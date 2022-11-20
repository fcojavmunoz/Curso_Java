package com.MovidasSWIFT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBox {
    public static void main(String[] args) {
        MarcoCombo mimarco = new MarcoCombo();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class MarcoCombo extends JFrame {
    public MarcoCombo(){

        setBounds(300,100,550,450);
        setTitle("ComboBox (95)");
        LaminaCombo milamina = new LaminaCombo();
        add(milamina);
        setVisible(true);
    }
}

class LaminaCombo extends JPanel{
    public LaminaCombo() {
        setLayout(new BorderLayout());
        texto = new JLabel("En un lugar de la Mancha de cuyo nombre...");
        texto.setFont(new Font("Serif", Font.PLAIN, 18));
        add(texto, BorderLayout.CENTER);
        JPanel laminaNorte = new JPanel();
        combo = new JComboBox();
        combo.setEditable(true);
        combo.addItem("Serif");
        combo.addItem("SansSerif");
        combo.addItem("Monospaced");
        combo.addItem("Dialog");
        EventoCombo evento = new EventoCombo();
        combo.addActionListener(evento);
        laminaNorte.add(combo);
        add(laminaNorte, BorderLayout.NORTH);
    }

    private class EventoCombo implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            texto.setFont(new Font((String) combo.getSelectedItem(), Font.PLAIN, 18));
        }
    }

    private JLabel texto;
    private JComboBox combo;
}

