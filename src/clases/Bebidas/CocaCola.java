package src.clases.Bebidas;

public class CocaCola extends Bebida {
    public CocaCola(int Serie) {
        super(Serie);
    }

    public String consumir() {
        return super.consumir() + " Cocacola";
    }
}
