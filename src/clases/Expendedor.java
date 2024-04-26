package src.clases;

class Expendedor {
    private Deposito coca;
    private Deposito sprite;
    private DepositoM monVu;
    private int precio;

    public static final int COCA = 1;
    public static final int SPRITE = 2;

    public Expendedor(int numBebidas, int precioBebidas) {
        coca = new Deposito();
        sprite = new Deposito();
        monVu = new DepositoM();

        precio = precioBebidas;

        for (int i = 0; i < numBebidas; i++) {
            coca.add(new CocaCola(100 + i));
            sprite.add(new Sprite(200 + i));
        }
    }

    public Bebida comprarBebida(Moneda moneda, int tipo) {
        if (moneda == null) {
            return null;
        }
        if (moneda.getValor() < precio || (tipo != COCA && tipo != SPRITE)) {
            monVu.addMoneda(moneda);
            return null;
        }
        for (int i = moneda.getValor() - precio; i > 0; i -= 100) {
            monVu.addMoneda(new Moneda100());
        }
        Bebida auxBebida = null;
        switch (tipo) {
            case COCA:
                auxBebida = coca.get();
                if (auxBebida == null) {
                    for (int i = 0; i < precio; i += 100) {
                        monVu.addMoneda(new Moneda100());
                    }
                }
                return auxBebida;
            case SPRITE:
                auxBebida = sprite.get();
                if (auxBebida == null) {
                    for (int i = 0; i < precio; i = i + 100) {
                        monVu.addMoneda(new Moneda100());
                    }
                }
                return auxBebida;
            default:
                return null;
        }
    }

    public Moneda getVuelto() {
        return monVu.getMoneda();
    }
}
