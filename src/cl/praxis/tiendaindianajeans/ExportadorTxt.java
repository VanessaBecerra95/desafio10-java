package cl.praxis.tiendaindianajeans;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ExportadorTxt extends Exportador {
    private String nombreArchivo;

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    @Override
    public void exportar(ArrayList<Producto> listaProductos) {
        if (nombreArchivo == null || nombreArchivo.isEmpty()) {
            throw new IllegalStateException("El nombre del archivo no está definido");
        }

        File file = new File(nombreArchivo + ".txt");
        if (file.exists()) {
            System.out.println("El archivo ya existe.");
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (Producto producto : listaProductos) {
                System.out.println("---------");
                writer.write(producto.toString());
                writer.newLine();
            }
            System.out.println("Exportación de archivo txt exitosa.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

