package com.company;
import javax.swing.*;

public class ForEach {
    public static void main(String[] args) {

        /* String[] paises = new String[8];*/

        /* paises[0]= "España";
        paises[1]= "Méjico";
        paises[2]= "Colombia";
        paises[3]= "Perú";
        paises[4]= "Chile";
        paises[5]= "Argentina";
        paises[6]= "Ecuador";
        paises[7]= "Venezuela";
        */

        /* for(int i = 0; i< paises.length; i++){
            System.out.println("País " + (i+1) + " "+ paises[i]);
        }*/
        // for each

        /*for(String elemento:paises){
            System.out.println("País: " + elemento);*/

        String[] paises = new String[8];

        for (int i = 0; i<8; i++){
            paises[i] = JOptionPane.showInputDialog("Introduce un país " + (i+1));
        }

        for(String elemento:paises) {
            System.out.println("País: " + elemento);
        }
        }
    }
//}
