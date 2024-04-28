import clases.*;
import clases.Monedas.*;
import clases.Excepciones.*;
import clases.Comprador;

public class Main {
    public static void main(String[] args) {
        Expendedor expendedor = new Expendedor(1);

        // Probar con diferentes escenarios
        probarEscenarioPagoInsuficiente(expendedor);
        probarEscenarioMonedaNula(expendedor);
        probarEscenarioMonedaIgualAlPrecio(expendedor);
        probarEscenarioSinProducto(expendedor);
    }

    private static void probarEscenarioPagoInsuficiente(Expendedor exp) {
        try {
            Moneda moneda = new Moneda100();
            Comprador comprador = new Comprador(moneda, Precios.Sprite, exp);
            exp.comprarBebida(Precios.Sprite, moneda);
            System.out.println(comprador.queBebiste() + " $" + comprador.cuantoVuelto());
        } catch (PagoIncorrectoException | PagoInsuficienteException | NoHayProductoException e) {
            System.err.println(e.getMessage());
        }
    }

    private static void probarEscenarioMonedaNula(Expendedor exp) {
        try {
            Moneda moneda = null;
            Comprador comprador = new Comprador(moneda, Precios.Snickers, exp);
            System.out.println(comprador.queBebiste() + " $" + comprador.cuantoVuelto());
        } catch (PagoIncorrectoException | PagoInsuficienteException | NoHayProductoException e) {
            System.err.println(e.getMessage());
        }
    }

    private static void probarEscenarioMonedaIgualAlPrecio(Expendedor exp) {
        try {
            Moneda moneda = new Moneda500();
            Comprador comprador = new Comprador(moneda, Precios.Super8, exp);
            System.out.println(comprador.queBebiste() + " $" + comprador.cuantoVuelto());
        } catch (PagoIncorrectoException | PagoInsuficienteException | NoHayProductoException e) {
            System.err.println(e.getMessage());
        }
    }

    private static void probarEscenarioSinProducto(Expendedor exp) {
        try {
            Moneda moneda = new Moneda1000();
            Comprador comprador = new Comprador(moneda, Precios.Snickers, exp);
            System.out.println(comprador.queBebiste() + " $" + comprador.cuantoVuelto());

            moneda = new Moneda1000();
            comprador = new Comprador(moneda, Precios.Snickers, exp);
            System.out.println(comprador.queBebiste() + " $" + comprador.cuantoVuelto());
        } catch (PagoIncorrectoException | PagoInsuficienteException | NoHayProductoException e) {
            System.err.println(e.getMessage());
        }
    }
}