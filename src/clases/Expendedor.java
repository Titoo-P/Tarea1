package clases;

import clases.Dulces.*;
import clases.Excepciones.*;
import clases.Monedas.*;
import clases.Bebidas.*;

/**
 * Clase Expendedor que representa un expendedor de productos.
 * El expendedor tiene depósitos para diferentes tipos de bebidas y dulces, y un
 * depósito para monedas de vuelto.
 */
public class Expendedor {
    private Deposito<Bebida> coca;
    private Deposito<Bebida> sprite;
    private Deposito<Bebida> fanta;
    private Deposito<Dulce> snickers;
    private Deposito<Dulce> super8;
    private Deposito<Moneda> monedasDeVuelto;

    /**
     * Constructor de la clase Expendedor.
     * Inicializa los depósitos y llena cada uno con un número especificado de
     * productos.
     * 
     * @param numEspacios el número de productos para agregar a cada depósito.
     */
    public Expendedor(int numEspacios) {
        coca = new Deposito<>();
        sprite = new Deposito<>();
        fanta = new Deposito<>();
        snickers = new Deposito<>();
        super8 = new Deposito<>();
        monedasDeVuelto = new Deposito<>();

        for (int i = 0; i < numEspacios; i++) {
            coca.add(new CocaCola(i));
            sprite.add(new Sprite(i));
            fanta.add(new Fanta(i));
            snickers.add(new Snickers(i));
            super8.add(new Super8(i));
        }
    }

    /**
     * Método para comprar una bebida.
     * 
     * @param ProdElegido el producto que el cliente ha elegido.
     * @param moneda      la moneda con la que el cliente paga.
     * @return el producto comprado.
     * @throws PagoIncorrectoException   si el pago es incorrecto.
     * @throws PagoInsuficienteException si el pago es insuficiente.
     */
    public Producto comprarBebida(Precios ProdElegido, Moneda moneda)
            throws PagoIncorrectoException, PagoIncorrectoException, PagoIncorrectoException,
            PagoInsuficienteException {

        Producto producto = null;

        if (moneda == null) {
            throw new PagoIncorrectoException();
        }

        if (moneda.getValor() < ProdElegido.getPrecio()) {
            monedasDeVuelto.add(moneda);
            producto = null;
            throw new PagoInsuficienteException();
        } else if (moneda.getValor() > ProdElegido.getPrecio()) {

            int moneda100 = (moneda.getValor() - ProdElegido.getPrecio()) / 100;
            for (int i = 0; i < moneda100; i++) {
                Moneda vueltomon100 = new Moneda100();
                monedasDeVuelto.add(vueltomon100);
            }
        }

        switch (ProdElegido) {
            case CocaCola:
                producto = coca.get();
                break;
            case Sprite:
                producto = sprite.get();
                break;
            case Fanta:
                producto = fanta.get();
                break;
            case Snickers:
                producto = snickers.get();
                break;
            case Super8:
                producto = super8.get();
                break;
        }

        return producto;
    }

    /**
     * Método para obtener el vuelto.
     * 
     * @return la moneda de vuelto.
     */
    public Moneda getVuelto() {
        return monedasDeVuelto.get();
    }

    /**
     * Método para obtener el precio de un producto.
     * 
     * @param producto el producto del que se quiere obtener el precio.
     * @return el precio del producto.
     */
    public int getPrecio(Precios producto) {
        switch (producto) {
            case CocaCola:
                return Precios.CocaCola.getPrecio();
            case Sprite:
                return Precios.Sprite.getPrecio();
            case Fanta:
                return Precios.Fanta.getPrecio();
            case Snickers:
                return Precios.Snickers.getPrecio();
            case Super8:
                return Precios.Super8.getPrecio();
            default:
                return 0;
        }
    }
}