package src.clases;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Expendedor exp = new Expendedor(1, 1000);
        Moneda m = null;
        Comprador c = null;

        m = new Moneda1000();
        c = new Comprador(m, 1, exp);

        System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());

        m = new Moneda1500();
        c = new Comprador(m, 1, exp);

        System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());

    }
}

