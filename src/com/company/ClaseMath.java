package com.company;

public class ClaseMath {

    public static void main(String[] args) {
         /*
        Clases propias (creadas por nosotros)
        Clases predefinidas (ya construidas dentro del lenguaje Java)
            String
            Array
            Thread
            Math
            etc...
        Biblioteca de clases: buscar api Java
        Clase Math
            Math.sqrt(n)
            Math.pow(base,exponente)
            Math.sin
            Math.cos
            Math.tan
            Math.atan
            Math.round
            Math.PI
            etc...

         */


        System.out.println(Math.PI);

        double raiz = Math.sqrt(9);
        System.out.println(raiz);

        float num1 = 5.65F;

        int redondeo = Math.round(num1);

        System.out.println(redondeo);

        /* Si no se puede modificar el tipo de variable y tiene que ser alguna no soportada por la función round
        hemos de realizar un proceso que se llama REFUNDICIÓN:

                            int redondeo = (int)Math.round(num1);
         */

        redondeo = (int)Math.round(num1);
        System.out.println(redondeo);

        double base = 5;
        double exponente = 3;
        int elevado = (int)Math.pow(base,exponente);
        System.out.println("El resultado de " + (int)base + " elevado a " + (int)exponente + " es " + elevado);




    }
}


/*
Siguiente vídeo:
https://www.youtube.com/watch?v=tt-4YxLYMjQ&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=12
 */