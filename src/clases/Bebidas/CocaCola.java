package clases.Bebidas;

/**
 * @author Martin Gonzalez
 *         Clase CocaCola que extiende la clase abstracta Bebida.
 *         Esta clase representa una bebida de tipo CocaCola con un precio
 *         específico.
 */
public class CocaCola extends Bebida {

    /**
     * Constructor de la clase CocaCola.
     * 
     * @param Serie el precio de la bebida CocaCola.
     */
    public CocaCola(int Serie) {
        super(Serie);
    }

    /**
     * Método para consumir la bebida CocaCola.
     * 
     * @return un mensaje indicando que la bebida CocaCola ha sido consumida.
     */
    public String consumir() {
        return super.consumir() + " Cocacola";
    }
}