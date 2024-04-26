package src.clases.Bebidas;

public class Sprite extends Bebida {
    public Sprite(int Serie) {
        super(Serie);
    }

    public String consumir() {
        return super.consumir() + " Sprite";
    }

}
