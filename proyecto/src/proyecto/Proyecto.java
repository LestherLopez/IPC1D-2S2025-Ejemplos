/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto;

import controller.Controller;
import model.Model;
import view.view;

/**
 *
 * @author Lesther
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Definir el número máximo de filas y columnas que se pueden almacenar del csv
        int maxFilas = 10;
        int columnas = 3;
        // Crear el modelo con el tamaño definido
        Model modelo = new Model(maxFilas, columnas);
         // Crear la vista y mostrarla con setVisible
        view vista = new view();
        vista.setVisible(true);
        // Crear el controlador y pasarle el modelo y la vista
        new Controller(modelo, vista);
         // Centrar la ventana en la pantalla
        vista.setLocationRelativeTo(null);
    }
    
}
