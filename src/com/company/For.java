package com.company;

import javax.swing.*;

public class For {
    public static void main(String[] args) {

        /*for (int i = 1; i<=10;i++){
            System.out.println( i + " Javier");
        }*/

        int arroba = 0;
        boolean punto = false;

        String mail = JOptionPane.showInputDialog("Introduce tu correo electrónico: ");

        for (int i = 0; i < mail.length();i++){
            if (mail.charAt(i) == '@'){
                arroba ++;
            }
            if (mail.charAt(i) == '.'){
                punto = true;
            }
        }
        if (arroba == 1 && punto == true){
            System.out.println("El mail es correcto.");
        }else{
            System.out.println("NO es correcto");
        }
    }
}
