package com.PracticasFueradeCurso;
import java.util.Scanner;

public class Ej16 {
    public static void main(String[] args) {
        String password = "ABCde12";
        Scanner entrada = new Scanner(System.in);

        for (int i = 1; i <= 3; i++){
            System.out.println("Introduce tu contraseña: ");
            String contra = entrada.next();
            if (contra.equals(password)) {
                System.out.println("Enhorabuena");
            }else{
                System.out.println("Error. Prueba de nuevo");
            }

        }


    }
}
