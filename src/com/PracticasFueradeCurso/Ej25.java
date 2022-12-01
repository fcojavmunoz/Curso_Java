/*
Crea una aplicación llamada CalculadoraPolacaInversaApp, nos pedirá 2 operandos (int)
y un signo aritmético (String), según este último se realizará la operación correspondiente.
Al final mostrará el resultado en un cuadro de diálogo.

Los signos aritméticos disponibles son:

+: suma los dos operandos.
-: resta los operandos.
*: multiplica los operandos.
/: divide los operandos, este debe dar un resultado con decimales (double)
^:  1º operando como base y 2º como exponente.
%:  módulo, resto de la división entre operando1 y operando2.
 */
package com.PracticasFueradeCurso;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class Ej25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        //no importa que sean int o double
        double operando1;
        double operando2;
        double resultado=0;

        //Nos pide los operandos y el signo de operación
        System.out.println("Escribe el operando 1: ");
        operando1=sc.nextDouble();

        System.out.println("Escribe el código de operación: ");
        String operacion = sc.next();

        System.out.println("Escribe el operando 2: ");
        operando2=sc.nextDouble();

        //Según el código de operación, haremos una u otra acción
        if ("+".equals(operacion)) {
            resultado = operando1 + operando2;
        } else if ("-".equals(operacion)) {
            resultado = operando1 - operando2;
        } else if ("*".equals(operacion)) {
            resultado = operando1 * operando2;
        } else if ("/".equals(operacion)) {
            resultado = operando1 / operando2;
        } else if ("^".equals(operacion)) {
            resultado = (int) Math.pow(operando1, operando2);
        } else if ("%".equals(operacion)) {
            resultado = operando1 % operando2;
        }

        JOptionPane.showMessageDialog(null, operando1+" "+operacion+" "+operando2+" = "+resultado);

    }
}
