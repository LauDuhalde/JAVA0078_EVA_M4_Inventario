package cl.clases;

import java.util.ArrayList;

/**
 * La clase {@code Inventario} administra un conjunto de productos registrados.
 * 
 * <p>Permite agregar, buscar, eliminar y listar productos dentro de una lista
 * interna que representa el inventario de la tienda.</p>
 * 
 * @author Laura Duhalde
 */
public class Inventario {
    /** Lista de productos registrados en el inventario */
    private ArrayList<Producto> listaDeProductos = new ArrayList<>();
    
    /**
     * Agrega un producto al inventario si no existe previamente.
     * 
     * @param producto el producto a agregar
     */
    public void agregarProducto(Producto producto) {
        boolean productoExiste = false;
        for (Producto p : listaDeProductos) {
            if (p.equals(producto)) {
                System.out.println("El producto ya existe en el inventario");
                productoExiste = true;
                break;
            }
        }
        if (!productoExiste) {
            listaDeProductos.add(producto);
            System.out.println("Producto agregado exitosamente");
        }
    }
    
    /**
     * Busca un producto en el inventario por su identificador.
     * 
     * @param id el identificador del producto
     * @return el producto encontrado o {@code null} si no existe
     */
    public Producto buscarProducto(String id) {
        Producto productoEncontrado = null;
        for (Producto producto : listaDeProductos) {
            if (producto.getId().equalsIgnoreCase(id)) {
                productoEncontrado = producto;
                break;
            }
        }
        return productoEncontrado;
    }
    
    /**
     * Elimina un producto del inventario si existe.
     * 
     * @param id el identificador del producto a eliminar
     */
    public void eliminarProducto(String id) {
        Producto producto = buscarProducto(id);
        if (producto != null) {
            listaDeProductos.remove(producto);
            System.out.println("Producto eliminado correctamente");
        } else {
            System.out.println("Producto no registrado");
        }
    }
    
    /**
     * Muestra en consola todos los productos actualmente en el inventario.
     */
    public void listarProductos() {
        for (Producto producto : listaDeProductos) {
            System.out.println(producto);
        }
    }
}
