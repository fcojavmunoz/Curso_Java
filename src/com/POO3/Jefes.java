package com.POO3;

// TAmbién se puede crar jerarquías (herencia) entre interfaces (extends).
public interface Jefes extends Trabajadores{
    // Declaramos un método en la interface. public abstract se pueden omitir porque son el valor por defecto.

    String tomar_decisiones(String decision);


}
