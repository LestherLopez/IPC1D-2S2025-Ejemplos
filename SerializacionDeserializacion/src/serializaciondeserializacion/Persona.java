/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serializaciondeserializacion;

import java.io.Serializable;

/**
 *
 * @author Lesther
 */

//La clase debe implementar Serializable para que los objetos se puedan serializar y deserializar.
public class Persona implements Serializable {
    /*El serialVersionUID es un identificador único para la versión de una clase. Es importante definir un valor predeterminado
    por nosotros, puesto que si no lo hacemos Java lo generará automáticamente y su valor cambia cada vez que hagamos una modificacion
    a la clase, lo que puede causar conflictos al deserializar
    */
     private static final long serialVersionUID = 1L;
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
