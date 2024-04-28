package clases;

import clases.Monedas.*;
import clases.Excepciones.*;

public class Comprador {
    private String sonido;
    private int vuelto;

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

    public int cuantoVuelto() {
        return vuelto;
    }

    public String queBebiste() {
        return sonido;
    }
}
