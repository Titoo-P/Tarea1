package clases.Excepciones;

/**
 * Excepción que se lanza cuando no hay producto
 * 
 * @author Martin Gonzalez
 */

public class NoHayProductoException extends Exception {

    public NoHayProductoException() {
        super("No hay producto");
    }

}
