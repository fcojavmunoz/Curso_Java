package com.MovidasSWIFT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Checkbox {
    public static void main(String[] args) {
        MarcoCheckBox mimarco = new MarcoCheckBox();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
class MarcoCheckBox extends JFrame {
    public MarcoCheckBox(){
        setBounds(300,100,550,450);
        setTitle("CheckBox (92)");
        LaminaCheckBox milamina = new LaminaCheckBox();
        add(milamina);
        setVisible(true);
    }
}

class LaminaCheckBox extends JPanel{
    public LaminaCheckBox() {
        setLayout(new BorderLayout());
        Font miletra = new Font("Arial",Font.PLAIN, 24);
        texto = new JLabel("Estamos probando los checkbox.");
        texto.setFont(miletra);
        laminaTexto = new JPanel();
        laminaTexto.add(texto);
        add(laminaTexto, BorderLayout.CENTER);

        check1 = new JCheckBox("Negrita");
        check2 = new JCheckBox("Cursiva");

        check1.addActionListener(new ManejaChecks());
        check2.addActionListener(new ManejaChecks());

        laminaCheckBox.add(check1);
        laminaCheckBox.add(check2);
        add(laminaCheckBox, BorderLayout.SOUTH);
    }

    private class ManejaChecks implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
            int tipo = 0;
            if(check1.isSelected()) tipo += Font.BOLD;
            if(check2.isSelected()) tipo +=Font.ITALIC;

            texto.setFont(new Font("Serif", tipo, 24));

        }
    }
    private JPanel laminaTexto;
    private JPanel laminaCheckBox = new JPanel();
    private JLabel texto;
    private JCheckBox check1, check2;


}

