package com.Plantillas;

import javax.swing.*;

public class PlantillaMarco {
    public static void main(String[] args) {
        PlanMarco mimarco = new PlanMarco();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
class PlanMarco extends JFrame {
    public PlanMarco(){
        setBounds(300,100,550,450);
        setTitle("XXXXXXXXX");
        PlanLamina milamina = new PlanLamina();
        add(milamina);
        setVisible(true);
    }
}

class PlanLamina extends JPanel{
    public PlanLamina() {

    }
}