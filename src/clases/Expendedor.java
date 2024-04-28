package clases;

import clases.Dulces.*;
import clases.Excepciones.*;
import clases.Monedas.*;
import clases.Bebidas.*;

public class Expendedor {
    private Deposito<Bebida> coca;
    private Deposito<Bebida> sprite;
    private Deposito<Bebida> fanta;
    private Deposito<Dulce> snickers;
    private Deposito<Dulce> super8;
    private Deposito<Moneda> monedasDeVuelto;

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

    public Moneda getVuelto() {
        return monedasDeVuelto.get();
    }

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