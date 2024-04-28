package clases.Bebidas;

public class Fanta extends Bebida {
    public Fanta(int Serie) {
        super(Serie);
    }

    public String consumir() {
        return super.consumir() + " Fanta";
    }

}
