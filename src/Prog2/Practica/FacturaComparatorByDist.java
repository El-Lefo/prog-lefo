package Prog2.Practica;

import java.util.Comparator;

/**
 * Created by a on 29/11/2017.
 */
public class FacturaComparatorByDist implements Comparator <Factura> {
    @Override
    public int compare(Factura o1, Factura o2) {
        if (o1.distancia < o2.distancia) return -1;

        else if (o1.distancia > o2.distancia) return +1;

        else return 0;
    }
}
