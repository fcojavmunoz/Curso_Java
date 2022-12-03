package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tipos_Cuadro_Dialogo {
    public static void main(String[] args) {
        CuadrosDialogo mimarco = new CuadrosDialogo();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
class CuadrosDialogo extends JFrame {
    public CuadrosDialogo(){
        setBounds(300,100,550,450);
        setTitle("Cuadros de diálogo");
        Lamina_Cuadros_Dialogo milamina = new Lamina_Cuadros_Dialogo();
        add(milamina);
        setVisible(true);
    }
}

class Lamina_Cuadros_Dialogo extends JPanel{
    public Lamina_Cuadros_Dialogo() {

        boton1 = new JButton("Boton1");
        boton2 = new JButton("Boton2");
        boton3 = new JButton("Boton3");
        boton4 = new JButton("Boton4");

        boton1.addActionListener(new Accion_botones());
        boton2.addActionListener(new Accion_botones());
        boton3.addActionListener(new Accion_botones());
        boton4.addActionListener(new Accion_botones());

        add(boton1);
        add(boton2);
        add(boton3);
        add(boton4);

    }

    private class Accion_botones implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if(e.getSource()== boton1){
                System.out.println("Has pulsado el botón 1.");
                //JOptionPane.showMessageDialog(Lamina_Cuadros_Dialogo.this, "Has pulsado el botón 1.");
                JOptionPane.showMessageDialog(Lamina_Cuadros_Dialogo.this,"Ejemplo showMessageDialog","Botón 1", 0);
            }else if(e.getSource()== boton2){
                System.out.println("Has pulsado el botón 2.");
                //JOptionPane.showInputDialog(Lamina_Cuadros_Dialogo.this,"Has pulsado el botón 2");
                JOptionPane.showInputDialog(Lamina_Cuadros_Dialogo.this,"Ejemplo showInputDialog", "Introduce datos", 2);
            }else if(e.getSource()== boton3){
                System.out.println("Has pulsado el botón 3.");
                JOptionPane.showConfirmDialog(Lamina_Cuadros_Dialogo.this,"Ejemplo showConfirmDialog","Vamos a confirmar", 0);
            }else if (e.getSource()== boton4){
                System.out.println("Has pulsado el botón 4.");
                JOptionPane.showOptionDialog(Lamina_Cuadros_Dialogo.this, "showOptionDialog","Título (modificable)",1,0,new ImageIcon("out/production/Curso_Java/com/graficos/azul.png"),null,null);
            }
        }

    }
    private JButton boton1, boton2, boton3, boton4;
}


