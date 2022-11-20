package com.MovidasSWIFT;

import javax.swing.*;
import java.awt.*;

public class JSliderI {
    public static void main(String[] args) {
        MarcoSlider mimarco = new MarcoSlider();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
class MarcoSlider extends JFrame {
    public MarcoSlider(){
        setBounds(300,100,550,450);
        setTitle("JSlider I (96)");
        LaminaSlider milamina = new LaminaSlider();
        add(milamina);
        setVisible(true);
    }
}

class LaminaSlider extends JPanel{
    public LaminaSlider() {
        setLayout(new BorderLayout());
        JSlider control = new JSlider();
        JSlider control2 = new JSlider(0,100,50);
        JSlider control3 = new JSlider(1);
        JSlider control4 = new JSlider(SwingConstants.VERTICAL,0,100,75);
        // Añadimos y mostramos las marcas de tamaño
        control.setMajorTickSpacing(25);
        control.setMinorTickSpacing(5);
        control.setPaintTicks(true);

        // Modificamos la fuente de los números indicadores y los mostramos en pantalla
        control.setFont(new Font("Serif", Font.ITALIC, 12));
        control.setPaintLabels(true);

        // Hacemos que los indicadores actúen como "imán"

        control.setSnapToTicks(true);

        add(control,BorderLayout.NORTH);


        control2.setMajorTickSpacing(25);
        control2.setMinorTickSpacing(5);
        control2.setPaintTicks(true);
        control2.setPaintLabels(true);


        control3.setMajorTickSpacing(25);
        control3.setMinorTickSpacing(5);
        control3.setPaintTicks(true);
        control3.setPaintLabels(true);

        control4.setMajorTickSpacing(25);
        control4.setMinorTickSpacing(5);
        control4.setPaintTicks(true);
        control4.setPaintLabels(true);

        add(control2, BorderLayout.SOUTH);
        add(control3, BorderLayout.EAST);
        add(control4, BorderLayout.WEST);

    }
}

