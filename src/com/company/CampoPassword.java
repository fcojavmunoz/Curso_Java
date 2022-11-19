package com.company;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

public class CampoPassword {
    public static void main(String[] args) {
        MarcoPassword mimarco = new MarcoPassword();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
class MarcoPassword extends JFrame {
    public MarcoPassword(){
        setVisible(true);
        setBounds(400,300,550,450);
        setTitle("Ejercicio PASSWORD");
        LaminaPassword milamina = new LaminaPassword();
        add(milamina);
    }
}

class LaminaPassword extends JPanel{
    public LaminaPassword() {
        setLayout(new BorderLayout());
        JPanel laminaSuperior = new JPanel();
        laminaSuperior.setLayout(new GridLayout(2,2));
        add(laminaSuperior, BorderLayout.NORTH);
        JLabel etiqueta1 = new JLabel("Usuario");
        JLabel etiqueta2 = new JLabel("Contraseña");
        JTextField c_usuario = new JTextField(15);
        Comprueba_pass mievento = new Comprueba_pass();
        c_password = new JPasswordField(15);
        c_password.getDocument().addDocumentListener(mievento);
        laminaSuperior.add(etiqueta1);
        laminaSuperior.add(c_usuario);
        laminaSuperior.add(etiqueta2);
        laminaSuperior.add(c_password);
        JButton enviar = new JButton("Comprobar");
        add(enviar,BorderLayout.SOUTH);

    }

    private class Comprueba_pass implements DocumentListener {


        @Override
        public void insertUpdate(DocumentEvent e) {
            char[] contrasena;
            contrasena = c_password.getPassword();
            if (contrasena.length<8 || contrasena.length>12){
                c_password.setBackground(Color.RED);
            }
            else{
                c_password.setBackground(Color.GREEN);
            }
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            char[] contrasena;
            contrasena = c_password.getPassword();
            if (contrasena.length<8 || contrasena.length>12){
                c_password.setBackground(Color.RED);
            }
            else{
                c_password.setBackground(Color.GREEN);
            }

        }

        @Override
        public void changedUpdate(DocumentEvent e) {

        }
    }
    JPasswordField c_password;

}
