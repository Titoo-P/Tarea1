package clases.Bebidas;

/**
 * @author Martin Gonzalez
 *         Clase Sprite que extiende la clase abstracta Bebida.
 *         Esta clase representa una bebida de tipo Sprite con un precio
 *         específico.
 */
public class Sprite extends Bebida {

    /**
     * Constructor de la clase Sprite.
     * 
     * @param Serie el precio de la bebida Sprite.
     */
    public Sprite(int Serie) {
        super(Serie);
    }

    /**
     * Método para consumir la bebida Sprite.
     * 
     * @return un mensaje indicando que la bebida Sprite ha sido consumida.
     */
    public String consumir() {
        return super.consumir() + " Sprite";
    }
}