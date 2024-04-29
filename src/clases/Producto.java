package clases;

/**
 * @author Martin Gonzalez
 *         Clase abstracta Producto que representa un producto genérico.
 *         Cada producto tiene un número de serie.
 */
public abstract class Producto {

    /**
     * El número de serie del producto.
     */
    protected int Serie;

    /**
     * Constructor de la clase Producto.
     * 
     * @param x el número de serie del producto.
     */
    public Producto(int x) {
        Serie = x;
    }

    /**
     * Método para obtener el número de serie del producto.
     * 
     * @return el número de serie del producto.
     */
    public int getSerie() {
        return Serie;
    }

    /**
     * Método abstracto para consumir el producto.
     * Debe ser implementado por las clases que extiendan Producto.
     * 
     * @return una cadena de texto que representa la acción de consumir el producto.
     */
    public abstract String consumir();
}