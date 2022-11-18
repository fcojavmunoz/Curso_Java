package com.POO;

import javax.swing.*;

public class Uso_Vehiculo {
    public static void main(String[] args) {
        /*
        // Crear objetos = instanciar una clase
        // Clase a la que pertenece el objeto + nombre = new + nombre del objeto();

        // Créame un objeto llamado Renault de la clase Coche, utilizando su método constructor.

        Coche Renault = new Coche();

        // System.out.println("Este coche tiene " + Renault.ruedas+ " ruedas.");

        //Accedemos al largo del coche usando un método Getter:

        System.out.println(Renault.dime_largo());
        System.out.println(Renault.dime_ruedas());
        System.out.println("");


        System.out.println(Renault.dime_datos_generales());
        System.out.println("");
        // Accedemos al Setter.
        Renault.establece_color(JOptionPane.showInputDialog("Dime de qué color quieres el coche"));
        System.out.println(Renault.dime_color());
        System.out.println("");

        Renault.configura_asientos(JOptionPane.showInputDialog("¿Quieres asientos de cuero?"));
        System.out.println(Renault.dime_asientos());
        System.out.println("");

        Renault.configura_climatizador(JOptionPane.showInputDialog("¿Quieres climatizador?"));
        System.out.println(Renault.dime_climatizador());
        System.out.println("");
        System.out.println(Renault.dime_peso_coche());
        System.out.println("");
        System.out.println("El precio final del coche es: " + Renault.dime_precio() + " euros.");

*/

        Coche micoche1 = new Coche();

        micoche1.establece_color("rojo");

        Furgoneta mifurgoneta1 = new Furgoneta(7, 580);
        // métodos heredados
        mifurgoneta1.establece_color("azul");
        mifurgoneta1.configura_asientos("Si");
        mifurgoneta1.configura_climatizador("Si");
        System.out.println(micoche1.dime_datos_generales() + " " + micoche1.dime_color());
        System.out.println("");
        System.out.println(mifurgoneta1.dime_datos_generales() +" "+ mifurgoneta1.dime_color() + ". "+ mifurgoneta1.dime_climatizador() + " "+mifurgoneta1.dime_asientos() + ". " + mifurgoneta1.dime_datos_furgoneta());

        // REGLA PARA ESTABLECER LA HERENCIA:
        /*
        Aplicar la regla "Es un..." al diseño de clases.
        "¿Es la subclase una clase?" "¿Una furgoneta es un coche?" NO. En nuestro ejemplo, está mal diseñado.
        Deberíamos haber creado una clase Vehiculo para programar todas la características de los vehículos.
        Heredando de esta clase vehículo, crear una clase coche donde prograemos las características específicas.
        Y una clase furgoneta, y otra clase moto y otra clase autobús o camión.

         */




    }
}
