package com.POO;

public class Coche {

    private int ruedas;

    private int largo;

    private int ancho;

    private int motor;

    private int peso_plataforma;

    // Variables que pueden cambiar en función del modelo de coche:

    private String color;
    private int peso_total;
    private boolean asientos_cuero, climatizador;


    /*
    Encapsulación = hay propiedades que sólo se pueden modificar desde esta clase.
    Ej: No tiene sentido que instanciando la clase se diga que un coche tiene 3 ruedas.
    Se consigue añadiendo un modificador de privacidad al crear la variable (private).
    Al encapsularlo no es visible desde otra clase. Para poder usarlos en otra clase hemos de usar métodos
    Getters y Setters.

    Método SETTERS = definidor (Modificar el valor de las variables)
    public void nombre_método(){código}
    VOID significa que no devuelve ningún valor.

    Método GETTERS = captador (Acceder)
    public tipo_de_dato_a_devolver nombre_método(){código + return};


     */

    /* Creamos el método constructor.
    Siempre ha de tener el mismo nombre que la clase.
     */

    public Coche(){
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso_plataforma = 500;
    }

    // Creando métodos Getters.

    public String dime_largo(){
        return "El largo del coche es " + largo;
    }
    public String dime_datos_generales(){
        return "La plataforma del vehículo tiene " + ruedas + " ruedas " +
                ". Mide " +largo/1000 + " metros con un ancho de " + ancho + " centímetros y un peso de plataforma de "
                + peso_plataforma + " kilos.";
    }

    public String dime_ruedas(){
        return "EL coche tiene " + ruedas + " ruedas.";
    }

    //Creando métodos Setters.

    // Paso de Parámetros:
    /*
    Para que cuando usemos este método desde la clase principal podamos darle el color que queramos,
    hemos de introducir una variable entre los paréntesis establece_color(xxxxx)
    También hemos de modificarla variable color = nueva variable (color_coche, en el ejemplo)
     */
    public void establece_color(String color_coche){
        //color = "azul";
        color = color_coche;
    }

    public String dime_color(){
        return "El coche es de color " + color;
    }

    public void configura_asientos(String asientos_cuero){ //SETTER
        // Se añade el this. cuando las variables tienen el mismo nombre, para que no se confundan.
        //this.asientos_cuero = asientos_cuero;
        if (asientos_cuero.equalsIgnoreCase("si")){
            this.asientos_cuero = true;
        }else{
            this.asientos_cuero = false;
        }
    }

    public String dime_asientos(){ //GETTER
        if(asientos_cuero == true){
            return "El coche tiene los asientos de cuero";
        }else{
            return "Los asientos no son de cuero.";
        }

    }

    public void configura_climatizador(String climatizador){
        if(climatizador.equalsIgnoreCase("si")){
            this.climatizador = true;
        }else{
            this.climatizador = false;
        }
    }

    public String dime_climatizador(){
        if(climatizador== true){
            return "El coche sí tiene climatizador.";
        }else{
            return "El coche no tiene climatizador, tiene aire acondicionado.";
        }
    }

    // Método que es a la vez SETTER y GETTER
    // NO RECOMENDABLE
    public String dime_peso_coche(){
        int peso_carroceria= 500;
        peso_total = peso_plataforma + peso_carroceria;
        if(asientos_cuero == true){
            peso_total=peso_total + 50;
        }
        if(climatizador==true){
            peso_total= peso_total + 20;
        }
        return "El peso del coche es " + peso_total + " kilos.";
    }

    public int dime_precio(){
        int precio_final = 10000;
        if(asientos_cuero== true){
            precio_final +=2000;
        }
        if(climatizador==true){
            precio_final += 1500;
        }
        return precio_final;
    }

}
