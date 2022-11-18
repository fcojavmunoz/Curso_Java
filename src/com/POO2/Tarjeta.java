package com.POO2;

public class Tarjeta {
    private int largo;
    private int ancho;
    private boolean contactless;
    private boolean banda;
    private boolean chip;

    private String material;
    private String numero;
    private String fechacaducidad;
    private int CCV;

// CONSTRUCTOR
    public Tarjeta(){
        largo = 100;
        ancho = 40;
    }
    public String dime_medidas(){
        return "La tarjeta mide "+largo + " mm. por " + ancho + " mm.";
    }

   public void set_material(String metal){
        material = metal;
    }
    public String dime_material(){
        if(material.equalsIgnoreCase("metal")){
            return "La tarjeta es de metal.";
        }else{
            return "La tarjeta es de plástico.";
        }

    }

    public void set_numero_tarjeta(String numero){
        if(numero.length()==16){
            this.numero = numero;
        }else{
            this.numero = "ERROR";
        }

    }
    public String dime_numero_tarjeta(){
        return "El número de la tarjeta es " + numero;
    }
}

