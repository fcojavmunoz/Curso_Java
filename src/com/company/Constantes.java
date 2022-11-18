package com.company;

public class Constantes {

    public static void main(String[] args) {
        // Creamos los objetos
        Empleados trabajador1 = new Empleados("Paco");
        Empleados trabajador2 = new Empleados("Javier");
        Empleados trabajador3 = new Empleados("Carlos");
        Empleados trabajador4 = new Empleados("Cafelito");

        trabajador1.cambiaSeccion("Compras");
        // trabajador1.cambiaNombre("María");


        System.out.println(trabajador1.devuelveDatos());
        // Aumenta en 1 unidad automáticamente en número ID.
       // Empleados.Id++; Hemos metido esta instrucción en el constructor.
        System.out.println(trabajador2.devuelveDatos());
        // Empleados.Id++;
        System.out.println(trabajador3.devuelveDatos());
        System.out.println(trabajador4.devuelveDatos());
        System.out.println("");

        //Vamos a llamar al método static.Como no actúa sobre objetos (es estático)
        // no podríamos usar trabajador1.dameSiguienteId()
        // Hay que usar el nombre de la clase (Empleados) seguido del punto y del método estático.
        // Tanto las variables como los métidos estáticos se indican en IntelliJ en cursiva.

        System.out.println(Empleados.dameSiguienteId());
    }

}
    // Creación de la plantilla del objeto EMPLEADO
class Empleados{

    // Variables del objeto
    private final String nombre;
    private String seccion;
    // Usamos static en esta variable para que cada objeto tenga la suya propia, incrementada automáticamente por el
    // programa.
    private int Id;
    private static int IdSiguiente = 1; // IdSiguiente es estática!

    // Constructor
    public Empleados(String nom){
    nombre = nom;
    seccion = "Administración";
    Id = IdSiguiente;
    IdSiguiente++;


    }

    // Setters (void) and getters (tipo de variable que retorna)

    public void cambiaSeccion(String seccion){
        this.seccion = seccion;
    }

    public String devuelveDatos(){
        return "El nombre es: " + nombre + " y su sección es " + seccion + ". Su Id es " + Id;
    }

    // Usando este método setter podríamos cambiar el nombre del empleado y eso no tiene mucho sentido.
    // Para evitarlo deberíamos usar constantes (final en línea 24, cuando declaramos la variable).

    /*

    public void cambiaNombre(String nombre){
        this.nombre = nombre;
    }

    */

        /*
        Vamos a crear un método static para aprender a usarlo.
        Este, concretamente, ha de decirnos el siguiente Id disponible.
         */
        
        public static String dameSiguienteId(){
            return "El siguiente Id es: " + IdSiguiente;
        }

}
