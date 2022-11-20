package com.MovidasSWIFT;

import javax.swing.*;
import java.awt.*;

public class SpinnerI {
    public static void main(String[] args) {
        MarcoSpinnerDos mimarco = new MarcoSpinnerDos();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
class MarcoSpinner extends JFrame {
    public MarcoSpinner(){
        setBounds(300,100,550,450);
        setTitle("JSpinner (98)");
        LaminaSpinnerDos milamina = new LaminaSpinnerDos();
        add(milamina);
        setVisible(true);
    }
}

class LaminaSpiner extends JPanel{
    public LaminaSpiner() {

        String lista[]={"Enero", "Febrero", "Marzo", "Abril"};
        String lista2[]=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

        JSpinner control1 = new JSpinner();
        JSpinner control2 = new JSpinner(new SpinnerDateModel());
        JSpinner control3 = new JSpinner(new SpinnerListModel(lista));
        JSpinner control4 = new JSpinner(new SpinnerListModel(lista2));
        JSpinner control5 = new JSpinner(new SpinnerNumberModel(5, 0, 25, 3));

        Dimension d1 = new Dimension(50,20);
        Dimension d3 = new Dimension(200,20);


        control1.setPreferredSize(d1);
        control5.setPreferredSize(d1);
        control3.setPreferredSize(d3);
        control4.setPreferredSize(d3);


        add(control1);
        add(control2);
        add(control3);
        add(control4);
        add(control5);


    }
}

