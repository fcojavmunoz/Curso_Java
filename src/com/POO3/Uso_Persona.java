package com.POO3;

import java.util.Date;
import java.util.GregorianCalendar;





public class Uso_Persona {
    public static void main(String[] args) {

        Persona[] lasPersonas = new Persona[2];
        lasPersonas[0]= new Empleado2("Javier", 55000, 2020, 12, 4);
        lasPersonas[1] = new Alumno("Noa", "Ingeniería");

        for(Persona p:lasPersonas){
            System.out.println(p.dameNombre()+ ", " + p.dameDescripcion());

        }

    }
}

//Creamos una clase abstracta.

abstract class Persona{
    public Persona(String nom){
        nombre = nom;

    }

    public String dameNombre(){
        return nombre;
    }
    //Método abstracto. Hay que incluirlo en todas las clases que hereden de Persona.

    public abstract String dameDescripcion();

    private String nombre;

}

class Empleado2 extends Persona{



    public Empleado2(String nom, double sue, int agno, int mes, int dia){

        super(nom);
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
        altaContrato = calendario.getTime();
        ++IdSiguiente;
        Id = IdSiguiente;

          }


    public String dameDescripcion(){
        return "Este empleado tiene un ID = " + Id + " con un sueldo de " + sueldo;
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


    private double sueldo;
    private Date altaContrato;
    private static int IdSiguiente;
    private int Id;


}

class Alumno extends Persona{

    public Alumno(String nom, String car) {
        super(nom);
        carrera = car;
    }
    public String dameDescripcion(){
        return "Este alumno está estudiando la carrera de " + carrera;
    }
    private String carrera;
}