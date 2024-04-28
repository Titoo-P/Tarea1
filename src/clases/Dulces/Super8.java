package clases.Dulces;

public class Super8 extends Dulce {
    public Super8(int x) {
        super(x);
    }

    public String consumir() {
        return super.consumir() + " Super8";
    }
}
