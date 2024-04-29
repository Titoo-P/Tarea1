package clases.Bebidas;

/**
 * @author Martin Gonzalez
 *         Clase Fanta que extiende la clase abstracta Bebida.
 *         Esta clase representa una bebida de tipo Fanta con un precio
 *         específico.
 */
public class Fanta extends Bebida {

    /**
     * Constructor de la clase Fanta.
     * 
     * @param Serie el precio de la bebida Fanta.
     */
    public Fanta(int Serie) {
        super(Serie);
    }

    /**
     * Método para consumir la bebida Fanta.
     * 
     * @return un mensaje indicando que la bebida Fanta ha sido consumida.
     */
    public String consumir() {
        return super.consumir() + " Fanta";
    }
}