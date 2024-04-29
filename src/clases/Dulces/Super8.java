package clases.Dulces;

/**
 * @author Martin Gonzalez
 *         Clase Super8 que extiende la clase abstracta Dulce.
 *         Esta clase representa un dulce de tipo Super8 con un precio
 *         específico.
 */
public class Super8 extends Dulce {

    /**
     * Constructor de la clase Super8.
     * 
     * @param p el precio del dulce Super8.
     */
    public Super8(int p) {
        super(p);
    }

    /**
     * Método para consumir el dulce Super8.
     * 
     * @return un mensaje indicando que el dulce Super8 ha sido consumido.
     */
    public String consumir() {
        return super.consumir() + " Super8";
    }
}
