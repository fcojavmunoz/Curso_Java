package com.MovidasSWIFT;

import javax.swing.*;

public class Checkbox {
    public static void main(String[] args) {
        MarcoCheckBox mimarco = new MarcoCheckBox();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
class MarcoCheckBox extends JFrame {
    public MarcoCheckBox(){
        setBounds(300,100,550,450);
        setTitle("XXXXXXXXX");
        LaminaCheckBox milamina = new LaminaCheckBox();
        add(milamina);
        setVisible(true);
    }
}

class LaminaCheckBox extends JPanel{
    public LaminaCheckBox() {

    }
}

