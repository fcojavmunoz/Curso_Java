package com.POO3;

//Vamos a programar POO en un sólo archivo.
// Sólo una clase ha de ser public y sólo una debe ser main.


import java.util.*;

public class Uso_Empleado {
    public static void main(String[] args) {

       /*  Empleado empleado1 = new Empleado("Javier Muñoz", 30000, 1980, 4, 24);
        Empleado empleado2 = new Empleado("Ana López", 85000, 1990, 12, 17);
        Empleado empleado3 = new Empleado("María Martín", 28000, 2020, 1, 12);

        System.out.println(empleado1.dame_nombre());
        System.out.println(empleado1.dame_sueldo());
        System.out.println(empleado1.dame_fecha());
        System.out.println("");
        System.out.println(empleado2.dame_nombre());
        System.out.println(empleado2.dame_sueldo());
        System.out.println(empleado2.dame_fecha());
        System.out.println("");
        System.out.println(empleado3.dame_nombre());
        System.out.println(empleado3.dame_sueldo());
        System.out.println(empleado3.dame_fecha());
        System.out.println("");

        empleado1.sube_sueldo(5);
        empleado2.sube_sueldo(5);
        empleado3.sube_sueldo(5);

        System.out.println(empleado1.dame_sueldo());
        System.out.println(empleado2.dame_sueldo());
        System.out.println(empleado3.dame_sueldo());
    */
        // Usamos la clase Jefatura
        Jefatura jefe_RRHH = new Jefatura("Miguel Martínez",55000, 1980,3,4);
        jefe_RRHH.establace_incentivo(2570);
        // Hay que preparar el array para que también incluya al nuevo jefe_RRHH [5]
        Empleado[] misEmpleados = new Empleado[6];
        misEmpleados[0] = new Empleado("Javier Muñoz", 30000, 1980, 4, 24);
        misEmpleados[1] = new Empleado("Ana Ruiz", 45000, 1990, 12, 17);
        misEmpleados[2] = new Empleado("María Martín", 28000, 2020, 1, 12);
        //Estamos llamando al segundo constructor. Lo sabe porque ponemos sólo un argumento.
        misEmpleados[3] = new Empleado("Antonio Fernández");
        misEmpleados[4] = jefe_RRHH; // Polimorfismo en acción. Principio de sustitución.
        // El paso anterior explicado poco a poco:
        misEmpleados[5] = new Jefatura ("Eva López", 95000, 1999, 5, 26);
        // Para poder aplicar a este último objeto un método de la clase Jefatura
        // habría que hacer un casting o refundición y pasar a este objeto de tipo empleado
        // a un objeto de tipo jefatura.
        Jefatura jefa_finanzas = (Jefatura) misEmpleados[5];


        /*
        Igual que cuando hacemos un casting de un double a int:
        double num1 = 7.5;
        int num2 = (int) num1;
         */
        jefa_finanzas.establace_incentivo(55000);
        jefa_finanzas.establece_bonus(500);

        // Empleado director_comercial = new Jefatura("Sandra", 85000, 2021, 2,23);
        // Comparable ejemplo = new Empleado("Elisabeth", 95000, 2020, 4,4);



        // No nos gusta el resultado (sueldo 0.0 y fecha de alta null).
        // Vamos a hacer que tenga unos valores por defecto. Lo haremos usando "this".


        // for (int i = 0; i<4;i++){
          //  misEmpleados[i].sube_sueldo(5);
        // }
        //for (int i = 0; i<4;i++){
          //  System.out.println("Nombre: " + misEmpleados[i].dame_nombre()
            //+ " Sueldo: " + misEmpleados[i].dame_sueldo()
            //+ " Fecha de alta: " + misEmpleados[i].dame_fecha());
        //}

        System.out.println("");
/*
        if(director_comercial instanceof Empleado){
            System.out.println("Es de tipo Jefatura");
        }

        if (ejemplo instanceof Comparable){
            System.out.println("Implementa la interfaz Comparable");
        }

 */

        // Con bucles FOR mejorados

        System.out.println(jefa_finanzas.tomar_decisiones("dar más días de vacaciones a los empleados."));
        System.out.println("");
        for(Empleado e:misEmpleados){
          e.sube_sueldo(5);
        }

        System.out.println("La jefa " + jefa_finanzas.dame_nombre() + " tiene un bonus de " + jefa_finanzas.establece_bonus(500));
        System.out.println("El empleado " + misEmpleados[3].dame_nombre() + " tiene un bonus de " + misEmpleados[3].establece_bonus(200));
        // Vamos a practicar interfaces. Le vamos a pedir al programa que ordene a ls trabajadores
        // según su sueldo. Para hacerlo usamos el método estático sort del paquete Arrays.
        // Para poder usarlo hay que importar antes una interfaz. El tipo a ordenar debe implementar
        // la interfaz Comparable.

        Arrays.sort(misEmpleados);

        for(Empleado e:misEmpleados){
            System.out.println("Nombre: " + e.dame_nombre()
                    + " Sueldo: " + e.dame_sueldo()
                    + " Fecha de alta: " + e.dame_fecha());
        }
    }


}

class Empleado implements Comparable, Trabajadores {

    // Constructor (coincide su nombre con el de la clase.
    // Se pueden tener varios constructores que compartan el nombre (sobrecarga de constructores).
    // PERO han de tener diferente número de argumentos.
    // Podríamos crear otra class Empleados PERO no podría tener 5 parmáteros.
    // Se usan varios constructores cuando queremos darles diferentes estados iniciales a diferentes objetos.
    // Ej: Desconocemos el sueldo y la fecha de alta de unos de los empleados.

    public Empleado(String nom, double sue, int agno, int mes, int dia){
        nombre = nom;
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
        altaContrato = calendario.getTime();

    }

    public double establece_bonus(double gratificacion){
        return Trabajadores.bonus_base+gratificacion;
    }

    // Otro método constructor (sobrecarga) para cuando conocemos sólo el nombre del empleado.

    public Empleado(String nom){
        //nombre = nom;
        // Usando el this, llamamos al otro constructor de la clase
        // y damos valores por defecto en los parámetros que no conozcamos.

        this(nom,30000,2000,01,01);
    }


    public String dame_nombre(){
        return nombre;
    }

    public double dame_sueldo(){
        return sueldo;
    }

    public Date dame_fecha(){
        return altaContrato;
    }

    public void sube_sueldo(double porcentaje){
        double aumento = sueldo * porcentaje/100;
        sueldo += aumento;
    }

    private String nombre;
    private double sueldo;
    private Date altaContrato;
    private static int IdSiguiente;
    private int Id;



    public int compareTo(Object miObjeto) {
        Empleado otroEmpleado = (Empleado) miObjeto;
        if(this.sueldo<otroEmpleado.sueldo){
            return -1;
        }
        if (this.sueldo>otroEmpleado.sueldo){
            return 1;
        }

            return 0;

    }
}

// Como Jefatura ya hereda de la clase Empleado, no podríamos añadir más métodos específicos en este tipo de
// objetos. Para solucionar ese problema, hemos creado la interface Jefes.java y vamos a hacer que se pueda usar
// en Jefatura: implements. Marcará un error porque la clase Jefatura tiene que desarrollar los métodos
// que incluye la interface.

class Jefatura extends Empleado implements Jefes{ // Escribiendo la palabra final en primer lugar
    // evitamos que cualquier otra clase herede de esta.
    // También lo podemos hacer en métodos.
     public Jefatura (String nom, int sue, int agno, int mes, int dia){
         super(nom, sue, agno, mes, dia);

     }

     // Implementamos el método tomar_decisiones de la interface Jefes.java.

    public String tomar_decisiones(String decision){
         return "Un miembro de la dirección ha tomado la decisión de " + decision;

    }

    // Implementamos el método de la interface Trabajadores

    public double establece_bonus(double gratificacion){
         double prima = 2000; // prima para los jefes
         return Trabajadores.bonus_base+gratificacion+ prima;
    }

     public void establace_incentivo(double b){
         incentivo = b;
     }

     public double dame_sueldo(){
         double sueldoJefe = super.dame_sueldo();
         return sueldoJefe + incentivo;
     }
     private double incentivo;

}

/*
class Director extends Jefatura{

    public Director(String nom, int sue, int agno, int mes, int dia){
        super(nom, sue, agno, mes, dia);

    }
}*/