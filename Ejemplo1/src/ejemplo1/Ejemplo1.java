/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo1;

/**
 *
 * @author Lesther
 */
import java.util.Scanner;
public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            // Mostramos el menú en la consola con sus 3 opciones
            System.out.println("Mi primer menú");
            System.out.println("1. Un saludo");
            System.out.println("2. Calcular suma de dos números");
            System.out.println("3. Salir");
          
            // Declaración de un arreglo de enteros llamado "intentos"
            // Este arreglo puede guardar 25 números enteros
            int intentos[] = new int[25];

            // Declaración de un arreglo de cadenas de texto llamado "nombres"
            // Este arreglo puede guardar 25 nombres (o cualquier texto)
            String nombres[] = new String[25];

            // Declaración de un arreglo de enteros llamado "puntos"
            // Este arreglo puede guardar 25 valores numéricos, que podrían representar puntajes
            int puntos[] = new int[25];
            // Leemos la opción que ingresa el usuario
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumimos la línea vacía generada al presionar Enter después de ingresar un número.
    
            // Evaluamos la opción seleccionada usando un "switch", una alternativa es IF con ELSE IF y ELSE.
            switch (opcion) {
                case 1:
                    // Opción 1: Pedimos el nombre del usuario y lo saludamos
                    System.out.println("Ingrese su nombre: ");
                    String nombre = scanner.nextLine(); // Leemos el nombre
                    System.out.println("Hola " + nombre); // Mostramos el saludo
                    
                    break;
                    
                case 2:
                    // Opción 2: Pedimos dos números al usuario y mostramos su suma
                    System.out.print("Ingrese el primer número: ");
                    int numero1 = scanner.nextInt(); // Leemos el primer número
                  
                    System.out.print("Ingrese el segundo número: ");
                    int numero2 = scanner.nextInt(); // Leemos el segundo número
                        
                    // Mostramos la suma de los dos números
                    System.out.println("La suma es: " + (numero1 + numero2));
                    break;
                    
                case 3:
                    // Opción 3: Mensaje de despedida antes de salir del programa
                    System.out.println("Adiós");
                    break;
                    
                default:
                    // Mensaje si el usuario ingresa una opción inválida
                    System.out.println("Opción inválida. Inténtelo de nuevo.");
            }
            
        } while (opcion != 3); // El bucle se repite hasta que el usuario elija la opción 3 que significa salir.
    
    }
    
}
