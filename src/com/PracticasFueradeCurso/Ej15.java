package com.PracticasFueradeCurso;
import java.util.Scanner;

public class Ej15 {
    public static void main(String[] args) {
        /*
        Scanner entrada = new Scanner(System.in);

        System.out.println("Indica un número: ");
        double numero = entrada.nextDouble();
        while(numero<=0){
            System.out.println("El número es menor o igual a cero.");
            System.out.println("Debes indicar otro número.");
            numero = entrada.nextDouble();
        }
        System.out.println("El número " + numero + " es mayor que cero.");
         */

        int codigo;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Introduce un numero mayor que 0");
            codigo=sc.nextInt();
        }while(codigo<=0);

        System.out.println(codigo);
    }
}
