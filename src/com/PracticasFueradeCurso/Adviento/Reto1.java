/*
Este año los elfos han comprado una máquina que envuelve regalos.
Pero… ¡no viene programada! Necesitamos crear un algoritmo que le ayude en la tarea.

A la máquina se le pasa un array con los regalos. Cada regalo es un string.
Necesitamos que la máquina envuelva cada regalo en papel de regalo y
lo coloque en un array de regalos envueltos.

El papel de regalo es el símbolo * y para envolver un regalo se coloca
el símbolo * de forma que rodee totalmente al string por todos los lados.
Por ejemplo:
/* [
  "*****\\n*cat*\\n*****",
  "******\\n*game*\\n******",
  "*******\\n*socks*\\n*******"
]
Como ves, el papel de regalo envuelve el string.
Por arriba y por abajo, para no dejar ningún hueco,
las esquinas también están cubiertas por el papel de regalo.

Nota: El carácter \n representa un salto de línea.
¡Ojo! Asegúrate que pones el número correcto de * para envolver completamente el string. Pero no demasiados. Sólo los necesarios para cubrir el string.
Ah, y no modifiques (mutes) el array original.
 */

package com.PracticasFueradeCurso.Adviento;

public class Reto1 {
    public static void main(String[] args) {
        String[] gifts = {"Consola", "Gato", "Juego", "Calcetines"};
        /*

        int o = 0;
        int l = gifts[o].length();
        for (int i = 0; i <= l; i++) {
            l = gifts[i].length();

            for (int j = 0; j <= l+1; j++) {
                System.out.print("*");
            }

            System.out.println();
            System.out.print("*" + gifts[i] + "*");
            System.out.println();

            for (i = 0; i<= l+1; i++) {
                System.out.print("*");
                o++;

            }


    }

         */
        int contador = 0;
        for(int i = 0; i<=gifts.length; i++) {
            contador++;
            System.out.println(contador);
            System.out.println(gifts[i]);
        }
}
}

