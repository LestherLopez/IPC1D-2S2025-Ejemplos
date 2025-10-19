/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Lesther
 */
public class DatosGrafico {
    private String[] categorias;
    private int[] valores;

    public DatosGrafico(String[] categorias, int[] valores) {
        this.categorias = categorias;
        this.valores = valores;
    }

    public String[] getCategorias() {
        return categorias;
    }

    public int[] getValores() {
        return valores;
    }
}
