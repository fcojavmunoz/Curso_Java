package com.PracticasFueradeCurso;
import java.util.Scanner;

public class Ej18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        int num1 = entrada.nextInt();
        System.out.println("Introduce otro número entero: ");
        int num2 = entrada.nextInt();

        for (int i = 0;i<10;i++){
            int aleatorio = (int)Math.floor(Math.random()*(num1-num2)+num2);
            System.out.println(aleatorio);
        }

    }
}
