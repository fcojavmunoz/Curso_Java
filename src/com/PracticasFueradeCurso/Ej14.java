package com.PracticasFueradeCurso;

import java.util.Scanner;

public class Ej14 {
    public static void main(String[] args) {
        // pide y almacena las variables a, b y c por consola
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el valor de la variable a: ");
        double a = entrada.nextDouble();
        if (a==0){
            System.out.println("a no puede ser igual a cero. Indica otro valor.");
            System.out.println("Introduce el valor de la variable a: ");
            a = entrada.nextDouble();
        }
        System.out.println("Introduce el valor de la variable b: ");
        double b = entrada.nextDouble();
        System.out.println("Introduce el valor de la variable c: ");
        double c = entrada.nextDouble();

        double discriminante = Math.pow(b,2)-(4*a*c);
        if (discriminante>0){
            //Tambien se puede hacer por parte si lo ves más facil
            //recuerda que debes tener en cuenta la prioridad de elementos
            double x1=((b*(-1))+Math.sqrt(discriminante))/(2*a);
            double x2=((b*(-1))-Math.sqrt(discriminante))/(2*a);

            System.out.println("El valor de x1 es "+x1+" y el valor de x2 es "+x2);
        }else{
            System.out.println("El discriminante es negativo");
        }


    }
}
