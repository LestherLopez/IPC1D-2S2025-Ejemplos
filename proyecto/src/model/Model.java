/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.io.*;

/**
 *
 * @author Lesther
 */
public class Model {
    private String[][] datos; // Arreglo estatico que contiene los datos
    private final int filas;  // Número máximo de filas
    private final int columnas; // Número de columnas

    // Constructor que recibe el tamaño del modelo
    public Model(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        datos = new String[filas][columnas]; // Inicializar arreglo
    }

    // Método para almacenar un dato en una posición específica
    public void setDato(int fila, int columna, String valor) {
        if (fila < filas && columna < columnas) {
            datos[fila][columna] = valor;
        }
    }

    // Método para obtener un dato específico del modelo
    public String getDato(int fila, int columna) {
        if (fila < filas && columna < columnas) {
            return datos[fila][columna];
        }
        return null;
    }

    // Método para obtener todos los datos
    public String[][] getDatos() {
        return datos;
    }

    // Método para obtener las filas
    public int getFilas() {
        return filas;
    }
    // Método para obtener las columnas
    public int getColumnas() {
        return columnas;
    }
}
