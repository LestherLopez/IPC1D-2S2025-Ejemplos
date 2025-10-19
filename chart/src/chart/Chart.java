/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chart;
import Model.DatosGrafico;
import View.Inicio;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author Lesther
 */
public class Chart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] categorias = {"Enero", "Febrero", "Marzo", "Abril"};
        int[] valores = {60, 25, 100, 200};

        // Crear el modelo de datos
        DatosGrafico datos = new DatosGrafico(categorias, valores);

        // Crear la vista y mostrar el gráfico por medio del metodo mostrarGrafico que recibe como parametro los datis
        Inicio inicio = new Inicio();
        inicio.mostrarGrafico(datos);

        // Mostrar la ventana
        inicio.setVisible(true);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la ruta de tu archivo: ");
        String nombreArchivo = scanner.nextLine();
        File archivo = new File(nombreArchivo);
        if(!archivo.exists()){
            System.out.println("Error: no se encontro");
            return;
        }
        leerCSV(nombreArchivo);
        
    }
    public static void leerCSV(String nombreArchivo){
        try(BufferedReader lector  = new BufferedReader(new FileReader(nombreArchivo))){
            String fila;
            int contador = 0;
            String encabezado = lector.readLine();
            System.out.println(encabezado);
            while ((fila = lector.readLine()) != null){
                //valor1,valor -> [valor1, valor2]
                String [] datos = fila.split(",");
               if (datos.length < 2){
                    continue;
                } 
                
                String nombreJuego = datos[0];
                int cantidad = Integer.parseInt(datos[1]);
                System.out.println("juego: " + nombreJuego + " Cantidad: "+ cantidad);
                contador++;
            }
            System.out.println("Todos los juegos leidos: "+contador);
        }catch(IOException e){
            System.out.println("Error al leer el archivo");
        }
    }
}
