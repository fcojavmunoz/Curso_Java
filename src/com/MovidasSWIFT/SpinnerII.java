package com.MovidasSWIFT;

import javax.swing.*;
import java.awt.*;

public class SpinnerII {
    public static void main(String[] args) {
        MarcoSpinnerDos mimarco = new MarcoSpinnerDos();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
class MarcoSpinnerDos extends JFrame {
    public MarcoSpinnerDos(){
        setBounds(300,100,550,450);
        setTitle("JSpinner (99)");
        LaminaSpinnerDos milamina = new LaminaSpinnerDos();
        add(milamina);
        setVisible(true);
    }
}

class LaminaSpinnerDos extends JPanel{
    public LaminaSpinnerDos() {

        JSpinner control = new JSpinner(new MiModeloJSpinner());
        JSpinner control2 = new JSpinner(new SpinnerNumberModel(5,0,10,1){
            public Object getNextValue(){
                return super.getPreviousValue();
            }
            public Object getPreviousValue(){
                return super.getNextValue();
            }

        });
        Dimension d1 = new Dimension(50,20);
        control.setPreferredSize(d1);
        add(control);
        add(control2);


    }
    private class MiModeloJSpinner extends SpinnerNumberModel{
        public MiModeloJSpinner(){
            super(5,0,10,1);
        }
        // Vamos a cambiar los botones: que el de arriba nos dé un valor menor y viceversa.
        public Object getNextValue(){
            return super.getPreviousValue();
        }
        public Object getPreviousValue(){
            return super.getNextValue();
        }

    }
}


/*
Clases internas anónimas:
Se utilizan mucho para simplificar código y para facilitar eventos.

En vez de crear una nueva private class, creamos el código dentro de la instancia al método que estemos llamando:

JSpinner control2 = new JSpinner(new SpinnerNumberModel(5,0,10,1){
            public Object getNextValue(){
                return super.getPreviousValue();
            }
            public Object getPreviousValue(){
                return super.getNextValue();
            }

        });


 */