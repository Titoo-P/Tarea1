package clases;

/**
 * @author Martin Gonzalez
 *         Enumeración Precios que representa los precios de los productos
 *         disponibles.
 *         Cada producto tiene un precio asociado.
 */
public enum Precios {

    /**
     * Producto CocaCola con un precio de 700.
     */
    CocaCola(700),

    /**
     * Producto Fanta con un precio de 300.
     */
    Fanta(300),

    /**
     * Producto Sprite con un precio de 200.
     */
    Sprite(200),

    /**
     * Producto Snickers con un precio de 400.
     */
    Snickers(400),

    /**
     * Producto Super8 con un precio de 500.
     */
    Super8(500);

    /**
     * El precio del producto.
     */
    private final int precio;

    /**
     * Constructor de la enumeración Precios.
     * 
     * @param precio el precio del producto.
     */
    Precios(int precio) {
        this.precio = precio;
    }

    /**
     * Método para obtener el precio del producto.
     * 
     * @return el precio del producto.
     */
    public int getPrecio() {
        return precio;
    }
}