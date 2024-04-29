package clases.Bebidas;

import clases.Producto;

/**
 * @author Martin Gonzalez
 *         Clase abstracta Bebida que extiende la clase Producto.
 *         Esta clase representa una bebida con un precio específico.
 */
public abstract class Bebida extends Producto {

    /**
     * Constructor de la clase Bebida.
     * 
     * @param x el precio de la bebida.
     */
    public Bebida(int x) {
        super(x);
    }

    /**
     * Método para consumir la bebida.
     * 
     * @return un mensaje indicando que la bebida ha sido consumida.
     */
    public String consumir() {
        return "bebida consumida";
    }

    /**
     * Método abstracto para obtener el precio de la bebida.
     * Las clases que extiendan Bebida deben implementar este método.
     * 
     * @return el precio de la bebida.
     */
    protected abstract int getPrecio();
}