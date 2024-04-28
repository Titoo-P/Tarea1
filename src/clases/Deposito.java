package clases;

import java.util.ArrayList;

public class Deposito<D> {
    ArrayList<D> list;

    public Deposito() {
        list = new ArrayList<D>();
    }

    public void add(D x) {
        list.add(x);
    }

    // si la lista esta vacia retorna null
    public D get() {
        if (list.size() == 0) {
            return null;
        } else
            return list.remove(0); // si no esta vacia, retorna el primer elemento
    }
}