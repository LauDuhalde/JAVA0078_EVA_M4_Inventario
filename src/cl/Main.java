package cl;

import java.util.Scanner;

import cl.clases.Inventario;
import cl.clases.Producto;

/**
 * Clase principal que permite probar el funcionamiento del sistema de inventario.
 * 
 * <p>Se crean 5 productos iniciales y se presentan opciones en un menú interactivo
 * para gestionar el inventario (agregar, buscar, eliminar y listar productos).</p>
 * 
 * @author Laura Duhalde
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventario inventario = new Inventario();

        // Crear 5 productos iniciales
        Producto p1 = new Producto("P001", "Televisor", 250000, 10);
        Producto p2 = new Producto("P002", "Refrigerador", 450000, 5);
        Producto p3 = new Producto("P003", "Lavadora", 300000, 3);
        Producto p4 = new Producto("P004", "Microondas", 60000, 15);
        Producto p5 = new Producto("P005", "Notebook", 550000, 7);

        // Agregar al inventario
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        int opcion;
        do {
            System.out.println("\n=== MENÚ ===");
            System.out.println("1. Agregar producto");
            System.out.println("2. Buscar producto");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Listar productos");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Ingrese nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese precio: ");
                    int precio = scanner.nextInt();
                    System.out.print("Ingrese cantidad: ");
                    int cantidad = scanner.nextInt();
                    scanner.nextLine();

                    Producto nuevo = new Producto(id, nombre, precio, cantidad);
                    inventario.agregarProducto(nuevo);
                    break;

                case 2:
                    System.out.print("Ingrese ID del producto a buscar: ");
                    String idBuscar = scanner.nextLine();
                    Producto encontrado = inventario.buscarProducto(idBuscar);
                    if (encontrado != null) {
                        System.out.println("Producto encontrado.");
                        System.out.println(encontrado);
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese ID del producto a eliminar: ");
                    String idEliminar = scanner.nextLine();
                    inventario.eliminarProducto(idEliminar);
                    break;

                case 4:
                    System.out.println("\nProductos en inventario:");
                    inventario.listarProductos();
                    break;

                case 5:
                    System.out.println("Hasta Luego!");
                    break;

                default:
                    System.out.println("Opción inválida, intente de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}
