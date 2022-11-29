/*
ÁREA DE UN POLÍGONO
Calcular una función que calcule y retorne el área del polígono que queramos (ha de soportar triángulo,
cuadrado y rectángulo.
 */

package com.PracticasFueradeCurso.RetosMoureDev;

import java.util.Scanner;

public class Reto4 {
    final static int triangulo = 0;
    final static int cuadrado = 1;
    final static int rectangulo = 2;

    public static void main(String[] args) {
        System.out.println(area(triangulo, 5,3));
        System.out.println(area(cuadrado, 4,0));
        System.out.println(area(rectangulo, 5,3));

    }

    public static float area(int poligono, float base, float altura){
        switch(poligono){
            case triangulo:
                return (base * altura)/2;
            case cuadrado:
                return base * base;
            case rectangulo:
                return base * altura;
            default:
                return -1;
        }
    }

}

