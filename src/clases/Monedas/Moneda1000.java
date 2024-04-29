package clases.Monedas;

/**
 * Clase Moneda1000 que extiende la clase abstracta Moneda.
 * Esta clase representa una moneda con un valor de 1000.
 */
public class Moneda1000 extends Moneda {

    /**
     * Constructor por defecto de la clase Moneda1000.
     * Llama al constructor de la clase padre Moneda.
     */
    public Moneda1000() {
        super();
    }

    /**
     * Retorna el valor de la moneda.
     * 
     * @return el valor de la moneda, que es 1000.
     */
    public int getValor() {
        return 1000;
    }
}