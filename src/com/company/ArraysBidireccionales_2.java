package com.company;

public class ArraysBidireccionales_2 {
    public static void main(String[] args) {
        // rellenar la matriz de manera más rápida

        int[][] matriz = {
                {10,18,20,34,55,67,-3},
                {34,23,54,67,76,33,90},
                {7,19,23,44,12,65,89},
                {62,28,53,7,8,91,92},
                {23,4,65,65,32,43,87}
        };

        for(int i = 0 ; i<5;i++){
            System.out.println();
            for (int j = 0;j<7; j++){
                System.out.print(matriz[i][j] + " ");
            }
        }

        System.out.println("");
        System.out.println("");

        // Con bucle for each, for mejorado:

        for(int[]fila:matriz){
            System.out.println();
            for (int z: fila){
                System.out.print(z + " ");
            }
        }
    }
}
