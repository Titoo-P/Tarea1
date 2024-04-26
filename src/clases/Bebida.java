package src.clases;

import src.clases.Producto;

public abstract class Bebida extends Producto {

    public Bebida(int x) {
        super(x);
    }

    public String consumir() {
        return "bebida consumida";
    }
}
