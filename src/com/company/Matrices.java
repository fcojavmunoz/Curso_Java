package com.company;

public class Matrices {
    public static void main(String[] args) {

        /*
        Para almacenar pares de datos relacionados entre sí.

        Declarar un array:

        int[] mi_matriz = new int[10];

        Tipo de dato que almacenará
        []
        Nombre de la matriz
        new
        Tipo de dato
        [Cantidad de datos que tendrá];

        int [] mi_matriz = new int[5];
        mi_matriz[0] = 15;
        mi_matriz[1] = 25;
        mi_matriz[2] = 8;
        mi_matriz[3] = -7;
        mi_matriz[4] = 92;

        También:

        int [] mi_matriz = {15, 25, 8, -7, 92};

        Para recorrer la matriz o para rellenarla de valores, usamos el bucle determinado FOR

         */

        int [] mi_matriz = new int[10];

        mi_matriz[0] = 15;
        mi_matriz[1] = 25;
        mi_matriz[2] = 8;
        mi_matriz[3] = -7;
        mi_matriz[4] = 92;
        mi_matriz[5] = -34;
        mi_matriz[6] = 66;
        mi_matriz[7] = 98;
        mi_matriz[8] = 103;
        mi_matriz[9] = -25;

        for (int i = 0;i<mi_matriz.length;i++){
            System.out.println("Valor " + i + "= " + mi_matriz[i]);
        }


    }
}
