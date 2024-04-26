package src.clases.Dulces;

public class Snickers extends Dulce {
    public Snickers(int x) {
        super(x);
    }

    public String consumir() {
        return super.consumir() + " Snickers";
    }

}
