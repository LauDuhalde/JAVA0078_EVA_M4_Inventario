package cl.clases;

import java.util.Objects;

/**
 * La clase {@code Producto} representa un artículo dentro del inventario.
 * 
 * <p>Contiene información básica como el identificador, nombre, precio y cantidad
 * disponible. Implementa métodos para acceder y modificar estos atributos, así como
 * para comparar productos mediante su {@code id}.</p>
 * 
 * @author Laura Duhalde
 */
public class Producto {
    /** Identificador único del producto */
    private String id;
    /** Nombre del producto */
    private String nombre;
    /** Precio unitario del producto */
    private int precio;
    /** Cantidad disponible en inventario */
    private int cantidad;
    
    /**
     * Crea un nuevo producto con los valores especificados.
     * 
     * @param id identificador único del producto
     * @param nombre nombre del producto
     * @param precio precio unitario del producto
     * @param cantidad cantidad disponible
     */
    public Producto(String id, String nombre, int precio, int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    /**
     * Obtiene el identificador del producto.
     * 
     * @return el id del producto
     */
    public String getId() {
        return id;
    }

    /**
     * Establece un nuevo identificador para el producto.
     * 
     * @param id el nuevo id del producto
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre del producto.
     * 
     * @return el nombre del producto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece un nuevo nombre para el producto.
     * 
     * @param nombre el nuevo nombre del producto
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el precio unitario del producto.
     * 
     * @return el precio del producto
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Establece un nuevo precio unitario para el producto.
     * 
     * @param precio el nuevo precio del producto
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * Obtiene la cantidad disponible en inventario.
     * 
     * @return la cantidad disponible
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Establece la cantidad disponible en inventario.
     * 
     * @param cantidad la nueva cantidad disponible
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Devuelve una representación en texto del producto con todos sus atributos.
     * 
     * @return una cadena con la información del producto
     */
    @Override
    public String toString() {
        return "Producto [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + "]";
    }

    /**
     * Compara este producto con otro basándose en el identificador único.
     * 
     * @param obj el objeto a comparar
     * @return {@code true} si ambos productos tienen el mismo id, de lo contrario {@code false}
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Producto other = (Producto) obj;
        return Objects.equals(id, other.id);
    }
}