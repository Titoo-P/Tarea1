package src.clases.Dulces;

import src.clases.Producto;

public abstract class Dulce extends Producto {

    public Dulce(int x) {
        super(x);
    }

    public String consumir() {
        return "Dulce consumido";
    }

}
