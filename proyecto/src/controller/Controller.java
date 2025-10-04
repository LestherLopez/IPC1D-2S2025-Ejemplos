/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Model;
import view.view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Lesther
 */
public class Controller {
    private Model modelo; // Modelo que contiene los datos del CSV
    private view vista;   // Vista que muestra la interfaz

    public Controller(Model modelo, view vista) {
        this.modelo = modelo;
        this.vista = vista;

        // Asociar acción al botón de la vista
        // Cuando se presione "Cargar CSV", se ejecuta el método cargarCSV()
        this.vista.getBtnLoadCSV().addActionListener(e -> cargarCSV());
    }

    // Método para cargar el CSV
    private void cargarCSV() {
        // Abrir un explorador de archivos para seleccionar el CSV con la clase JFileChooser de Java
        JFileChooser fileChooser = new JFileChooser();
        int resultado = fileChooser.showOpenDialog(vista);

        if (resultado == JFileChooser.APPROVE_OPTION) {
            String ruta = fileChooser.getSelectedFile().getAbsolutePath();

            try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
                String linea;
                int fila = 0;

                br.readLine(); // Saltar la primera línea (encabezado)

                // Leer línea por línea hasta el máximo de filas permitido
                while ((linea = br.readLine()) != null && fila < modelo.getFilas()) {
                    String[] partes = linea.split(","); // Separar columnas por coma

                    // Guardar cada dato en el modelo
                    for (int col = 0; col < partes.length && col < modelo.getColumnas(); col++) {
                        modelo.setDato(fila, col, partes[col]);
                    }
                    fila++;
                }

                // Actualizar la tabla en la vista con los datos del modelo
                actualizarTabla();

            } catch (IOException ex) {
                // Mostrar mensaje de error si algo falla
                JOptionPane.showMessageDialog(vista, "Error al leer el CSV: " + ex.getMessage());
            }
        }
    }

    // Método que actualiza la tabla en la vista
    private void actualizarTabla() {
        String[][] datos = modelo.getDatos(); // Obtener datos del modelo
        String[] encabezados = {"Nombre", "Edad", "Email"}; // Nombres de columnas

        // Crear un modelo de tabla y asignarlo a la tabla de la vista
        DefaultTableModel tablaModelo = new DefaultTableModel(datos, encabezados);
        vista.getTableData().setModel(tablaModelo);
    }
}
