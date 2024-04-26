package src.clases.Monedas;

import java.lang.Comparable;

public abstract class Moneda implements Comparable<Moneda> {
    public Moneda() {
    }

    // retorna una referencia de si mismo
    public Moneda getSerie() {
        return this;
    }

    // retorna el valor de la moneda
    public abstract int getValor();

    // compara el valor de la moneda
    public int compareTo(Moneda m) {
        return this.getValor() - m.getValor();
    }

}
