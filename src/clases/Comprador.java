package clases;

import clases.Monedas.*;
import clases.Excepciones.*;

/**
 * Clase Comprador que representa a un comprador en el sistema.
 */
public class Comprador {
    private String sonido;
    private int vuelto;

    /**
     * Constructor de la clase Comprador.
     * 
     * @param m           la moneda con la que el comprador paga.
     * @param ProdElegido el producto que el comprador ha elegido.
     * @param exp         el expendedor que vende el producto.
     * @throws PagoIncorrectoException   si el pago es incorrecto.
     * @throws PagoInsuficienteException si el pago es insuficiente.
     * @throws NoHayProductoException    si no hay producto.
     */
    public Comprador(Moneda m, Precios ProdElegido, Expendedor exp)
            throws PagoIncorrectoException, PagoInsuficienteException, NoHayProductoException {

        Producto aux = null;

        vuelto = 0;

        try {
            aux = exp.comprarBebida(ProdElegido, m);
        } catch (PagoIncorrectoException e) {
            throw new PagoIncorrectoException();
        } catch (PagoInsuficienteException e) {
            throw new PagoInsuficienteException();
        } catch (NoHayProductoException e) {
            throw new NoHayProductoException();
        }

        do {
            Moneda auxM = exp.getVuelto();
            if (auxM == null) {
                break;
            }
            vuelto += auxM.getValor();
        } while (true);

        if (aux != null) {
            sonido = aux.consumir();
        } else {
            sonido = null;
        }
    }

    /**
     * Método para obtener el vuelto del comprador.
     * 
     * @return el vuelto del comprador.
     */
    public int cuantoVuelto() {
        return vuelto;
    }

    /**
     * Método para obtener lo que el comprador bebió.
     * 
     * @return lo que el comprador bebió.
     */
    public String queBebiste() {
        return sonido;
    }
}