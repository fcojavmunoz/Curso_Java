package com.company;

public class ArraysBidireccionales {
    public static void main(String[] args) {
        // Dos corchetes == bidimensionales

        int [][] matrix = new int[4][5];

        matrix[0][0]= 15;
        matrix[0][1]= 10;
        matrix[0][2]= -3;
        matrix[0][3]= 9;
        matrix[0][4]= 32;

        matrix[1][0]= 54;
        matrix[1][1]= 76;
        matrix[1][2]= 54;
        matrix[1][3]= 77;
        matrix[1][4]= 98;

        matrix[2][0]= 1;
        matrix[2][1]= 5;
        matrix[2][2]= -4;
        matrix[2][3]= -7;
        matrix[2][4]= 3;

        matrix[3][0]= 45;
        matrix[3][1]= 6;
        matrix[3][2]= 67;
        matrix[3][3]= 155;
        matrix[3][4]= 125;

        // System.out.println("Valor almacenado en la posición 2, 3 = " + matrix[2][3]);

        for(int i = 0; i < 4 ; i++){
            System.out.println();
            for (int j = 0; j<5;j++){
                System.out.print("El valor de la posición " + i + " y " + j + " es: " + matrix[i][j]);
            }
        }

    }
}
