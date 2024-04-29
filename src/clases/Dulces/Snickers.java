package clases.Dulces;

/**
 * @author Martin Gonzalez
 *         Clase Snickers que extiende la clase abstracta Dulce.
 *         Esta clase representa un dulce de tipo Snickers con un precio
 *         específico.
 */
public class Snickers extends Dulce {

    /**
     * Constructor de la clase Snickers.
     * 
     * @param p el precio del dulce Snickers.
     */
    public Snickers(int p) {
        super(p);
    }

    /**
     * Método para consumir el dulce Snickers.
     * 
     * @return un mensaje indicando que el dulce Snickers ha sido consumido.
     */
    public String consumir() {
        return super.consumir() + " Snickers";
    }

}
