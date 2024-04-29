package clases.Monedas;

/**
 * Clase Moneda500 que extiende la clase abstracta Moneda.
 * Esta clase representa una moneda con un valor de 500.
 */
public class Moneda500 extends Moneda {

    /**
     * Constructor por defecto de la clase Moneda500.
     * Llama al constructor de la clase padre Moneda.
     */
    public Moneda500() {
        super();
    }

    /**
     * Retorna el valor de la moneda.
     * 
     * @return el valor de la moneda, que es 500.
     */
    public int getValor() {
        return 500;
    }
}