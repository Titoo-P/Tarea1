package clases;

import java.util.ArrayList;

/**
 * @author Martin Gonzalez
 *         Clase Deposito que representa un depósito de elementos de tipo
 *         genérico D.
 *         Utiliza una lista para almacenar los elementos.
 */
public class Deposito<D> {
    private ArrayList<D> list;

    /**
     * Constructor de la clase Deposito.
     * Inicializa la lista de elementos.
     */
    public Deposito() {
        list = new ArrayList<D>();
    }

    /**
     * Método para agregar un elemento al depósito.
     * 
     * @param x el elemento a agregar.
     */
    public void add(D x) {
        list.add(x);
    }

    /**
     * Método para obtener un elemento del depósito.
     * Si el depósito está vacío, retorna null.
     * Si no está vacío, retorna y elimina el primer elemento.
     * 
     * @return el primer elemento del depósito o null si está vacío.
     */
    public D get() {
        if (list.size() == 0) {
            return null;
        } else
            return list.remove(0); // si no está vacío, retorna el primer elemento
    }
}