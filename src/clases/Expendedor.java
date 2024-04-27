package src.clases;
import src.clases.Dulces.*;
import src.clases.Monedas.*;
import src.clases.Bebidas.*;

class Expendedor {
    private Deposito<Bebida> coca;
    private Deposito<Bebida> sprite;
    private Deposito<Bebida> fanta;
    private Deposito<Dulce> snicker;
    private Deposito<Dulce> super8;
    private Deposito<Moneda> monedasDeVuelto;


    public Expendedor(int numEspacios) {
        coca = new Deposito<>();
        sprite = new Deposito<>();
        fanta = new Deposito<>();
        snicker = new Deposito<>();
        super8 = new Deposito<>();
        monedasDeVuelto = new Deposito<>();

        for (int i = 0; i < numEspacios; i++) {
            coca.add(new CocaCola(i));
            sprite.add(new Sprite(i));
            fanta.add(new Fanta(i));
            snicker.add(new Snickers(i));
            super8.add(new Super8(i));

        }
    }


    /*
    public Bebida comprarBebida(Moneda moneda, int tipo) {
        if (moneda == null) {
            return null;
        }
        if (moneda.getValor() < precio || (tipo != COCA && tipo != SPRITE)) {
            monedasDeVuelto.addMoneda(moneda);
            return null;
        }
        for (int i = moneda.getValor() - precio; i > 0; i -= 100) {
            monedasDeVuelto.addMoneda(new Moneda100());
        }
        Bebida auxBebida = null;
        switch (tipo) {
            case COCA:
                auxBebida = coca.getBebida();
                if (auxBebida == null) {
                    for (int i = 0; i < precio; i += 100) {
                        monedasDeVuelto.addMoneda(new Moneda100());
                    }
                }
                return auxBebida;
            case SPRITE:
                auxBebida = sprite.getBebida();
                if (auxBebida == null) {
                    for (int i = 0; i < precio; i = i + 100) {
                        monedasDeVuelto.addMoneda(new Moneda100());
                    }
                }
                return auxBebida;
            default:
                return null;
        }
    }

    public Moneda getVuelto() {
        return monedasDeVuelto.getMoneda();
    }
     */
}
