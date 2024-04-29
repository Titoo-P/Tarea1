package clases.Dulces;

import clases.Producto;

/**
 * @author Martin Gonzalez
 *         Clase abstracta Dulce que extiende la clase Producto.
 *         Esta clase representa un dulce con un precio específico.
 */
public abstract class Dulce extends Producto {

    /**
     * Constructor de la clase Dulce.
     * 
     * @param p el precio del dulce.
     */
    public Dulce(int p) {
        super(p);
    }

    /**
     * Método para consumir el dulce.
     * 
     * @return un mensaje indicando que el dulce ha sido consumido.
     */
    public String consumir() {
        return "Dulce consumido";
    }

}
