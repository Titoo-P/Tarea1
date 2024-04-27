package src.clases;
import src.clases.Monedas.*;
import src.clases.Dulces.*;
import src.clases.Bebidas.*;

public abstract class Producto {

    protected int Serie;

    public Producto(int x) {
        Serie = x;
    }

    public int getSerie() {
        return Serie;
    }

    public abstract String consumir();
}
