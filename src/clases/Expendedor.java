package src.clases;
import src.clases.Dulces.*;
import src.clases.Monedas.*;
import src.clases.Bebidas.*;

class Expendedor {
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


    public Producto comprarBebida(Moneda moneda,int tipo) {
        if (moneda == null) {
            System.out.println("No ingresaste una moneda");
            return null;
        }


        switch (tipo){

            case 1: //Cocacola

                //ES MENOR EL PRECIO?
                if (Precios.CocaCola.getPrecio()>moneda.getValor()){
                    monedasDeVuelto.add(moneda);
                    System.out.println("No tiene suficiente dinero para una Cocacola.");
                    return null;
                }

                //NO HAY MAS PRODUCTOS?
                if (coca.list.isEmpty()){
                    // ACA DEBE DECIR QUE NO HAY MAS COCACOLAS
                    monedasDeVuelto.add(moneda);
                    System.out.println("No hay más Cocacolas.");
                    return null;
                }

                //SE LE DA EL VUELTO
                int vueltoCoca = moneda.getValor() - Precios.CocaCola.getPrecio();
                while (vueltoCoca > 0) {
                    monedasDeVuelto.add(new Moneda100());
                    vueltoCoca -= 100;
                }
                //SE LE DA EL PRODUCTO
                return coca.get();


            case 2: //Fanta

                //ES MENOR EL PRECIO?
                if (Precios.Fanta.getPrecio()>moneda.getValor()){
                    monedasDeVuelto.add(moneda);
                    System.out.println("No tiene suficiente dinero para una Fanta.");
                    return null;
                }
                //NO HAY MAS PRODUCTOS?
                if (fanta.list.isEmpty()){
                    monedasDeVuelto.add(moneda);
                    System.out.println("No hay más Fantas.");
                    return null;
                }

                int vueltoFanta = moneda.getValor() - Precios.Fanta.getPrecio();
                while (vueltoFanta > 0) {
                    monedasDeVuelto.add(new Moneda100());
                    vueltoFanta -= 100;
                }
                //SE LE DA EL PRODUCTO
                return fanta.get();


            case 3:
                if (Precios.Sprite.getPrecio() > moneda.getValor()) {
                    monedasDeVuelto.add(moneda);
                    System.out.println("No tiene suficiente dinero para un Sprite.");
                    return null;
                }

                if (sprite.list.isEmpty()) {
                    monedasDeVuelto.add(moneda);
                    System.out.println("No hay más Sprites.");
                    return null;
                }

                int vueltoSprite = moneda.getValor() - Precios.Sprite.getPrecio();
                while (vueltoSprite > 0) {
                    monedasDeVuelto.add(new Moneda100());
                    vueltoSprite -= 100;
                }

                return sprite.get();


            case 4:
                if (Precios.Snickers.getPrecio() > moneda.getValor()) {
                    monedasDeVuelto.add(moneda);
                    System.out.println("No tiene suficiente dinero para un Snickers.");
                    return null;
                }

                if (snickers.list.isEmpty()) {
                    monedasDeVuelto.add(moneda);
                    System.out.println("No hay más Snickers.");
                    return null;
                }

                int vueltoSnickers = moneda.getValor() - Precios.Snickers.getPrecio();
                while (vueltoSnickers > 0) {
                    monedasDeVuelto.add(new Moneda100());
                    vueltoSnickers -= 100;
                }

                return snickers.get();


            case 5:
                if (Precios.Super8.getPrecio() > moneda.getValor()) {
                    monedasDeVuelto.add(moneda);
                    System.out.println("No tiene suficiente dinero para un Super8.");
                    return null;
                }

                if (super8.list.isEmpty()) {
                    monedasDeVuelto.add(moneda);
                    System.out.println("No hay más Super8.");
                    return null;
                }

                int vueltoSuper8 = moneda.getValor() - Precios.Super8.getPrecio();
                while (vueltoSuper8 > 0) {
                    monedasDeVuelto.add(new Moneda100());
                    vueltoSuper8 -= 100;
                }

                return super8.get();


            default:
                System.out.println("Producto no reconocido.");
                return null;

        }
    }

    public Moneda getVuelto() {
        return monedasDeVuelto.get();
    }

}
