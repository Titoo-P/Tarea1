import clases.*;
import clases.Monedas.*;
import clases.Excepciones.*;

/**
 * @author Martin Gonzalez
 * @author Roberto Cruz
 * 
 *         Clase Main que contiene el método principal para ejecutar el
 *         programa.
 *         Crea un expendedor y prueba diferentes escenarios de compra.
 */
public class Main {

    /**
     * Método principal que se ejecuta al iniciar el programa.
     * 
     * @param args los argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        Expendedor expendedor = new Expendedor(1);

        // Probar con diferentes escenarios
        probarEscenarioPagoInsuficiente(expendedor);
        probarEscenarioMonedaNula(expendedor);
        probarEscenarioMonedaIgualAlPrecio(expendedor);
        probarEscenarioSinProducto(expendedor);
    }

    /**
     * Método para probar el escenario de pago insuficiente.
     * 
     * @param exp el expendedor a utilizar.
     */
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

    /**
     * Método para probar el escenario de moneda nula.
     * 
     * @param exp el expendedor a utilizar.
     */
    private static void probarEscenarioMonedaNula(Expendedor exp) {
        try {
            Moneda moneda = null;
            Comprador comprador = new Comprador(moneda, Precios.Snickers, exp);
            System.out.println(comprador.queBebiste() + " $" + comprador.cuantoVuelto());
        } catch (PagoIncorrectoException | PagoInsuficienteException | NoHayProductoException e) {
            System.err.println(e.getMessage());
        }
    }

    /**
     * Método para probar el escenario de moneda igual al precio.
     * 
     * @param exp el expendedor a utilizar.
     */
    private static void probarEscenarioMonedaIgualAlPrecio(Expendedor exp) {
        try {
            Moneda moneda = new Moneda500();
            Comprador comprador = new Comprador(moneda, Precios.Super8, exp);
            System.out.println(comprador.queBebiste() + " $" + comprador.cuantoVuelto());
        } catch (PagoIncorrectoException | PagoInsuficienteException | NoHayProductoException e) {
            System.err.println(e.getMessage());
        }
    }

    /**
     * Método para probar el escenario sin producto.
     * 
     * @param exp el expendedor a utilizar.
     */
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