package com.PracticasFueradeCurso;

import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Indica el número de ventas de hoy: ");
        int ventas = entrada.nextInt();

        int importe = 0;
        int importeTotal= 0;
        for(int i=1;i<=ventas;i++){
            System.out.println("Indica importe de la venta " + i + " : ");
            importe = entrada.nextInt();
            importeTotal = importeTotal + importe;
        }
        System.out.println("Hoy has tenido "+ ventas+ " pedidos.");
        System.out.println("El importe total han sido "+ importeTotal+ " euros.");
        System.out.println("La media de cada pedido es de  "+ importeTotal/ventas + " euros.");
    }
}
