package cl.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import cl.clases.Inventario;
import cl.clases.Producto;

/**
 * Pruebas unitarias para la clase {@link Inventario}.
 * 
 * @author Laura Duhalde
 */
public class InventarioTest {

    private Inventario inventario;
    private Producto producto1;
    private Producto producto2;

    @BeforeEach
    void setUp() {
    	//Se inicializa un inventario con productos base Televisor y Refrigerador
        inventario = new Inventario();
        producto1 = new Producto("P001", "Televisor", 250000, 10);
        producto2 = new Producto("P002", "Refrigerador", 450000, 5);

        inventario.agregarProducto(producto1);
        inventario.agregarProducto(producto2);
    }

    @Test
    void testAgregarProductoNuevo() {
        Producto producto3 = new Producto("P003", "Notebook", 550000, 7);
        inventario.agregarProducto(producto3);

        assertEquals(producto3, inventario.buscarProducto("P003"));
    }
    
    @Test
    void testAgregarProductoExistente() {
    	//No hay excepción, solo no agrega un duplicado
        inventario.agregarProducto(producto1);
        assertEquals(producto1, inventario.buscarProducto("P001"));
    }

    @Test
    void testBuscarProductoExistente() {
        Producto encontrado = inventario.buscarProducto("P001");
        assertNotNull(encontrado);
    }

    @Test
    void testBuscarProductoInexistente() {
        Producto encontrado = inventario.buscarProducto("P999");
        assertNull(encontrado);
    }

    @Test
    void testEliminarProductoExistente() {
        inventario.eliminarProducto("P002");
        assertNull(inventario.buscarProducto("P002"));
    }

    @Test
    void testEliminarProductoInexistente() {
        // No debería lanzar excepción, simplemente no elimina nada
        inventario.eliminarProducto("P999");
        assertNull(inventario.buscarProducto("P999"));
    }
    
    @Test
    void testListarProductos() {
        // Redirigir salida estándar a un buffer temporal
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        // Ejecutar método
        inventario.listarProductos();

        // Restaurar salida estándar
        System.setOut(System.out);

        // Verificar que la salida contiene los productos esperados
        String salida = outContent.toString();
        assertTrue(salida.contains("Televisor"));
        assertTrue(salida.contains("Refrigerador"));
    }

}

