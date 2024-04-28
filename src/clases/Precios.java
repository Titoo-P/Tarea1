package src.clases;
import src.clases.Monedas.*;
import src.clases.Dulces.*;
import src.clases.Bebidas.*;

public enum Precios {

    CocaCola("cocacola",700),

    Fanta("fanta",300),

    Sprite("sprite",200),

    Snickers("snickers",400),

    Super8("super8",500);

    private final String tipo;
    private final int precio;

    Precios(String tipo, int precio) {
        this.tipo = tipo;
        this.precio = precio;

    }

    public int getPrecio() {
        return precio;
    }

    public String getTipo(){
        return tipo;
    }

}
