package src.clases;

class Comprador {
    private String sonido;
    private int vuelto;

    public Comprador(Moneda m, int cualBebida, Expendedor exp) {
        Bebida aux = exp.comprarBebida(m, cualBebida);

        vuelto = 0;
        do {
            Moneda auxM = exp.getVuelto();
            if (auxM == null) {
                break;
            }
            vuelto += auxM.getValor();
        } while (true);

        if (aux != null) {
            sonido = aux.beber();
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