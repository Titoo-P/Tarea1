package src.clases;

import src.clases.Bebida;

public class Sprite extends Bebida {
    public Sprite(int Serie) {
        super(Serie);
    }

    public String consumir() {
        return super.consumir() + " Sprite";
    }

}
