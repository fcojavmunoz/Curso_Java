package com.company;
import java.util.Scanner;

public class Uso_Tallas2 {
    enum Talla{
        MINI("s"), MEDIANO("m"), GRANDE("l"), MUY_GRANDE("xl");
    // Vamos a usar constructor, setter y getter.

        private Talla(String abreviatura){
            this.abreviatura = abreviatura;
        }
        private String abreviatura;

        public String dame_abreviatura(){
            return abreviatura;
        }




    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe una talla: MINI, MEDIANO, GRANDE, MUY_GRANDE");
        String tallaje = entrada.next().toUpperCase();
        Talla la_talla = Enum.valueOf(Talla.class, tallaje);
        System.out.println(("La talla es " + la_talla));
        System.out.println("La abreviatura es: " +la_talla.dame_abreviatura());

    }
}
