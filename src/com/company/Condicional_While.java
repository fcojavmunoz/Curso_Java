/*
Bucles indeterminados:

while
do-while

Bucles determinados:

for

for-each
 */

package com.company;

import javax.swing.*;

public class Condicional_While {
    public static void main(String[] args) {

        String clave = "Javier";
        String pass ="";

        while (clave.equals(pass)==false){
            pass=JOptionPane.showInputDialog("Introduce la contraseña.");
            if (clave.equals(pass)==false){
                System.out.println("Contraseña incorrecta.");
            }
        }
        System.out.println("Contraseña correcta. Acceso permitido.");
    }
}
