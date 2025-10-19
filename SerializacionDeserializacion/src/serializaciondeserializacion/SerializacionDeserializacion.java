/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package serializaciondeserializacion;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
/**
 *
 * @author Lesther
 */
public class SerializacionDeserializacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Prueba de serializacion");
        Persona persona1 = new Persona("Alumno", 24);
        Persona persona2 = new Persona("Alumno2", 30);
        // Serializacion
        try{
            FileOutputStream archivo = new FileOutputStream("persona.ser");
            ObjectOutputStream salida = new ObjectOutputStream(archivo);
            salida.writeObject(persona1);
            salida.writeObject(persona2);
            System.out.println("Objeto serializado Correctamente");
        }catch (IOException e){
            System.out.println("el error es: "+ e.toString());
        }
        // Deserialización
        try{
            FileInputStream archivoD = new FileInputStream ("persona.ser");
            ObjectInputStream entrada = new ObjectInputStream(archivoD);
            Persona per1 = (Persona) entrada.readObject();
            Persona per2 = (Persona) entrada.readObject();
            entrada.close();

            System.out.println("Objetos deserializados");
   
            System.out.println("Nombre: " + per1.getNombre() + " | Edad: " + per1.getEdad());
            System.out.println("Nombre: " + per2.getNombre() + " | Edad: " + per2.getEdad());

            
        }catch (IOException|ClassNotFoundException e){
            e.printStackTrace();
        }
        
    }
    
}
