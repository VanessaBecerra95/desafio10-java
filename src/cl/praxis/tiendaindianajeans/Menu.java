package cl.praxis.tiendaindianajeans;

import java.util.Scanner;

public class Menu {
    private ProductoServicio productoServicio = new ProductoServicio();
    private ExportadorTxt exportador = new ExportadorTxt();  // Cambiado a ExportadorTxt directamente
    private Scanner sr = new Scanner(System.in);

    public void mostrarMenu() {
        int opcion = 0;
        do {
            System.out.println("1. Listar Producto");
            System.out.println("2. Agregar Producto");
            System.out.println("3. Exportar Datos");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: ");

            // Manejo de entrada de opción y validación
            if (sr.hasNextInt()) {
                opcion = sr.nextInt();
                sr.nextLine();  // Limpiar el buffer
                switch (opcion) {
                    case 1:
                        productoServicio.listarProductos();
                        break;
                    case 2:
                        agregarProducto();
                        break;
                    case 3:
                        exportarDatos();
                        break;
                    case 4:
                        System.out.println("¡Hasta luego!");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                        break;
                }
            } else {
                System.out.println("Por favor, ingrese un número válido.");
                sr.next();  // Limpiar la entrada inválida
            }
        } while (opcion != 4);
    }

    private void agregarProducto() {
        try {
            System.out.print("Ingresar nombre artículo: ");
            String articulo = sr.nextLine();

            System.out.print("Ingresa precio: ");
            String precio = sr.nextLine();

            System.out.print("Ingresa descripción: ");
            String descripcion = sr.nextLine();

            System.out.print("Ingresa código: ");
            String codigo = sr.nextLine();

            System.out.print("Ingresa talla: ");
            String talla = sr.nextLine();

            System.out.print("Ingresa marca: ");
            String marca = sr.nextLine();

            System.out.print("Ingresa color: ");
            String color = sr.nextLine();

            Producto producto = new Producto(articulo, precio, descripcion, codigo, talla, marca, color);
            productoServicio.agregarProducto(producto);
            System.out.println("¡Producto agregado exitosamente!");
        } catch (Exception e) {
            System.out.println("Error al agregar producto: " + e.getMessage());
        }
    }

    private void exportarDatos() {
        System.out.print("Ingrese el nombre del archivo para exportar: ");
        String nombreArchivo = sr.nextLine();
        exportador.setNombreArchivo(nombreArchivo);
        exportador.exportar(productoServicio.getListaProductos());
    }

}
