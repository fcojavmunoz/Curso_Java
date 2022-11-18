
package com.company;

import java.util.Scanner;
import javax.swing.*;

public class Ejercicios {
    public static void main(String[] args) {

       /*  Scanner num = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        int num1 = num.nextInt();
        System.out.println("Introduce otro número entero: ");
        int num2 = num.nextInt();
        if (num1>num2){
            System.out.println(num1 + " es mayor que "+ num2);
        }else if (num2>num1){
            System.out.println(num1 + " es menor que "+ num2);
        }else{
            System.out.println(num1 + " y " + num2 + " son iguales." );
        }

        */

        /*
        String entrada = JOptionPane.showInputDialog("Introduce la medida del radio ");
        double radio = Double.parseDouble(entrada);
        System.out.print("El área de un círculo con un radio de " + radio + " es ");
        System.out.printf("%1.3f",Math.PI*(Math.pow(radio, 2)));
*/
        /* Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número entero ");
        int numero = entrada.nextInt();

        if (numero%2 == 0){
            System.out.println("El número "+ numero + " es par");
        }else{
            System.out.println("El número "+ numero + " es impar");
        } */

        /* int num = 1;
        while (num < 101){
            if (num%2 == 0 || num%3==0){
                System.out.println(num);
            }
            num++;
        }*/

        /* Scanner entrada = new Scanner(System.in);
        System.out.println("¿Cuántos pedidos has tenido hoy? ");
        int ventas = entrada.nextInt();
        int contador = 1;
        double importeTotal = 0;

        while (contador <= ventas){
            System.out.println("Importe de la venta: ");
            int importe = entrada.nextInt();
            importeTotal = importeTotal + importe;
            contador ++;
        }
        System.out.println("Hoy has tenido " + contador + " ventas");
        System.out.println("Has vendido " + importeTotal + " euros.");
        
*/

        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Qué día es hoy? ");
        String dia = entrada.next();

        String mayus = dia.toUpperCase();
        //System.out.println(mayus);

/*

        switch(mayus){
            case LUNES:
            case MARTES:
            case MIÉRCOLES:
            case JUEVES:
            case VIERNES:
                System.out.println("A trabajar");
                break;
            case SÁBADO:
            case DOMINGO:
                System.out.println("Fin de semana");
                break;

        }
*/


    }
}

