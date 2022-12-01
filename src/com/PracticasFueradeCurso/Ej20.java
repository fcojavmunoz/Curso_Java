/*
Pide un número por teclado e indica si es un número primo o no. Un número primo es
aquel solo puede dividirse entre 1 y sí mismo.
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
Un buen truco para calcular la raíz cuadrada del número e ir comprobando que si es
divisible desde ese número hasta 1.
NOTA: Si se introduce un número menor o igual que 1, directamente es no primo.
 */

package com.PracticasFueradeCurso;

import java.util.Scanner;

public class Ej20 {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        String limite = entrada.nextLine();
        esPrimo(Integer.parseInt(limite));

    }

    private static void esPrimo(int numero){
        int contador = 0;

        if (numero==0 || numero ==1){
            System.out.println(numero + " no es primo");
            contador = 1;
        }else{
            for(int i = 2;i <= numero/2;i++){
                if(numero%i==0){
                    System.out.println(numero + " No es primo.");
                    contador = 1;
                    break;
                }
            }
            if (contador == 0){
                System.out.println(numero + " SÍ es primo.");
            }

        }

    }
}
