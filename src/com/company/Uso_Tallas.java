package com.company;

import java.util.Scanner;

public class Uso_Tallas {
    //llamamos a la clase enum
    // enum + nombre de la clase + { + valores que podamos darle a la variable};
    // También podemos crear un constructor y setter y getter. Lo he hecho en el archivo Uso_Tallas2

    enum Talla{MINI, MEDIANO, GRANDE, MUY_GRANDE};

    public static void main(String[] args) {
        // En el objeto s guardamos el valor MINI:

        Talla s = Talla.MINI;
        Talla m = Talla.MEDIANO;
        Talla l = Talla.GRANDE;
        Talla xl = Talla.MUY_GRANDE;

        Scanner entrada = new Scanner(System.in);






        /*
        A veces es necesario crear variables a las que solo queramos dar una serie de valores
        muy concretos. Por ejemplo, a la variable "talla" queremos darle los valores:
        "grande", "mediana", "pequeña", etc... pero no tendría sentido que le diéramos el valor
        "azul". Para esto se usan los tipos enumerados y la clase enum.
        Un método enumerado no puede estar llamado en el main.
         */
    }
}
