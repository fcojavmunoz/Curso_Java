package com.company;

import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.Timer;
import java.awt.Toolkit;

public class PruebaTemporizador2 {
    public static void main(String[] args) {
        Reloj mireloj = new Reloj();
        mireloj.enMarcha(3000,true);
        JOptionPane.showMessageDialog(null,"Pulsa OK para terminar");
        System.exit(0);

    }
}

class Reloj{ // constructor pr defecto, sin parámetros.
    //public Reloj(int intervalo, boolean sonido){
      //  this.intervalo = intervalo;
      //  this.sonido = sonido;
//}

    public void enMarcha(int intervalo, final boolean sonido){

        // CLase interna LOCAL.
        // No debe de llevar ningún modificador de acceso.
        // Para que la clase interna local pueda acceder a una variable interna (sonido, en este caso)
        // esta debe de ser final.

        class DameLaHora2 implements ActionListener{
            public void actionPerformed(ActionEvent evento){
                Date ahora = new Date();
                System.out.println("La hora es " + ahora);
                if (sonido == true){
                    Toolkit.getDefaultToolkit().beep();
                }
            }

        }
        ActionListener oyente = new DameLaHora2();
        Timer mitemporizador = new Timer(intervalo, oyente);
        mitemporizador.start();
    }



    private int intervalo;
    private boolean sonido;

    // Clase interna DameLaHora2. ¡LA HEMOS PASADO A INTERNA LOCAL!
    // Sólo las clases internas pueden tener el modificador de acceso private.




}