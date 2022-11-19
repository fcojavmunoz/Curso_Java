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
        setVisible(true);
        setBounds(200,100,300,450);
        setTitle("XXXXXXXXX");
        PlanLamina milamina = new PlanLamina();
        add(milamina);
    }
}

class PlanLamina extends JPanel{
    public PlanLamina() {

    }
}