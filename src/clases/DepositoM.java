package src.clases;
import java.util.ArrayList;
class DepositoM {
    private ArrayList<Moneda> list;

    public DepositoM() {
        list = new ArrayList<Moneda>();
    }

    public void addMoneda(Moneda a) {
        list.add(a);
    }

    public Moneda getMoneda() {
        if (list.size() == 0) {
            return null;
        }
        return list.remove(0);
    }
}
