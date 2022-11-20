package com.MovidasSWIFT;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JSliderII {
    public static void main(String[] args) {
        MarcoSliderII marco = new MarcoSliderII();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class MarcoSliderII extends JFrame {
    public MarcoSliderII(){
        setTitle("Añadiendo funcionalidades al Slider (97)");
        setBounds(200,100,550,550);
        LaminaSliderII lamina = new LaminaSliderII();
        add(lamina);
        setVisible(true);

    }
}

class LaminaSliderII extends JPanel{
    public LaminaSliderII(){
        setLayout(new BorderLayout());
        rotulo = new JLabel("Añadiendo funcionalidades al Slider.");
        add(rotulo,BorderLayout.CENTER);
        laminaSlider = new JPanel();
        control = new JSlider(8, 50, 12);
        control.setMajorTickSpacing(20);
        control.setMinorTickSpacing(5);
        control.setPaintTicks(true);
        control.setPaintLabels(true);
        control.setSnapToTicks(true);
        control.setFont(new Font("Serif", Font.ITALIC, 10));
        EventoSlider modifica = new EventoSlider();
        control.addChangeListener(modifica);
        laminaSlider.add(control);
        add(laminaSlider, BorderLayout.SOUTH);

    }

    private class EventoSlider implements ChangeListener {


        @Override
        public void stateChanged(ChangeEvent e) {
            rotulo.setFont(new Font("Serif", Font.PLAIN, control.getValue()));

            // System.out.println("Estás modificando el slider:" + control.getValue());
        }
    }
    private JLabel rotulo;
    private JPanel laminaSlider;
    JSlider control;

}