package clases.Dulces;

import clases.Producto;

public abstract class Dulce extends Producto {

    public Dulce(int x) {
        super(x);
    }

    public String consumir() {
        return "Dulce consumido";
    }

}
