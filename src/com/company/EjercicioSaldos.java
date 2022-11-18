package com.company;

public class EjercicioSaldos {
    public static void main(String[] args) {
        double acumulado;
        double interes = 0.10;

        double [][] saldo = new double[6][5];

        for (int i=0;i<6;i++){
            saldo[i][0]= 10000;
            acumulado = 10000;

            for (int j = 1; j<5 ;j++){ // no necesitamos rellenar la posición [0][0] porque se hizo en el bucle anterior
                                        // en 10000.
                acumulado = acumulado + (acumulado * interes);
                saldo[i][j] = acumulado;
            }

            interes = interes + 0.01;
        }
        for(int z = 0; z<6;z++){
            System.out.println();
            for(int y = 0; y<5;y++){
                System.out.printf("%1.2f",saldo[z][y]);
                System.out.print(" ");
            }
        }



    }
}
