package clases.Monedas;

import java.lang.Comparable;

/**
 * Clase abstracta Moneda que implementa la interfaz Comparable.
 * Esta clase representa una moneda con un valor específico.
 */
public abstract class Moneda implements Comparable<Moneda> {

    /**
     * Constructor por defecto de la clase Moneda.
     */
    public Moneda() {
    }

    /**
     * Retorna una referencia de sí mismo.
     * 
     * @return una referencia a este objeto Moneda.
     */
    public Moneda getSerie() {
        return this;
    }

    /**
     * Método abstracto para obtener el valor de la moneda.
     * Las clases que extiendan Moneda deben implementar este método.
     * 
     * @return el valor de la moneda.
     */
    public abstract int getValor();

    /**
     * Compara el valor de esta moneda con otra moneda.
     * 
     * @param m la otra moneda a comparar.
     * @return la diferencia en valor entre esta moneda y la moneda pasada como
     *         argumento.
     */
    public int compareTo(Moneda m) {
        return this.getValor() - m.getValor();
    }

}
