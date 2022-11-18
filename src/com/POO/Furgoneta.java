package com.POO;

// Vamos a heredas de la clase coche.
// Furgoneta EXTENDS Coche
// OJO: Java NO admite la herencia múltiple.

public class Furgoneta extends Coche{

    private int capacidad_carga;
    private int plazas_extra;

    // Constructor
    public Furgoneta(int plazas_extra, int capacidad_carga){
        super(); //Estamos llamando al constructor de la clase padre (Coche).
        this.capacidad_carga = capacidad_carga;
        this.plazas_extra = plazas_extra;
    }

    public String dime_datos_furgoneta(){
        return "La capacidad de carga es " + capacidad_carga + ". Y las plazas extra son " + plazas_extra;
    }


}
