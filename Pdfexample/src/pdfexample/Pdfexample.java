/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pdfexample;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Lesther
 */

public class Pdfexample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ruta para guardar pdf
        String rutaProyecto = System.getProperty("user.dir");
        String rutaArchivo = rutaProyecto + File.separator + "prueba.pdf";
        // Crear documento
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new  FileOutputStream(rutaArchivo));
            document.open();
            document.add(new Paragraph("hola, este es el pdf de prueba"));
            document.add(new Paragraph("otro texto"));
            document.close();
            System.out.println("PDF GENERADO!!!!!!!");
        } catch (DocumentException | IOException e){
            e.printStackTrace();
        }
        
    }
    
}
