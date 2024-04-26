package src.clases;

import src.clases.Bebida;

public class CocaCola extends Bebida {
    public CocaCola(int Serie) {
        super(Serie);
    }

    public String consumir() {
        return super.consumir() + " Cocacola";
    }
}
