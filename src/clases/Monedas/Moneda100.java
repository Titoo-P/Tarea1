package clases.Monedas;

/**
 * Clase Moneda100 que extiende la clase abstracta Moneda.
 * Esta clase representa una moneda con un valor de 100.
 */
public class Moneda100 extends Moneda {

    /**
     * Constructor por defecto de la clase Moneda100.
     * Llama al constructor de la clase padre Moneda.
     */
    public Moneda100() {
        super();
    }

    /**
     * Retorna el valor de la moneda.
     * 
     * @return el valor de la moneda, que es 100.
     */
    public int getValor() {
        return 100;
    }
}